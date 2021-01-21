package arrays;

public class homeWork {
    public static void main(String[] args) {
        int[] firstArray = new int[900];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i + 100;
        }
        int[] secondArray = new int[firstArray.length];
        for (int i = 0, j = firstArray.length - 1; i < firstArray.length; i++, j--) {
            secondArray[j] = firstArray[i];
        }
        for(int i: secondArray){
            System.out.println(i);
        }
    }
}
