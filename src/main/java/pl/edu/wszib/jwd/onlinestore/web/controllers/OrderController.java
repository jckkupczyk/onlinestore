package pl.edu.wszib.jwd.onlinestore.web.controllers;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.onlinestore.services.BicycleService;
import pl.edu.wszib.jwd.onlinestore.services.OrderService;
import pl.edu.wszib.jwd.onlinestore.web.models.BicycleModel;
import pl.edu.wszib.jwd.onlinestore.web.models.OrderAddressModel;

@Controller
public class OrderController {

    private final BicycleService bicycleService;
    private final OrderService orderService;

    public OrderController(BicycleService bicycleService, OrderService orderService){
    this.bicycleService = bicycleService;
    this.orderService = orderService;
    }

    @GetMapping("order/{bicycle-id}")
    public String orderForm(@PathVariable("bicycle-id") Long bicycleId, Model model) {
        BicycleModel bicycle = bicycleService.getById(bicycleId);

        model.addAttribute("orderAddress", new OrderAddressModel());
        model.addAttribute("bicycle", bicycle);

        return "orderPage";
    }

    @PostMapping("order/{bicycle-id}")

    public String order(@PathVariable("bicycle-id") Long bicycleId,

                        @Valid @ModelAttribute("orderAddress") OrderAddressModel orderAddressModel,
                        BindingResult result,
                        Model model) {
        if (result.hasErrors()) {
            BicycleModel bicycle = bicycleService.getById(bicycleId);
            model.addAttribute("bicycle", bicycle);

            return "orderPage";
        }

        final var orderId = orderService.saveOrder(bicycleId, orderAddressModel);

        model.addAttribute("orderId", orderId);
        model.addAttribute("bicycleId", bicycleId);

        return "orderConfirmationPage";
    }

    @PostMapping("order/delete/{bicycle-id}/{order-id}")
    public String deleteOrder(@PathVariable("bicycle-id") Long bicycleId, @PathVariable("order-id") Long orderId) {
        orderService.deleteOrderById(bicycleId, orderId);

        return "orderCancellingPage";
    }
}


