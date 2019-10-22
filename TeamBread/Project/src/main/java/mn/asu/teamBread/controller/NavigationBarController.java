package mn.asu.teamBread.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class NavigationBarController {

    @GetMapping("index")
    public String showUpdateForm(Model model) {
        return "NavigationBar";
    }
}


