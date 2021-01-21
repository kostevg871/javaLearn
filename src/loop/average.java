package loop;

public class average {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        float average = sum / (float)i;
        System.out.println(average);
    }
}
