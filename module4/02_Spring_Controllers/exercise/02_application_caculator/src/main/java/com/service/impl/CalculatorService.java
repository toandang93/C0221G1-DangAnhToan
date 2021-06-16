package com.service.impl;

import org.springframework.stereotype.Service;
import com.service.ICalculatorService;

@Service
public class CalculatorService implements ICalculatorService {
    @Override
    public String calculator(double num1, double num2, String calculator) {
        String result ="";
        switch (calculator) {
            case "+":
                result = "Addition :"+ (num1 + num2);
                break;
            case "-":
                result = "Subtraction :"+ (num1 - num2);
                break;
            case "*":
                result = "Multiplication :" +(num1 * num2);
                break;
            case "/":
                result = "Division :" +(num1 / num2);
                break;
        }
        return result;
    }
}