package mn.asu.crud.team2.controller;

import mn.asu.crud.team2.repository.FinanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/finance")
public class FinanceController {

    private final FinanceRepository financeRepository;

    @Autowired
    public FinanceController(FinanceRepository financeRepository) {
        this.financeRepository = financeRepository;
    }

    @GetMapping("/index")
    public String showFinancePage(Model model) {
        model.addAttribute("finances", financeRepository.findAll());
        return "Finance";
    }

    @GetMapping("/crud")
    public String crudFinancePage(Model model) {
        model.addAttribute("finances", financeRepository.findAll());
        return "CRUDFinance";
    }


}
