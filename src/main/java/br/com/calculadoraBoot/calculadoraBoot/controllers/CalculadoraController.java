package br.com.calculadoraBoot.calculadoraBoot.controllers;

import br.com.calculadoraBoot.calculadoraBoot.services.CalculadoraService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CalculadoraController {

    @GetMapping("/{day}/{month}/{year}")
    public int calculateAge(@PathVariable Integer day, @PathVariable Integer month, @PathVariable Integer year){
        return CalculadoraService.calculatorAge(day, month, year);
    }
}
