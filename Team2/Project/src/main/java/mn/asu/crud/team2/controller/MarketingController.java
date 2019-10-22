package mn.asu.crud.team2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/marketing")
public class MarketingController {
    @GetMapping("/index")
    public String showMarketingPage(Model model) {
        return "Marketing";
    }
}
