package com.company;

public class Main {

    public static void main(String[] args) {
        double average = 0;// среднее арифметическое
        double sumDigits = 0; //сумма чисел
        int nomberAmount = 0;// колличество измениний переменных
        int randomNomber = (int) (Math.random() * 20);
        while (randomNomber != 0) {
            average += randomNomber;
            nomberAmount++;
            nomberAmount = (int) (Math.random() * 20);
            }
        if (nomberAmount !=0)
            {
            average = sumDigits / nomberAmount;
                {
                    System.out.println("среднее:"+average);
                }
            }
        else
            average=0;
        System.out.println("среднее:"+average);

        }
    }

