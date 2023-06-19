package com.calculator.calculator.service.impl;

import com.calculator.calculator.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int plus (int a, int b) {
        return a + b;
    }
    @Override
    public int minus (int a, int b) {
        return a - b;
    }
    @Override
    public int multiply (int a, int b) {
        return a * b;
    }
    @Override
    public int divide (int a, int b) {
        return a / b;
    }
}
