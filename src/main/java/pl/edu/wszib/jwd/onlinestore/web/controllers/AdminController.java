package pl.edu.wszib.jwd.onlinestore.web.controllers;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.jwd.onlinestore.services.BicycleService;
import pl.edu.wszib.jwd.onlinestore.web.models.BicycleModel;



@Controller
@RequestMapping("admin-panel")
public class AdminController {

    private final BicycleService bicycleService;

    public AdminController(BicycleService bicycleService) {
        this.bicycleService = bicycleService;
    }


    @GetMapping
    public String adminPage(Model model) {
        final var bicycles = bicycleService.findAll();

        model.addAttribute("bicycles", bicycles);

        return "adminPage";
    }


    @PostMapping("bicycle/delete/{bicycle-id}")
    public String deleteBicycle(@PathVariable("bicycle-id") Long bicycleId) {
        bicycleService.deleteById(bicycleId);

        return "redirect:/admin-panel";
    }


    @GetMapping("bicycle/create")
    public String createBicycleForm(Model model) {
        model.addAttribute("bicycle", new BicycleModel());

        return "bicyclePage";
    }


    @PostMapping("bicycle/create")
    public String createBicycle(
            @Valid @ModelAttribute("bicycle") BicycleModel bicycleModel,
            BindingResult result) {
        if (result.hasErrors()) {
            return "bicyclePage";
        } else {
            bicycleService.createBicycle(bicycleModel);
            return "redirect:/admin-panel";
        }
    }


    @GetMapping("bicycle/edit/{bicycle-id}")
    public String editBicycleForm(@PathVariable("bicycle-id") Long bicycleId, Model model) {
        final var bicycle = bicycleService.getById(bicycleId);

        model.addAttribute("bicycle", bicycle);

        return "bicyclePage";
    }

    @PostMapping("bicycle/edit/{bicycle-id}")
    public String editBicycle(@PathVariable("bicycle-id") Long bicycleId,
                              @Valid @ModelAttribute("bicycle") BicycleModel bicycleModel,
                              BindingResult result,
                              Model model) {
        if (result.hasErrors()) {
            BicycleModel bicycle = bicycleService.getById(bicycleId);
            model.addAttribute("bicycle", bicycle);

            return "bicyclePage";
        }
        else
        {
            bicycleService.editBicycle(bicycleId, bicycleModel);
            return "redirect:/admin-panel";
        }
    }
}
