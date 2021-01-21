package arrays;

public class secondArrays {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 10;
        }
        for (int i:nums){
            System.out.println(i);
        }
        char[] chars = new char[10];
        for(char ch: chars){
            System.out.println(ch);
        }
    }
}
