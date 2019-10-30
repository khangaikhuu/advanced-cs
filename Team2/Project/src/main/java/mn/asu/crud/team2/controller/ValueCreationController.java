package mn.asu.crud.team2.controller;

import mn.asu.crud.team2.repository.MarketingRepository;
import mn.asu.crud.team2.repository.ValueCreationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/value")
public class ValueCreationController {

    @Autowired
    public ValueCreationController(ValueCreationRepository valueCreationRepository) {
        this.ValueCreationRepository = valueCreationRepository;
    }

    @GetMapping("/index")
    public String showValueCreationPage(Model model) {
        model.addAttribute("valueCreations", ValueCreationRepository.findAll());
        return "ValueCreation";
    }
}
