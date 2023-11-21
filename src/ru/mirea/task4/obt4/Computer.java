package ru.mirea.task4.obt4;

public class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }


    @Override
    public String toString() {
        return "Компьютер марки: " + brand + "\n" +
                processor.toString() + "\n" +
                memory.toString() + "\n" +
                monitor.toString();
    }
}
