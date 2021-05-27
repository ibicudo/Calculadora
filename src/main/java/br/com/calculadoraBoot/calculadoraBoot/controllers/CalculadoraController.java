package br.com.calculadoraBoot.calculadoraBoot.controllers;

import br.com.calculadoraBoot.calculadoraBoot.services.CalculadoraService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CalculadoraController {

    @GetMapping("/{day}/{month}/{year}")
    public int calculateAge(@PathVariable Integer day, @PathVariable Integer month, @PathVariable Integer year){
        return CalculadoraService.calculatorAge(day, month, year);
    }

    @ResponseBody
    @GetMapping("/")
    public int calculate(@RequestParam Integer day, @RequestParam Integer month, @RequestParam Integer year){
        return CalculadoraService.calculatorAge(day, month, year);
    }
}
