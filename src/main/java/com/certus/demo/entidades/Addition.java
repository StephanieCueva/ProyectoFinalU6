package com.certus.demo.entidades;


import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;


@Data

public class Addition {
    private int num1;
    private int num2;


    public Integer Calc(){
        return num1 + num2;
    }
}

