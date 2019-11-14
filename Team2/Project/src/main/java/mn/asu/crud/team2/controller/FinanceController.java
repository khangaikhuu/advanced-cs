package mn.asu.crud.team2.controller;

import mn.asu.crud.team2.entity.FinanceEntity;

import mn.asu.crud.team2.repository.FinanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
<<<<<<< HEAD
        String tag = "<h2>Finance</h2>\n" +
                "    <p>Finance means the management of large amounts of money, especially by governments and large companies. It also means all the records of money including income, spent, rent in all people, companies, and governments, etc.</p>\n" +
                "    <p>There are three main types:</p>\n" +
                "    <ol>\n" +
                "        <li>Personal finance</li>\n" +
                "        <li>Corporate finance</li>\n" +
                "        <li>Public / Government finance</li>\n" +
                "    </ol>\n" +
                "    <img src = \"https://www.barrowsinc.com/wp-content/uploads/sites/843/2013/04/Finance-Pg.-Calc.jpg\"  width = \"500px\" height = \"300px\">\n" +
                "    <h3>Personal Finance</h3>\n" +
                "    <p>Personal finance is the finance system that requires management in people’s personal activities related to money such as: investing their savings to some companies’ stocks.</p>\n" +
                "    <h4>Income</h4>\n" +
                "    <p>Income refers to the money that is received by individuals to support themselves or even their family. The common ways that people receive their income are: salary, bonus, hourly wages, pensions(money offered to some disabled people and officially retiring age), dividends(money offered to shareholders by a company).\n" +
                "    </p>\n" +
                "    <h4>Spending</h4>\n" +
                "    <p>Spending is the money that is used by individuals or in a group of people. People have spending in various ways for their needs and wants that relate to themselves or their businesses. The common ways of people’s spendings are: rent, taxes, food, entertainment, credit card payments, needs, and wants.\n" +
                "    </p>\n" +
                "    <p>People often have two ways to pay their spending: cash or credit card. Cash is the money with coins or also made in papers (even notes) to purchase goods or services. Credit is a small card offered by a bank or even in some companies; it allows the owner to purchase their goods or services with no cash.\n" +
                "    </p>\n" +1
                "    <h4>Savings</h4>\n" +
                "    <p>Saving is the important area of personal finance which means the money that is stored for future use by individuals or in a group of people. The common forms of savings are: cash and bank accounts. Savings interact with all areas of finance as it could be saved in people’s income and spend or invest them later.</p>\n" +
                "    <h5>Investing</h5>\n" +
                "    <p>Investing refers to the purchase of companies’ shares with the expectation of gaining profits. The common forms are: stocks and real estate(owning buildings or lands).</p>\n" +
                "    <h5>Protection\n" +
                "    </h5>\n" +
                "    <p>Protection money is the money providing for specific companies for individuals’ lives or needs, especially for insurances. The common forms are: health insurance and life insurance.</p>\n" +
                "    <h3>Corporate Finance</h3>\n" +
                "    <p>Corporate finance is the finance system of corporations that is used for the products or services in the companies or income, or even funding in the businesses(companies).</p>\n" +
                "    <p>There are 3 main three finance activities:</p>\n" +
                "    <ol>\n" +
                "        <li>Investments & Budgeting</li>\n" +
                "        <li>Financing</li>\n" +
                "        <li>Dividends & Return of Capital</li>\n" +
                "    </ol>\n";
        model.addAttribute("finances", tag);
=======
        model.addAttribute("finances", financeRepository.findAll());
>>>>>>> c84e2178dd6aa55da273be0b4376612665112c44
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

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        FinanceEntity finance = financeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        model.addAttribute("finance", finance);
        return "Update_Finance";
    }


    @PostMapping("/update/{id}")
    public String updateValue(@PathVariable("id") long id, @Valid FinanceEntity finance, BindingResult result,
                              Model model) {
        if (result.hasErrors()) {
            finance.setId(id);
            return "Update_Finance";
        }

        financeRepository.save(finance);
        model.addAttribute("finances", financeRepository.findAll());
        return "CRUDFinance";
    }

    @GetMapping("/delete/{id}")
    public String deleteValue(@PathVariable("id") long id, Model model) {
        FinanceEntity financeEntity = financeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid value Id:" + id));
        financeRepository.delete(financeEntity);
        model.addAttribute("finances", financeRepository.findAll());
        return "CRUDFinance";
    }

}


