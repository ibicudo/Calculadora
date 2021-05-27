package br.com.calculadoraBoot.calculadoraBoot.services;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
public class CalculadoraService {

    public static Integer calculatorAge(Integer day, Integer month, Integer year){

        LocalDate birthday = LocalDate.of(year, month, day); //specify year, month, date directly
        LocalDate now = LocalDate.now(); //gets localDate
        Period diff = Period.between(birthday, now);

        return diff.getYears();
    }
}
