package mn.asu.crud.team2.controller;

import mn.asu.crud.team2.entity.BusinessEntity;
import mn.asu.crud.team2.repository.BusinessRepository;
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
@RequestMapping("/business")
public class businessController {
    private final BusinessRepository businessRepository;

    @Autowired
    public businessController(BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }


    @GetMapping("/index")
    public String showMarketingPage(Model model) {
        model.addAttribute("businesses", businessRepository.findAll());
        return "Business";
    }

    @GetMapping("/crud")
    public String crudIndexPage(Model model) {
        model.addAttribute("businesses", businessRepository.findAll());
        return "CRUDBusiness";
    }

    @GetMapping("/signup")
    public String showSignUpForm(BusinessEntity businessEntity) {
        return "Add-Business";
    }

    @PostMapping("/add")
    public String addStudent(@Valid BusinessEntity businessEntity, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Add-Business";
        }

        businessRepository.save(businessEntity);
        return "redirect:crud";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        BusinessEntity business = businessRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid business Id:" + id));
        model.addAttribute("business", business);
        return "Update-Business";
    }


    @PostMapping("/update/{id}")
    public String updateBusiness(@PathVariable("id") long id, @Valid BusinessEntity business, BindingResult result,
                              Model model) {
        if (result.hasErrors()) {
            business.setId(id);
            return "Update-Business";
        }

        businessRepository.save(business);
        model.addAttribute("businesses", businessRepository.findAll());
        return "CRUDBusiness";
    }

    @GetMapping("/delete/{id}")
    public String deleteBusiness(@PathVariable("id") long id, Model model) {
        BusinessEntity businessEntity = businessRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid business Id:" + id));
        businessRepository.delete(businessEntity);
        model.addAttribute("business", businessRepository.findAll());
        return "CRUDBusiness";
    }
}
