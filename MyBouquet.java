package week1.day2.homework.flowers;

import java.util.ArrayList;

/**
 * Created by Andriy on 25.10.2016.
 */
public class MyBouquet {
    public static void main(String[] args){

        //Создать несколько объектов-цветов.
        System.out.println("Here are some flowers:");

        Chrysanthemum chr = new Chrysanthemum(1, 15, 1);
        System.out.println(chr);

        Rose rose = new Rose();
        System.out.println(rose);

        Rose rose2 = new Rose();
        System.out.println(rose2);

        Rose rose3 = new Rose(1, 25, 5);
        System.out.println(rose3);

        //Собрать букет (используя аксессуары) с  определением его стоимости.
        System.out.println("Bouquet with accessories and it's price:");
        Bouquet myBouquet = new Bouquet(3, 0, 2, 1, 0, 1, true, true, false);
        System.out.println(myBouquet);
        System.out.println("This bouquet price is $" + myBouquet.getPrice() + ".");

        //Провести сортировку цветов в букете на основе уровня свежести.
        System.out.println("Sorted bouquet by freshness of flowers:");
        myBouquet.sortFlowers();
        System.out.println(myBouquet);
        System.out.println("This bouquet price is $" + myBouquet.getPrice() + ".");

        //Найти цветок в  букете, соответствующий заданному диапазону длин стеблей.
        System.out.println("Here we find flowers in our bouquet with given stem length:");
        System.out.println(myBouquet.findStemLength(30, 60));


    }
}
