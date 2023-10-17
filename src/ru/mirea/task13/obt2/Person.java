package ru.mirea.task13.obt2;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFullName() {
        StringBuilder fullNameBuilder = new StringBuilder(lastName);

        if (firstName != null && !firstName.isEmpty()) {
            fullNameBuilder.append(" ").append(firstName.charAt(0)).append(".");
        }

        if (middleName != null && !middleName.isEmpty()) {
            fullNameBuilder.append(" ").append(middleName.charAt(0)).append(".");
        }

        return fullNameBuilder.toString();
    }
}
