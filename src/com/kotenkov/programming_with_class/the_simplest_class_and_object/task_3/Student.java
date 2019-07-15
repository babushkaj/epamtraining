package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_3;

//  Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
//  успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
//  Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки,
//  равные только 9 или 10.

public class Student {

    private String surnameAndInitials;
    private int groupNumber;
    int [] performance;

    public Student(String surnameAndInitials, int groupNumber, int[] performance) {
        this.surnameAndInitials = surnameAndInitials;
        this.groupNumber = groupNumber;
        this.performance = performance;
    }

    public int[] getPerformance() {
        return performance;
    }

    public void printSurnameAndGroupNumber(){
        System.out.println(surnameAndInitials + ", группа " + groupNumber);
    }
}
