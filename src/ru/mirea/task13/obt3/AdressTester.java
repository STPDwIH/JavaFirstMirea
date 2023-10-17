package ru.mirea.task13.obt3;

public class AdressTester {
    public static void main(String[] args) {
        String addressStr1 = "Россия[d]Московская область[d]Москва[d]Борисовские пруды[d]13[d]1[d]159";
        String addressStr2 = "США[d]Калифорния[d]Лос-Анджелес[d]Санта-Моника бульвар[d]555[d][d]";
        String addressStr3 = "Великобритания[d]Англия[d]Лондон[d]Оксфорд стрит[d]321[d][d]1A";

        Address address1 = new Address(addressStr1);
        Address address2 = new Address(addressStr2);
        Address address3 = new Address(addressStr3);


        System.out.println("Адрес 1:");
        System.out.println(address1);
        System.out.println();

        System.out.println("Адрес 2:");
        System.out.println(address2);
        System.out.println();

        System.out.println("Адрес 3:");
        System.out.println(address3);
        System.out.println();
    }
}
