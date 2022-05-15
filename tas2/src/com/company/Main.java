package com.company;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void sol(SimpleLinkedList list, String podstr) throws SimpleLinkedList.SimpleLinkedListException {
        SimpleLinkedList<String> listdop = new SimpleLinkedList<>();        //создаём дополнительный ссаный список
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String e = it.next();
            if (e.contains(podstr)) {                                 //сравниваем каждый элемент первого списка с подстрокой
                System.out.println("В строке " + e + " содержится подстрока " + podstr);
                listdop.addLast(e);                                   //если подстрока содержетится в элементе списка, то добавляем в дополнительный список
            } else System.out.println("В строке " + e + " нету такой подстроки :(");
        }


        System.out.println("------------------------------------");

        if (listdop.size() == 0) {                                     //проверяем, пуст ли ссаный список
            System.out.println("В списке нет этой ссаной подстроки :)");
        } else {
            System.out.print("Получившийся список: ");
            for (int i = 0; i < listdop.size(); i++) {                      //выводим дополнительный список
                System.out.print(listdop.get(i) + " ");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите подстроку: ");
        String podstr = scan.nextLine();
        System.out.println("------------------------------------");

        SimpleLinkedList<String> list = new SimpleLinkedList<>();           //создаём ссаный список
        list.addLast("Privet");                                    //Добавляем элементы в список
        list.addLast("Poka");
        list.addLast("This");
        list.addLast("siss");

        System.out.print("Изначальный список: ");
        for (int i = 0; i < list.size(); i++) {                             //выводим первый список
            System.out.print((i > 0 ? ", " : "") + list.get(i));
        }
        System.out.println();
        System.out.println("------------------------------------");
        sol(list,podstr);
    }
}