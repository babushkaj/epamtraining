package com.kotenkov.string_and_basic_of_text_processing.regular_expression.task_2;

//<notes>
//  <note id = "1">
//      <to>Вася</to>
//      <from>Света</from>
//      <heading>Напоминание</heading>
//      <body>Позвони мне завтра!</body>
//  </note>
//  <note id = "2">
//      <to>Петя</to>
//      <from>Маша</from>
//      <heading>Важное напоминание</heading>
//      <body/>
//  </note>
//</notes>

// Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа
// и его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми
// парсерами XML для решения данной задачи нельзя.

public class StartParser {
    public static void main(String[] args) {

        String s = "<notes>\n" +
                   "\t<note id = \"1\">\n" +
                   "\t\t<to>Вася</to>\n" +
                   "\t\t<from>Света</from>\n" +
                   "\t\t<heading>Напоминание</heading>\n" +
                   "\t\t<body>Позвони мне завтра!</body>\n" +
                   "\t</note>\n" +
                   "\t<note id = \"2\">\n" +
                   "\t\t<to>Петя</to>\n" +
                   "\t\t<from>Маша</from>\n" +
                   "\t\t<heading>Важное напоминание</heading>\n" +
                   "\t\t<body/>\n" +
                   "\t</note>\n" +
                   "</notes>";

        System.out.println(s + "\n");
        Parser p = new Parser(s);
        p.startParsing();

    }


}
