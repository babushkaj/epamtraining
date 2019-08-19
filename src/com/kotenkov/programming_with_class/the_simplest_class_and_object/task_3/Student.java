package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_3;

//  Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
//  успеваемость. Создайте массив из десяти элементов такого типа.
//  Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки,
//  равные только 9 или 10.

public class Student {

    private String lastnameAndInitials;
    private int groupNumber;
    private int [] performance;

    public Student(String lastnameAndInitials, int groupNumber, int[] performance) {
        this.lastnameAndInitials = lastnameAndInitials;
        this.groupNumber = groupNumber;
        this.performance = performance;
    }

    public int[] getPerformance() {
        return performance;
    }

    public void printSurnameAndGroupNumber(){
        System.out.println(lastnameAndInitials + ", группа " + groupNumber);
    }
}
