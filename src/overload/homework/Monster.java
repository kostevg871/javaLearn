package overload.homework;

public class Monster {
    int number_of_eyes;
    int number_of_hands;
    int number_of_legs;

    Monster() {
        this.number_of_eyes = 2;
        this.number_of_hands = 2;
        this.number_of_legs = 2;
    }

    public Monster(int number_of_eyes) {
        this.number_of_eyes = number_of_eyes;
        this.number_of_hands = 2;
        this.number_of_legs = 2;
    }

    public Monster(int number_of_eyes, int number_of_hands) {
        this.number_of_eyes = number_of_eyes;
        this.number_of_hands = number_of_hands;
        this.number_of_legs = 2;
    }

    public Monster(int number_of_eyes, int number_of_hands, int number_of_legs) {
        this.number_of_eyes = number_of_eyes;
        this.number_of_hands = number_of_hands;
        this.number_of_legs = number_of_legs;
    }


    void voice() {
        System.out.println("Vote");
    }

    void voice(int i) {
        for (int c = 0; c < i; c++) {
            System.out.println("Vote");
        }
    }

    void voice(int i, String word) {
        for (int c = 0; c < i; c++) {
            System.out.println(word);
        }
    }

}
