package mn.controller;

import mn.entity.Words;
import mn.entity.WordsForm;
import mn.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

@Controller
@RequestMapping("/menu/")
public class ViewController {

    private final WordRepository wordRepository;
    @Autowired
    public ViewController(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @GetMapping("quiz")
    public String showQuiz(Model model) {

        model.addAttribute("words", wordRepository.findAll());

        return "quiz";
    }

    @GetMapping("dictionary")
    public String showDictionary(Model model) {
        return "dictionary";
    }

    @GetMapping("menu")
    public String showMenu(Model model) {
        return "menu";
    }

    @RequestMapping(value="/answers", method = RequestMethod.POST)
    public String processQuery(@ModelAttribute WordsForm form, Model model){
        System.out.println(form.getClientList());
        return "";
    }

}
