package pl.edu.wszib.jwd.onlinestore.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.jwd.onlinestore.services.BicycleService;
import pl.edu.wszib.jwd.onlinestore.web.models.BicycleModel;

import java.util.List;

@Controller
public class OfferController {

    private final BicycleService bicycleService;

    public OfferController(BicycleService bicycleService) {
        this.bicycleService = bicycleService;
    }

    @GetMapping("offer")
    public String offerPage(Model model) {
        List<BicycleModel> bicycles = bicycleService.findAll();

        model.addAttribute("bicycles", bicycles);

        return "offerPage";
    }
}

