package com.kotenkov.basics_of_oop.task_4;

// Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
// дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
// выбора сокровищ на заданную сумму.

import com.kotenkov.basics_of_oop.task_4.entity.Cave;
import com.kotenkov.basics_of_oop.task_4.menu.MenuLogic;
import com.kotenkov.basics_of_oop.task_4.preparation.CavesFiller;

public class MainTask4 {

    public static void main(String[] args) {
        Cave c = new Cave();
        CavesFiller cf = new CavesFiller(c);
        cf.fillTheCave();

        MenuLogic ml = new MenuLogic(c);

        ml.doMenuLogic();
    }

}
