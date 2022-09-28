import java.util.Scanner;

public class swichcase {
    public static void main(String[] args) {
//Exercitiul 2 bootcamp SwichCase
//        Scanner in = new Scanner(System.in);
//        System.out.println("Luna");
//        int luna = in.nextInt();
//    switch (luna){
//        case 1:
//        System.out.println("Case1: Value is: Ianuarie are 31 de zile");
//        break;
//        case 2:
//       System.out.println("Case2: Value is: Februarie are 28 de zile");
//       break;
//        case 3:
//        System.out.println("Case3: Value is: Martie are 31 de zile");
//        break;
//        default:
//            System.out.println("default: Value is: erori");

//    EX3: write a java program to display for first 100 numbers all odd numbers (nr impare)
//    1,3,5,7,9....99

        for (int i = 1; i < 100; i++) {
//i++=ordine crescatoare
            if (i % 2 == 1) {
//                i modul impartit la 2 | 1(afiseaza nr impare , 0 afiseaza numere pare);
                System.out.println("The value of i is: " + i);
            }


        }
    }
}