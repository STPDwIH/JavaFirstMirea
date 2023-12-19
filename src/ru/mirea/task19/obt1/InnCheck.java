package ru.mirea.task19.obt1;

import java.math.BigInteger;
import java.util.Scanner;

//мой ИНН 773773998057 для проверки

public class InnCheck {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер ИНН");
            try{
                BigInteger inn = new BigInteger(scaner.nextLine());
                checkInn(inn);
                break;
            }catch (INNException e){
                System.out.println(e.getLocalizedMessage());
            }
        }
        System.out.println("ИНН действителен");
    }

    public static void checkInn(BigInteger inn) throws INNException {
        int i = 0;
        BigInteger cInn = new BigInteger(inn.toByteArray());
        while(!cInn.equals(new BigInteger("0"))){
            i++;
            cInn = new BigInteger(cInn.divide(new BigInteger("10")).toByteArray());
        }
        if(i != 10 && i != 12) throw new INNException(inn);
    }
}
