package ru.mirea.task19.obt2;
//отсутствие информации о студенте.
public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String message) {
        super(message);
    }
}
