package loop;

public class loop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 1000) {
            System.out.println(i);
            i++;
            if (i == 5) {
                break;
            }
        }
    }
}
