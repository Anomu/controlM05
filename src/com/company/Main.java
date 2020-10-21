package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejemplo ejemplo = new Ejemplo();

        ejemplo.numero1=scanner.nextInt();
        ejemplo.numero2=scanner.nextInt();
        
        ejemplo.suma();
    }
}
