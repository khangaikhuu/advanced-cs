package mn.asu.teamBread.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/improve")

public class ImprovePageController {


    @GetMapping("index")
    public String showUpdateForm(Model model) {
        return "NavigationBar";
    }

    private ArrayList<String> wordsToImprove = new ArrayList<>();

    @GetMapping("/improvePage")
    public String showImprovePage(Model model) {
        wordsToImprove.add("Hello");
        model.addAttribute("improve", wordsToImprove);
        return "ImprovePage";
    }


}