package mn.asu.teamBread.controller;

import mn.asu.teamBread.entity.Word;
import mn.asu.teamBread.repository.WordRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
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


        int size = 0;
        if (repository.findAll() instanceof Collection<?>) {
            size = ((Collection<?>) repository.findAll()).size();
        }
        Random rnd = new Random();
        long randomIndex = 0;
        if (size != 0)
        {
            randomIndex = rnd.nextInt(size);
        }


        if (randomIndex > 0){
            model.addAttribute("words", repository.findById(randomIndex).get());
        }
        return "LearnPage";
    }
}
