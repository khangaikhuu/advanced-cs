package mn.asu.crud.team2.controller;


import mn.asu.crud.team2.entity.MarketingEntity;
import mn.asu.crud.team2.repository.MarketingRepository;
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
@RequestMapping("/marketing")
public class MarketingController {

    private final MarketingRepository marketingRepository;

    @Autowired
    public MarketingController(MarketingRepository marketingRepository) {
        this.marketingRepository = marketingRepository;
    }

    @GetMapping("/index")
    public String showMarketingPage(Model model) {
        String tag = "<h2>Marketing</h2>\n" +
                "<h3>What is Marketing?</h3>\n" +
                "<p>Marketing consists of activities conducted with the aim of promoting and advertising a company’s product or service. Expertises in the marketing sector strive to attract the attention of  key audiences by promotions and advertisements. Marketing advertisements may utilize endorsements, slogans, media exposure and graphic designs.</p>\n" +
                "<p>The core incentive of marketing is to create a relationship between the company and their customers. This relationship serves as a tool to enhance profitability through coordinating a consumer to their preferred product or service. Networking with potential customers is an important element of marketing as it allows the company to “stay in touch” with the customer. Examples of networking might include: thank you emails, promotional deals, replying to emails or calls etc.</p> \n" +
                "<h3>Inside Marketing</h3>\n" +
                "<p>The 4 Ps of marketing make up the essential factors required for the implementation of marketing in any business. The idea of the Four Ps were first initiated by American academic, Neil Borden in the 1950’s. </p>\n" +
                "<h2>The Four Ps Structure</h2>\n" +
                "<img src = \"https://www.thebalancesmb.com/thmb/6ZbMKo0nsD5aBdBt_ZV4Rcc2Cew=/1500x1000/filters:no_upscale():max_bytes(150000):strip_icc()/what-is-marketing-2296057_v4-5b631edc46e0fb005076a299.png\" width = \"500px\" height = \"300px\">" +
                "<h3>Product -</h3>\n" +
                "<p>Product is defined as any tangible item offered by businesses to customers.  Products are ultimately produced to enhance and fulfill consumer demand. Prior to any promotional activities, it is crucial for businesses to understand the full functionality of their product and how it stands out from other existing products.</p>\n" +
                "<h3>Price -</h3>\n" +
                "<p>Price is the value companies offer in exchange for their product, Pricing decisions should consider production and distribution price in relation to the price of competing products in the industry. Companies should take note of the affordability of their products when introduced to potential customers. Price decisions will determine supply, demand, and overall marketing strategy.</p>\n" +
                "<h3>Place -</h3>\n" +
                "<p>Place is how the product is distributed to consumers. This may include the location of the selling point and the delivery of the product. The core objective of business owners is locating products where it will bring the maximum profit (consumers).</p>\n" +
                "<h3>Promotion -</h3>\n" +
                "<p>The last ‘P’ is what comes after all the decisions making up a product is ready and can be advertised to customers. Promotions may include activities such as special offers, promotion deals, advertising and more. Promotion falls under the communication section of marketing as a whole.</p>\n" +






        model.addAttribute("marketings", marketingRepository.findAll());
        return "Marketing";
    }

    @GetMapping("/crud")
    public String crudMarketingPage(Model model) {
        model.addAttribute("marketings", marketingRepository.findAll());
        return "CRUDMarketing";
    }

    @GetMapping("/signup")
    public String showSignUpForm(MarketingEntity marketingEntity) {

        return "Add-Marketing";
    }


    @PostMapping("/add")
    public String addMarketing(@Valid MarketingEntity marketingEntity, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Add-Marketing";
        }

        marketingRepository.save(marketingEntity);
        return "redirect:crud";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        MarketingEntity marketing = marketingRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        model.addAttribute("marketing", marketing);
        return "Update-Marketing";
    }


    @PostMapping("/update/{id}")
    public String updateMarketing(@PathVariable("id") long id, @Valid MarketingEntity marketing, BindingResult result,
                                  Model model) {
        if (result.hasErrors()) {
            marketing.setId(id);
            return "Update-Marketing";
        }

        marketingRepository.save(marketing);
        model.addAttribute("marketings", marketingRepository.findAll());
        return "CRUDMarketing";
    }

    @GetMapping("/delete/{id}")
    public String deleteMarketing(@PathVariable("id") long id, Model model) {
        MarketingEntity marketingEntity = marketingRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid marketing Id:" + id));
        marketingRepository.delete(marketingEntity);
        model.addAttribute("marketings", marketingRepository.findAll());
        return "CRUDMarketing";
    }

}

