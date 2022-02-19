package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите имя полбзователя:");

        Scanner name = new Scanner(System.in);
        String phrase1 = name.nextLine();
        System.out.print("Здравствуйте ");
        System.out.println(phrase1);

    }
}
