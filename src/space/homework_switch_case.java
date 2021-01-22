package space;

public class homework_switch_case {
    public static void main(String[] args) {
        String nameOfMonth = "june";
        switch (nameOfMonth){
            case "january", "february", "december":
                System.out.println("winter");
                break;
            case "march", "april", "may":
                System.out.println("spring");
                break;
            case "june", "july", "august":
                System.out.println("summer");
                break;
            case "september", "october", "november":
                System.out.println("autumn");
                break;
            default:
                System.out.println("no month");
        }
    }
}
