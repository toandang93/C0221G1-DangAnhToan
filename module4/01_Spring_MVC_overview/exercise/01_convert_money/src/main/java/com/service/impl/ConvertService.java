package com.service.impl;

import com.service.IConvertService;
import org.springframework.stereotype.Service;

@Service
public class ConvertService implements IConvertService {
    @Override
    public double change(double a, double b, double c) {
        return a*c/b;
    }
}
