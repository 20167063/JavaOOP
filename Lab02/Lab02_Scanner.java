
package week2;

import java.util.Scanner;

public class Scanner {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("What's your name ?");
        String strName = keyBoard.nextLine();
        keyBoard = new Scanner(System.in);
        System.out.println("How old are you ?");
        int iAge = keyBoard.nextInt();
        System.out.println("How tall are you ?");
        keyBoard = new Scanner(System.in);
        double dHeight = keyBoard.nextDouble();
        System.out.println("Mrs/Ms. "+ strName + " , " + iAge + " , " + dHeight);
    }
}