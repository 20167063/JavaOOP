package week2;

import java.util.Scanner;

public class DayYear {
    private int month;
    private int year;

    public DayYear() {
    }

    public DayYear(int month, int day) {
        this.month = month;
        this.year = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth() {
        while (true) {
            String month;
            System.out.println("Input day and year : ");
            month = new Scanner(System.in).nextLine();
            switch (month) {
                case "1":
                case "January":
                case "Jan":
                    this.month = 1;
                    break;
                case "February":
                case "Feb":
                case "2":
                    this.month = 2;
                    break;
                case "3":
                case "March":
                case "Mar":
                    this.month = 3;
                    break;
                case "4":
                case "April":
                case "Apr":
                    this.month = 4;
                case "5":
                case "May":
                    this.month = 5;
                    break;
                case "6":
                case "June":
                case "Jun":
                    this.month = 6;
                    break;
                case "7":
                case "July":
                case "Jul":
                    this.month = 7;
                    break;
                case "August":
                case "Aug":
                case "8":
                    this.month = 8;
                    break;
                case "9":
                case "September":
                case "Sep":
                    this.month = 9;

                    break;
                case "10":
                case "October":
                case "Oct":
                    this.month = 10;
                    break;
                case "11":
                case "November":
                case "Nov":
                    this.month = 11;
                    break;
                case "12":
                case "December":
                case "Dec":
                    this.month = 12;
                    break;
                default:
                    break;
            }
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        while (true) {
            System.out.println("Input year");
            int y = new Scanner(System.in).nextInt();
            if (y > 99 && y < 1999) {
                this.year = y;
                break;
            }
        }
    }

    public void getDate() {
        int ck = 0;
        if (year % 4 == 0)
            if( year % 100 != 0 && year % 400 != 0)
                ck = 1;
            else ck = 0;
        switch (year){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
                case 10:
            case 12:
                System.out.println("Day : 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Day : 30");
                break;
            case 2:
                System.out.println("Day : " + (ck==1?29:28));
        }
    }
}
