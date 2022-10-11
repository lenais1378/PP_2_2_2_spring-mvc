package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.Arrays;

@Controller
@RequestMapping("/cars")
public class CarController {
    private CarServiceImp carServiceImp;
    @GetMapping(value = "/cars")
    @RequestParam (value = "count", defaultValue = "5")
    public String carsList(int id, ModelMap model) {
        model.addAttribute("cars", Arrays.asList());
        return "cars";
    }


}
