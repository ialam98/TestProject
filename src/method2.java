public class method2 {
    public static void main(String[] args) {

        addSum(4,3);
        addSum(7,7,7);
        addSum(7, 9.5);


    }

    public static void addSum(int num1, int num2) {
        System.out.println("sum is "+ (num1+num2) );
    }

    public static void addSum (int num1, int num2,int num3){
        addSum(4,4);
        System.out.println("sum is "+ (num1+num2+num3));
    }

    public static void addSum (int num1, double num2) {
        System.out.println("sum is "+ (num1+num2));
    }
}
