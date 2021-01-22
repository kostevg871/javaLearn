package oop.homework;

public class Dog {
    String name;
    String breed;
    int speed;

    void run() {
        String runString = "";
        for (int i = 0; i < speed; i++){
            if (i == speed -1){
                runString += "Run.";
            }else{
                runString += "Run, ";
            }
        }
        System.out.println(runString);

    }

    String info() {
        return name + " " + breed + " " + speed;
    }
}
