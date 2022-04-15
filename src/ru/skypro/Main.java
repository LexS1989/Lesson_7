package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    // Задача №1.

        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
//        fullName = fullName.replace("ё", "е"); // удобнее произвести замену в начале чем в задаче №3
        System.out.println("ФИО сотрудника — " + fullName);

        // Задача №2.

        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

        // Задача №3

        fullName = fullName.replace("Ё", "Е");
        fullName = fullName.replace("ё", "е"); // на случай если отменить перевод в верхний регистр
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}
