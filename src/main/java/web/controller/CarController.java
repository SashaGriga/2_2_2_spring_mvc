package web.controller;

import web.service.CarServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false) Integer num, ModelMap model) {
        List<Car> carList;
        if (num != null) {
            carList = new CarServiceImpl().numCars(num);
        } else {
            carList = new CarServiceImpl().getCars();
        }
        model.addAttribute("carList", carList);
        return "Cars";
    }
}
