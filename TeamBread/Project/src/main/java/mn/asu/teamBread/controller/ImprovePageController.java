package mn.asu.teamBread.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/improve")

public class ImprovePageController {

    @GetMapping("/improvePage")
    public String showImprovePage(Model model) {
        return "ImprovePage";
    }
}
