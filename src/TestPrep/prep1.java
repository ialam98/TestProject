package TestPrep;

import java.util.Scanner;

public class prep1 {
    public static void main(String[] args) {


//            Scanner scan1 = new Scanner(System.in);
//            System.out.println("Enter the Day number");
//
//            int day = scan1.nextInt();
//
//            switch (day) {
//                case 1:
//                    System.out.println("Today is Monday");
//                    break;
//
//                case 2:
//                    System.out.println("Today is Tuesday");
//                    break;
//
//                case 3:
//                    System.out.println("Today is Wednesday");
//                    break;
//
//                case 4:
//                    System.out.println("Today is Thursday");
//                    break;
//
//                case 5:
//                    System.out.println("Today is Friday");
//                    break;
//
//                case 6:
//                    System.out.println("Today is Saturday");
//                    break;
//
//                case 7:
//                    System.out.println("Today is Sunday");
//                    break;
//
//                default:
//                    System.out.println("Tumi ekta bokachoda");
//
//        }


        int sum=0;
        for (int i=1; i<=100; i++) {
            if(i%2==0) {
                sum = sum+i;
            }
        }
        System.out.println(sum);

        int count = 0;

        for (int i =1911; i<=2024; i++) {
            if (i%4==0) {
                count++;
            }
        }
        System.out.println(count);

        int year = 0;

        for (int i =1911; i<=2024; i++) {
            if (i%4==0) {
                year++;
                System.out.println("year " + year + " is : " + i);
            }
        }
    }
}
