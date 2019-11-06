package mn.asu.crud.team2.controller;


import mn.asu.crud.team2.entity.ValueCreationEntity;
import mn.asu.crud.team2.repository.ValueCreationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/value")
public class ValueCreationController {
    private final ValueCreationRepository valueCreationRepository;

    @Autowired
    public ValueCreationController(ValueCreationRepository valueCreationRepository) {
        this.valueCreationRepository = valueCreationRepository;
    }

    @GetMapping("/index")
    public String showValueCreationPage(Model model) {
        model.addAttribute("valueCreations", valueCreationRepository.findAll());
        return "ValueCreation";
    }

    @GetMapping("/crud")
    public String crudValueCreationPage(Model model) {
        model.addAttribute("valueCreations", valueCreationRepository.findAll());
        return "CRUDValueCreation";
    }

    @GetMapping("/signup")
    public String showSignUpForm(ValueCreationEntity valueCreationEntity) {
        return "Add-ValueCreation";
    }

    @PostMapping("/add")
    public String addStudent(@Valid ValueCreationEntity valueCreationEntity, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Add-ValueCreation";
        }

        valueCreationRepository.save(valueCreationEntity);
        return "redirect:crud";
    }
}
