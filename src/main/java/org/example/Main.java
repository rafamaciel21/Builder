package org.example;

import org.example.Builder.Carro;
import org.example.Builder.VeiculoBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var carro = VeiculoBuilder.builder()
                .marca("Chevrolet")
                .modelo("Astra")
                .ano(2008)
                .km(80000)
                .valor(23200.02)
                .build();

        System.out.println(carro);

        var carro2 = VeiculoBuilder.builder()
                .marca("Chevrolet")
                .modelo("Cruze")
                .ano(2008)
                .build();

        System.out.println(carro2);

    }
}