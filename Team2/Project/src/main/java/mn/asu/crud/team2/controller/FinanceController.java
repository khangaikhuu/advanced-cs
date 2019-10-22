package mn.asu.crud.team2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/finance")
public class FinanceController {
    @GetMapping("/index")
    public String showFinancePage(Model model) {
        return "Finance";
    }
}
