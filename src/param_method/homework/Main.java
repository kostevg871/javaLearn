package param_method.homework;

public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect();
        rect.setDimens(20, 20);
        System.out.println("Perimeter rectangle = " + rect.perimeter());
        System.out.println("Square rectangle = " + rect.square());
    }
}
