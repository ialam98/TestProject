public class Array {
    public static void main(String[] args) {

//        int [] nums = new int[5];
//        nums [0] = 9;
//        nums [1] = 10;
//        nums [4] = 11;
//        System.out.println(nums[4]);

        int[] numbers = {4, 2, 6, 8, 3, 7, 3, 5};

        System.out.println(numbers[3]);
        System.out.println(numbers.length);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i]; {
            }
        } System.out.println(sum);

        // Find the highest value inside the array

        int max = 0;

        for (int h=0; h< numbers.length; h++) {
            if (numbers[h]>max) {
                max = numbers[h];
            }
        }
        System.out.println(max);


        }
    }

