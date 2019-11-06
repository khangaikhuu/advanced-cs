package mn.asu.teamBread.controller;

import mn.asu.teamBread.entity.Word;
import mn.asu.teamBread.repository.WordRepository;
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
@RequestMapping("/crud/")
public class CrudPageController {
    private final WordRepository wordRepository;

    @Autowired
    public CrudPageController(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @GetMapping("signup")
    public String showSignUpForm(Word word) {
        return "AddWord";
    }

    @GetMapping("list")
    public String showUpdateForm(Model model) {
        model.addAttribute("words", wordRepository.findAll());
        return "CrudPage";
    }

    @PostMapping("add")
    public String addStudent(@Valid Word student, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "AddWord";
        }

        wordRepository.save(student);
        return "redirect:list";
    }
    @GetMapping("delete/{id}")
    public String deleteStudent(@PathVariable("id") long id, Model model) {
        Word student = wordRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        WordRepository.delete(WordRepository);
        model.addAttribute("students", WordRepository.findAll());
        return "index";
    }
    @GetMapping("edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Word student = WordRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        model.addAttribute("student", student);
        return "update-student";
    }
}
