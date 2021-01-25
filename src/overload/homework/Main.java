package overload.homework;

public class Main {
    public static void main(String[] args) {
        Monster monster = new Monster(2);
        monster.voice(5, "LOL");
        System.out.println(monster.number_of_legs);

    }
}
