public class Variables2 {
    public static void main(String[] args) {
        int i = 10;
        i = i++;

        System.out.println(i++);
        System.out.println(i);

        System.out.println(19%3);  //mod


        if (i%2==1) {    // To find odd or even number or find remainder
            System.out.println(i + "is an odd number");
        } else {
            System.out.println(i + "is an even number");
        }

        i= -50;

        if (i>=0) { // To find out positive or negative number
            System.out.println(i + " is a positive number");
        } else {
            System.out.println(i + " is a negative number");
        }



        int weekday = 5;

        if (weekday == 1){
            System.out.println("Monday");
        } else if (weekday == 2) {
            System.out.println("Tuesday");
        } else if (weekday == 3) {
            System.out.println("Wednesday");
        } else if (weekday == 4) {
            System.out.println("Thursday");
        } else if (weekday == 5) {
            System.out.println("Friday");
        } else if (weekday == 6) {
            System.out.println("Saturday");
        } else if (weekday == 7) {
            System.out.println("Sunday");
        }


        //LOOP Starts




    }
}
