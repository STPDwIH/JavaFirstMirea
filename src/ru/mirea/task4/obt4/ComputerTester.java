package ru.mirea.task4.obt4;
public class ComputerTester {

    public static void main(String[] args) {
        // Создаем компьютер и его компоненты
        Processor processor = new Processor("Intel Core i7", 3.2);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("Dell UltraSharp", 27.0);
        Computer computer = new Computer(ComputerBrand.Asus, processor, memory, monitor);

        // Выводим информацию о компьютере
        System.out.println(computer);
    }
}
