package com.example.imperial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImperialCalculatorController {

    ImperialCalculator a=new ImperialCalculator();

    @RequestMapping("/centimeter")
    public double centimeter(int in){
        return  a.centimeter(in);
    }

}
