public class Practice {
    public static void main(String[] args) {
        System.out.println(3);

        int num1 = 7;
        int num2 = 14;
        int num3 = (num2 - num1);
        System.out.println(num3);

        double d1 = 3.1416;
        System.out.println(num1+num2 / d1);

        String myname = "Ifty";
        String wifename = "Honey";
        System.out.println(myname + " Loves " + wifename);

        int a = 8;
        int b = 15;
        int c = 11;

        if (a>b && b>c) {
            System.out.println("Sunday");
        } else if (b>a && b>c) {
            System.out.println("FUNDAY");
        } else {
            System.out.println("F*ck you");
        }

        double ifty = 3.56;
        double zia = 3.33;
        double liton = 3.93;
        double saad = 3.23;
        double hridee = 3.88;
        double mitul = 3.75;

        double grade = 4;

        if (grade >= 3.5) {
            System.out.println("Qualified for Teacher Exam");
        }

        if (ifty > 3.5) {
            System.out.println("Ifty Qualified");
        } else { System.out.println("Ifty Not Qualified");
        }

        if (zia>3.5) {
            System.out.println("Zia Qualified");
        } else {
            System.out.println("Zia Disqualified");
        }

        grade = 3.86;

        if (grade < 3.50) {
            System.out.println("Not Qualified");
        } else if (grade >=3.50 && grade <=4.00) {
            System.out.println("Qualified for Exam");
        } if (grade >=3.50 && grade <= 3.75) {
            System.out.println("Lecturer");
        } else if (grade > 3.75 && grade <= 3.90) {
            System.out.println("Assistant Prof");
        } else if (grade > 3.90 && grade <= 4.00) {
            System.out.println("Associate Prof");
        }

        String bonus1 = "5%";
        String bonus2 = "0%";
        System.out.println(bonus1);





        int servingYear = 12;
        int salary = 95000;
        double bonus = 0.05;

        if (servingYear>5 ) {
            System.out.println(salary * bonus);

        }
    }
}
