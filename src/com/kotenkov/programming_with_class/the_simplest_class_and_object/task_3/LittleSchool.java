package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_3;

//  Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
//  успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
//  Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки,
//  равные только 9 или 10.

public class LittleSchool {

    private int [] ivanovPerformance = {6,7,8,9,10};
    private Student ivanov = new Student("Иванов И. И.", 1, ivanovPerformance);

    private int [] petrovPerformance = {8,7,8,7,8};
    private Student petrov = new Student("Петров П. П.", 1, petrovPerformance);

    private int [] sidorovPerformance = {9,10,9,10,9};
    private Student sidorov = new Student("Сидоров С. С.", 1, sidorovPerformance);

    private int [] semenovPerformance = {9,5,7,8,9};
    private Student semenov = new Student("Семёнов С. С.", 1, semenovPerformance);

    private int [] nikolaevPerformance = {9,5,7,8,9};
    private Student nikolaev = new Student("Николаев Н. Н.", 1, nikolaevPerformance);

    private int [] aleksandrovPerformance = {4,5,6,6,5};
    private Student aleksandrov = new Student("Александров А. А.", 2, aleksandrovPerformance);

    private int [] borisovPerformance = {9,9,10,9,9};
    private Student borisov = new Student("Борисов Б. Б.", 2, borisovPerformance);

    private int [] vladimirovaPerformance = {9,10,9,10,9};
    private Student vladimirova = new Student("Владимирова В. В.", 2, vladimirovaPerformance);

    private int [] germanovaPerformance = {9,5,7,8,9};
    private Student germanova = new Student("Германова Г. Г.", 2, germanovaPerformance);

    private int [] leonidovaPerformance = {9,5,7,8,9};
    private Student leonidova = new Student("Леонидова Л. Л.", 2, leonidovaPerformance);

    private Student [] students = {ivanov, petrov, sidorov, semenov, nikolaev,
                           aleksandrov, borisov, vladimirova, germanova, leonidova};


    public void showExcellentStudents(){
        System.out.println("Наши отличники:");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            boolean isExcellentStudent = true;
            int [] studentsPerformance = s.getPerformance();
            for (int j = 0; j < studentsPerformance.length; j++) {
                if(studentsPerformance[j] < 9){
                    isExcellentStudent = false;
                    break;
                }
            }
            if(isExcellentStudent){
                s.printSurnameAndGroupNumber();
            }
        }
    }

}
