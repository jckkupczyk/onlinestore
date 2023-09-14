package pl.edu.wszib.jwd.onlinestore.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.onlinestore.services.OpinionService;
import pl.edu.wszib.jwd.onlinestore.web.mappers.OpinionMapper;
import pl.edu.wszib.jwd.onlinestore.web.models.OpinionModel;

@Controller
public class OpinionController {

    private final OpinionService opinionService;
    private final OpinionMapper opinionMapper;

    public OpinionController(OpinionService opinionService, OpinionMapper opinionMapper) {
        this.opinionService = opinionService;
        this.opinionMapper = opinionMapper;
    }

    @GetMapping("/opinions")
    public String showOpinions(Model model) {
        model.addAttribute("opinions", opinionService.findAll());
        model.addAttribute("newOpinion", new OpinionModel());
        return "opinionPage";
    }


    @PostMapping("/opinions")
    public String addOpinion(@ModelAttribute("newOpinion") OpinionModel opinionModel, Model model) {
        opinionService.newOpinion(opinionModel);
        model.addAttribute("opinions", opinionService.findAll());
        model.addAttribute("newOpinion", new OpinionModel());
        return "opinionPage";
    }

}

