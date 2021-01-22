package space;

public class HomeWork_if_else {
    public static void main(String[] args) {
        String nameMonth = "september";
        if (nameMonth.equals("january")||nameMonth.equals("february")||nameMonth.equals("december")){
            System.out.println("winter");
        }else if(nameMonth.equals("march")||nameMonth.equals("april")||nameMonth.equals("may")){
            System.out.println("spring");
        }else if(nameMonth.equals("june")||nameMonth.equals("july")||nameMonth.equals("august")){
            System.out.println("summer");
        }else if(nameMonth.equals("september")||nameMonth.equals("october")||nameMonth.equals("november")){
            System.out.println("autumn");
        }else{
            System.out.println("no month");
        }
    }
}
