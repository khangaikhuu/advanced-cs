package mn.asu.crud.team2.controller;

import mn.asu.crud.team2.entity.BusinessEntity;
import mn.asu.crud.team2.repository.BusinessRepository;
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
@RequestMapping("/business")
public class businessController {
    private final BusinessRepository businessRepository;

    @Autowired
    public businessController(BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }


    @GetMapping("/index")
    public String showMarketingPage(Model model) {
<<<<<<< HEAD
        String tag = "<h1>Business</h1>\n" +
            "<h1>Business</h1> \n" +
            "<p>A business is an economic system or organization where commercial activities of selling and producing goods and services are conducted. Most businesses operate for profit, however, non-profit businesses exist commonly to serve for a charitable cost. There are several forms of businesses. The most common forms are; partnership, corporation, and sole proprietorship.</p> \n" +
            "<p>In order to generate profit, businesses aim to attain investment and a level of customers where its output ensures an earning. </p> \n" +
            "<h3>Nature of Business</h3> \n" +
            "<p>In its essence, most businesses begin with an idea or concept in which an entrepreneur takes a risk to implement it to society. Research is vital to starting a business as it serves to the foundation of success. Businesses craft a business plan in which the core goals and objectives of the business is outlined. The legal part of the business depends on what type of structure it is. </p> \n " +
            "<img src = \"https://assets.bwbx.io/images/users/iqjWHBFdfxIU/ioHOe1ivIiUU/v2/1200x-1.jpg\" width = \"500px\" height = \"300px\"> \n" +
            "<h4>Pontificia Fonderia Marinelli</h4> \n" +
            "<a href = \"https://en.wikipedia.org/wiki/Pontificia_Fonderia_Marinelli\"> More Information </a>
            "<p class = \"b\"> In 1040, the Marinelli Bell Foundry was established by the successor Pontificia Fonderia Marinelli. The Bell Foundry is considered as Italy's first family business and one of the oldest foundries in the world. </p> \n" +
            "<h3>Business Structures</h3> \n" +
            "<h4>Partnership - </h4> \n" +
            "<p>A partnership is where two or more people join to operate a business together. Members of the partnership would contribute capital and resources to the business. They also are required to share the losses and profit of the business.</p> \n" +
            "<h4>Corporation -</h4> \n" +
            "<p>A corporation is where multiple people represent a single organization/entity. Most corporations consist of shareholders who attain a section of the entity’s stocks. Shareholders are not responsible for the debts of the corporation allowing them to freely loan, sue, sign contracts etc. </p> \n" +
            "<h4>Sole Proprietorship -</h4> \n" +
            "<p>A sole proprietorship is a business run and operated by a single person. All the taxes and legal responsibilities of  the business is directly managed by the single owner.</p> \n" +
            "<h3>Importance of Business</h3> \n" +
            "<p>Businesses are essential to a country’s economy as it provides goods, services, and job opportunities. The production and exchange of goods and services also assist in the expansion of a market, meeting the expectations, demands, of customers inside and outside of the country. </p> \n" +
            "<p>Certain businesses will partner with specialized institutions and commercial banks in order to receive provision of credit, authorizing them to trade and do business at a larger scale.</p> \n" +
            "<p>With the expansion and commencement of new businesses, comes the opportunity for employment along with the introduction of new innovative products that will lead a country towards establishing a more stable economy.Businesses also provides a source of revenue to the state, paying portions of taxes that go into building more infrastructure having more advancements in technology, and towards the populations education.</p>\n" +
=======
>>>>>>> c84e2178dd6aa55da273be0b4376612665112c44
        model.addAttribute("businesses", businessRepository.findAll());
        return "index";
    }

    @GetMapping("/crud")
    public String crudIndexPage(Model model) {
        model.addAttribute("businesses", businessRepository.findAll());
        return "CRUDBusiness";
    }

    @GetMapping("/signup")
    public String showSignUpForm(BusinessEntity businessEntity) {
        return "Add-Business";
    }

    @PostMapping("/add")
    public String addStudent(@Valid BusinessEntity businessEntity, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Add-Business";
        }

        businessRepository.save(businessEntity);
        return "redirect:crud";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        BusinessEntity business = businessRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid business Id:" + id));
        model.addAttribute("business", business);
        return "Update-Business";
    }


    @PostMapping("/update/{id}")
    public String updateBusiness(@PathVariable("id") long id, @Valid BusinessEntity business, BindingResult result,
                              Model model) {
        if (result.hasErrors()) {
            business.setId(id);
            return "Update-Business";
        }

        businessRepository.save(business);
        model.addAttribute("businesses", businessRepository.findAll());
        return "CRUDBusiness";
    }

    @GetMapping("/delete/{id}")
    public String deleteBusiness(@PathVariable("id") long id, Model model) {
        BusinessEntity businessEntity = businessRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid business Id:" + id));
        businessRepository.delete(businessEntity);
        model.addAttribute("business", businessRepository.findAll());
        return "CRUDBusiness";
    }
}
