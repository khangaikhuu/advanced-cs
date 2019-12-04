package mn.controller;

import mn.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        Random rnd = new Random();
        Iterator it = wordRepository.findAll().iterator();
        int length = 0;
        while(it.hasNext())
        {
            System.out.println(length);
            length+=1;
        }
        int index = rnd.nextInt(length - 1);
        long i = (long) index;
        model.addAttribute("words", wordRepository.findById(i));
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


}
