package mn.asu.crud.team2.controller;


import mn.asu.crud.team2.entity.MarketingEntity;
import mn.asu.crud.team2.repository.MarketingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/marketing")
public class MarketingController {

    private final MarketingRepository marketingRepository;

    @Autowired
    public MarketingController(MarketingRepository marketingRepository) {
        this.marketingRepository = marketingRepository;
    }

    @GetMapping("/index")
    public String showMarketingPage(Model model) {
        model.addAttribute("marketings", marketingRepository.findAll());
        return "Marketing";
    }

    @GetMapping("/crud")
    public String crudMarketingPage(Model model) {
        model.addAttribute("marketings", marketingRepository.findAll());
        return "CRUDMarketing";
    }

    @GetMapping("/signup")
    public String showSignUpForm(MarketingEntity marketingEntity) {

        return "Add-Marketing";
    }

    @PostMapping("/add")
    public String addMarketing(@Valid MarketingEntity marketingEntity, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Add-Marketing";
        }

        marketingRepository.save(marketingEntity);
        return "redirect:crud";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        MarketingEntity marketing = marketingRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        model.addAttribute("marketing", marketing);
        return "Update-Marketing";
    }


    @PostMapping("/update/{id}")
    public String updateMarketing(@PathVariable("id") long id, @Valid MarketingEntity marketing, BindingResult result,
                                  Model model) {
        if (result.hasErrors()) {
            marketing.setId(id);
            return "Update-Marketing";
        }

        marketingRepository.save(marketing);
        model.addAttribute("marketing", marketingRepository.findAll());
        return "CRUDMarketing";
    }

    @GetMapping("/delete/{id}")
    public String deleteMarketing(@PathVariable("id") long id, Model model) {
        MarketingEntity marketingEntity = marketingRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid marketing Id:" + id));
        marketingRepository.delete(marketingEntity);
        model.addAttribute("marketings", marketingRepository.findAll());
        return "CRUDMarketing";
    }
}

