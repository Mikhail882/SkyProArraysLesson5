package com.skypro;

public class Main {

    public static void main(String[] args) {
        //Задача 1
        int[] figure = new int[3];
        figure[0] = 1;
        figure[1] = 2;
        figure[2] = 3;
        float[] fractional = {1.57f, 7.654f, 9.986f};
        int[] arbitrary = {1, 2, 3, 4, 5};

        //Задача 2
        System.out.println(figure[0] + ", " + figure[1] + ", " + figure[2]);
        System.out.println(fractional[0] + ", " + fractional[1] + ", " + fractional[2]);
        System.out.println(arbitrary[0] + ", " + arbitrary[1] + ", " + arbitrary[2] + ", " + arbitrary[3] + ", " + arbitrary[4]);

        //Задача 3
        System.out.println(figure[2] + ", " + figure[1] + ", " + figure[0]);
        System.out.println(fractional[2] + ", " + fractional[1] + ", " + fractional[0]);
        System.out.println(arbitrary[4] + ", " + arbitrary[3] + ", " + arbitrary[2] + ", " + arbitrary[1] + ", " + arbitrary[0]);

        //Задача 4
        for (int i = 0; i < figure.length; i++) {
            if (figure[i] % 2 != 0) {
                figure[i] = figure[i] + 1;
            } else if (figure[i] % 2 == 0) {
            }
            System.out.print(figure[i] + ", ");
        }
    }
}
