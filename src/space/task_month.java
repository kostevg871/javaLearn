package space;

public class task_month {
    public static void main(String[] args) {
        int numberOfMonth = 6;
        switch (numberOfMonth) {
            case 1 -> System.out.println("january");
            case 2 -> System.out.println("february");
            case 3 -> System.out.println("march");
            case 4 -> System.out.println("april");
            case 5 -> System.out.println("may");
            case 6 -> System.out.println("june");
            case 7 -> System.out.println("july");
            case 8 -> System.out.println("august");
            case 9 -> System.out.println("september");
            case 10 -> System.out.println("october");
            case 11 -> System.out.println("november");
            case 12 -> System.out.println("december");
            default -> System.out.println("no month");
        }
    }
}
