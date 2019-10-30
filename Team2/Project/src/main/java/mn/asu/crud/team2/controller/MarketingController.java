package mn.asu.crud.team2.controller;

import mn.asu.crud.team2.repository.MarketingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/marketing")
public class MarketingController {
    private final MarketingRepository marketingRepository;

    @Autowired
    public MarketingController(MarketingRepository marketingRepository) {
        this.marketingRepository = marketingRepository;
    }


    @GetMapping("/index")
    public String showMarketingPage(Model model) {
        model.addAttribute("marketings", marketingRepository.findAll());
        return "Marketing";
    }
}
