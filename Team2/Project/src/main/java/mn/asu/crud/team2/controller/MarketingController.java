package mn.asu.crud.team2.controller;


import mn.asu.crud.team2.entity.MarketingEntity;
import mn.asu.crud.team2.repository.MarketingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
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
    public String addStudent(@Valid MarketingEntity marketingEntity, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Add-Marketing";
        }

        marketingRepository.save(marketingEntity);
        return "redirect:crud";
    }

}
