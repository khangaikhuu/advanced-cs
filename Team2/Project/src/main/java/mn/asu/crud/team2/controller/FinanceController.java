package mn.asu.crud.team2.controller;

import mn.asu.crud.team2.entity.FinanceEntity;
import mn.asu.crud.team2.entity.MarketingEntity;
import mn.asu.crud.team2.repository.FinanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

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

    @GetMapping("/signup")
    public String showSignUpForm(FinanceEntity financeEntity) {

        return "Add-Finance";
    }
    @PostMapping("/add")
    public String addStudent(@Valid FinanceEntity financeEntity, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Add-Finance";
        }

        financeRepository.save(financeEntity);
        return "redirect:crud";
    }

}


