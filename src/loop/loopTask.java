package loop;

// print all even numbers from 1000 to 0
public class loopTask {
    public static void main(String[] args) {
        int i = 1000;
        while (i >= 0){
            if (i%2 == 0){
                System.out.println(i);
            }
            i--;
        }
    }
}
