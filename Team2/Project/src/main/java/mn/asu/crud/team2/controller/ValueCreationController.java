package mn.asu.crud.team2.controller;


import mn.asu.crud.team2.entity.ValueCreationEntity;
import mn.asu.crud.team2.repository.ValueCreationRepository;
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
@RequestMapping("/value")
public class ValueCreationController {
    private final ValueCreationRepository valueCreationRepository;

    @Autowired
    public ValueCreationController(ValueCreationRepository valueCreationRepository) {
        this.valueCreationRepository = valueCreationRepository;
    }

    @GetMapping("/index")
    public String showValueCreationPage(Model model) {

        String tag = "<h1>Value Creation</h1>\n" +
                "<p>Value Creation is the primary objective of any business institution. A fundamental concept in which value is created and delivered in a well-organized manner, in order to produce ‘profits after cost.’ The development of value creation in products and services are in accordance to the new innovative ways ‘businesses can take advantage of new materials, technologies, and processes.’</p>\n"  +
                "<p>The entire purpose of this process is to generate a product that has an output ‘more valuable’ than its input. </p> \n"  +
                "<p>By creating value for customers, stock prices increase, guaranteeing availability in the investment of capital to fund operations; helping to establish value for shareholders. </p> \n"  +
                "<p>While work is what influences and determines the value of a product, which can be done mechanically or conceptually, revenue is what measures value creation. It helps assess the floor of a product’s value, ensuring that consumers will purchase it, while estimating how much is to be demanded.</p> \n"  +
                "<img src = \"https://www.advantageperformance.com/wp-content/uploads/2015/01/decision-mojo-featured.jpg\" width = \"500px\" height = \"300px\"> \n"  +

                "<h3>Significance of Value Creation</h3> \n"  +
                "<p>Recent studies are suggesting that value creation be more frequently used during business management as it was proven to outperform strict financial measures of performance. \n"  +
                "<p>It is known to be a better alternative to strict financial measures of performance as it avoids cost-cutting, by making investments which help to promote ‘long term competitiveness and growth’, rather than producing short term results. </p> \n"  +
                "<h3>Primary activities that make up Value Creation</h3> \n"  +
                "<p>Inbound Logistics - A method in which inputs are received, stored, and distributed internally. </p> \n"  +
                "<p>Operations - A system that changes the input values into outputs, creating value. </p> \n"  +
                "<p>Outbound Logistics  - This particular activity is what delivers a consumer their product and or service</p> \n"  +
                "<p>Marketing & Sales - A process that persuades consumers to purchase from you instead of your competitors, in accordance to the benefits you offer, and how well you communicate them.’</p> \n"  +
                "<p>Service - Tasks that help a client maintain the value of your product or service.</p> \n"  +

        model.addAttribute("valueCreations", valueCreationRepository.findAll());
        return "ValueCreation";
    }








    @GetMapping("/crud")
    public String crudValueCreationPage(Model model) {
        model.addAttribute("valueCreations", valueCreationRepository.findAll());
        return "CRUDValueCreation";
    }

    @GetMapping("/signup")
    public String showSignUpForm(ValueCreationEntity valueCreationEntity) {
        return "Add-ValueCreation";
    }

    @PostMapping("/add")
    public String addStudent(@Valid ValueCreationEntity valueCreationEntity, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Add-ValueCreation";
        }

        valueCreationRepository.save(valueCreationEntity);
        return "redirect:crud";
    }
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        ValueCreationEntity valueCreation = valueCreationRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        model.addAttribute("valueCreation", valueCreation);
        return "Update-ValueCreation";
    }


    @PostMapping("/update/{id}")
    public String updateValue(@PathVariable("id") long id, @Valid ValueCreationEntity valueCreation, BindingResult result,
                                Model model) {
        if (result.hasErrors()) {
            valueCreation.setId(id);
            return "Update-ValueCreation";
        }

        valueCreationRepository.save(valueCreation);
        model.addAttribute("valueCreations", valueCreationRepository.findAll());
        return "CRUDValueCreation";
    }

    @GetMapping("/delete/{id}")
    public String deleteValue(@PathVariable("id") long id, Model model) {
        ValueCreationEntity valueCreationEntity = valueCreationRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid value Id:" + id));
        valueCreationRepository.delete(valueCreationEntity);
        model.addAttribute("valueCreations", valueCreationRepository.findAll());
        return "CRUDValueCreation";
    }

}
