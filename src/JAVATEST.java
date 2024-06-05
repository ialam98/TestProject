public class JAVATEST {
    public static void main(String[] args) {

        int [] nums = {2,6,5,3,6,2,2,2,1,2,2};

        int count = 0;


        for (int i =0; i< nums.length-1;i++) {
            if (nums[i]==2 && nums[i+1]==2) {
                count++;
            }
        } System.out.println(count);
    }
}
