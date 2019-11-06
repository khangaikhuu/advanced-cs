package mn.asu.crud.team2.controller;

import mn.asu.crud.team2.entity.BusinessEntity;
import mn.asu.crud.team2.repository.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
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
        model.addAttribute("indexs", businessRepository.findAll());
        return "index";
    }

    @GetMapping("/crud")
    public String crudIndexPage(Model model) {
        model.addAttribute("indexs", businessRepository.findAll());
        return "CRUDIndex";
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
}
