package com.example.imperial;

import org.springframework.web.bind.annotation.RequestParam;

public class ImperialCalculator {

    public double centimeter(@RequestParam double in){
        return  in * 2.54;
    }
}
