package mn.asu.teamBread.controller;

import mn.asu.teamBread.entity.Word;
import mn.asu.teamBread.repository.WordRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@RequestMapping("/learn")

public class LearnPageController {

    private final WordRepository repository;

    public LearnPageController(WordRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/learnPage")
    public String showImprovePage(Model model) {


        repository.findAll();
        Random rand = new Random();

        long id = rand.nextInt(10);

        model.addAttribute("words", repository.findById(id));
        return "LearnPage";
    }
}
