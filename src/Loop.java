public class Loop {
    public static void main(String[] args) {


        for(int i = 1; i<=5; i=i+1) {
            System.out.print("Hello");
            System.out.println(" New York ");
            System.out.println("value of i:" + i);
        }

        for(int i = 1; i<=3; i=i+1) {
            System.out.print("Hello");
            System.out.println(" New York ");
            System.out.println("value of i:" + i);
        }


        for(int i = 3; i<=15; i=i+1) {
            System.out.println(i);
        }

        for (int i = 0; i<=5; i++) {
            System.out.println(i);

            if (i==3){
                continue;
            }
            System.out.println("end "+ i);
            System.out.println("end2 "+ i);
        }

    }
}
