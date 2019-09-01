package Generics;

import java.util.ArrayList;

public class Main {
      public static void main(String[] args) {
//            the aim of reducing bugs and adding an extra layer of abstraction over types.
            ArrayList<Integer> items = new ArrayList<>();
            items.add(1);
            items.add(2);
            items.add(3);
//            items.add("da");
            items.add(4);
            items.add(5);

            printDoubled(items);
      }

      private static void printDoubled(ArrayList<Integer> n) {
            for(int i : n) {
                  System.out.println( i * 2);
            }
      }
}
