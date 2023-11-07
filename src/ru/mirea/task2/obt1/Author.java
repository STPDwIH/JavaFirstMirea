package ru.mirea.task2.obt1;

public class Author {
    private String name; //private значит что она доступна только внутри этого класса
    private String email;
    private char gender;

    // Конструктор класса Author
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Метод для получения имени автора
    public String getName() {
        return name;
    }

    // Метод для получения электронной почты автора
    public String getEmail() {
        return email;
    }

    // Метод для установки электронной почты автора
    public void setEmail(String email) {
        this.email = email;
    }

    // Метод для получения пола автора
    public char getGender() {
        return gender;
    }

    // Метод для представления автора в виде строки
    public String toString() {
        return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}
