package mn.asu.teamBread.controller;

import mn.asu.teamBread.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/know")

public class KnowPageController {

    private final WordRepository wordRepository;

    @Autowired
    public KnowPageController(WordRepository  wordRepository) {
        this.wordRepository = wordRepository;
    }

    @GetMapping("/knowPage")
    public String showImprovePage(Model model) {
        model.addAttribute("words", wordRepository.findAll());
        return "KnowPage";
    }
}
