package space;

public class task_one {
    public static void main(String[] args) {
        String[] nameOfMonth = {
                "january",
                "february",
                "march",
                "april",
                "may",
                "june",
                "july",
                "august",
                "september",
                "october",
                "november",
                "december"
        };
        String result = "";
        for (int i = 0; i < nameOfMonth.length; i++) {
            result += nameOfMonth[i];
            if (i == nameOfMonth.length - 1){
                result+=".";
            }else {
                result+=", ";
            }
        }
        System.out.println(result);
    }
}
