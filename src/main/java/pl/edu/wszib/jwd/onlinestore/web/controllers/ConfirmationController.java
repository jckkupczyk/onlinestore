package pl.edu.wszib.jwd.onlinestore.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.edu.wszib.jwd.onlinestore.services.BicycleService;
import pl.edu.wszib.jwd.onlinestore.services.OrderService;
import pl.edu.wszib.jwd.onlinestore.web.models.BicycleModel;


@Controller
public class ConfirmationController {

    private final BicycleService bicycleService;
    private final OrderService orderService;

    public ConfirmationController(BicycleService bicycleService, OrderService orderService) {
        this.bicycleService = bicycleService;
        this.orderService = orderService;
    }

    @GetMapping("details/{bicycle-id}")
    public String detailsPage(@PathVariable("bicycle-id") Long bicycleId, Model model) {
        BicycleModel bicycle = bicycleService.getById(bicycleId);

        model.addAttribute("bicycle", bicycle);
        model.addAttribute("bicycleId", bicycleId);

        return "orderDetailsPage";
    }

}

