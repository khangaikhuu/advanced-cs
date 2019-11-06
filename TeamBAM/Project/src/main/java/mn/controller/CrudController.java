package mn.controller;

import mn.entity.Words;
import mn.repository.WordRepository;
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
@RequestMapping("/words/")
public class CrudController {
    private final WordRepository wordRepository;
    @Autowired
    public CrudController(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @GetMapping("list")
    public String showUpdateForm(Model model) {
        model.addAttribute("words", wordRepository.findAll());
        return "CrudWord";
    }
    @PostMapping("add")
    public String addStudent(@Valid Words word, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addWord";
        }

        wordRepository.save(word);
        return "redirect:list";
    }
    @GetMapping("signup")
    public String addWordTwo(Words word) {
        return "addWord";
    }

    @PostMapping("update/{id}")
    public String updateStudent(@PathVariable("id") long id, @Valid Words words, BindingResult result, Model model) {
        if (result.hasErrors()) {
            words.setId(id);
            return "updateWord";
        }

        wordRepository.save(words);
        model.addAttribute("words", wordRepository.findAll());
        return "CrudWord";
    }

    @GetMapping("delete/{id}")
    public String deleteStudent(@PathVariable("id") long id, Model model) {
        Words words = wordRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        wordRepository.delete(words);
        model.addAttribute("words", wordRepository.findAll());
        return "CrudWord";
    }
}
