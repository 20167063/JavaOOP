package week2;


import java.util.Scanner;

public class TamGiac {
    public static void main(String[] args) {
        int h;
        System.out.printf("Input h of triangle : ");
        h = new Scanner(System.in).nextInt();
        for (int i = 0; i <h;i++){
            kt(30-i);
            s(2*i +1 );
            System.out.println();
        }
    }
    public static void kt(int i){
        while(i-- > 0)
            System.out.printf(" ");
    }
    public static void s(int i){
        while(i-- > 0)
            System.out.printf("*");
    }
}
