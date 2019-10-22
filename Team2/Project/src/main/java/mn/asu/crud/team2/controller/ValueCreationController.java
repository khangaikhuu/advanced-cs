package mn.asu.crud.team2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/value")
public class ValueCreationController {
    @GetMapping("/index")
    public String showValueCreationPage(Model model) {
        return "ValueCreation";
    }
}
