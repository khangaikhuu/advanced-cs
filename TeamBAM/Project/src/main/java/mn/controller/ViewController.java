package mn.controller;

import mn.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

        int size = 0;
        if (wordRepository.findAll() instanceof Collection<?>) {
            size = ((Collection<?>)wordRepository.findAll()).size();
        }
        Random rnd = new Random();
        long randomIndex = 0;
        if (size != 0)
        {
             randomIndex = rnd.nextInt(size);
        }

//        while(it.hasNext())
//        {
//            length+=1;
//        }
//        int index = rnd.nextInt(length - 1);
//        long i = (long) index;
        if (randomIndex > 0){
            model.addAttribute("words", wordRepository.findById(randomIndex).get());
        }
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
