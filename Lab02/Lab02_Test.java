package Lab02;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String input = null;
        int i = 10;
        String month;
        while(i-- > 0){
            System.out.printf("Input month : ");
            month = new Scanner(System.in).nextLine();
            switch (month.toLowerCase()){
                case "1":
                case "january":
                case "jan":
                    System.out.println("Thang 1");
                    break;
                case "february":
                case "feb":
                case "2":
                    System.out.println("Thang 2");
                    break;
                case "3":
                case "march":
                case "mar":
                    System.out.println("Thang 3");
                    break;
                default:
                    System.out.println("Error");
            }
        }
   }
}
