package mn.controller;

import mn.entity.Words;
import mn.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/words")
public class CrudController {
    private final WordRepository wordRepository;
    @Autowired
    public CrudController(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @GetMapping("signup")
    public String showSignUpForm(Words student) {
        return "add-student";
    }

    @GetMapping("/list")
    public String showUpdateForm(Model model) {
        model.addAttribute("words", wordRepository.findAll());
        return "CrudWord";
    }

}
