package space;

public class space {
    public static void main(String[] args) {
        int[] nums = new int[12];
        nums[0] = 10;
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int[] daysOnMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i : daysOnMonth) {
            System.out.println(i);
        }
        String s = "Hello world!";
        System.out.println(s);
        String name = "Albert";
        int age = 33;
        String result = "Hello \"" + name + "\"! \nyou " + age + " age.";
        System.out.println(result);
    }
}
