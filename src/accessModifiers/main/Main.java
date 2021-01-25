package accessModifiers.main;

import accessModifiers.man.Man;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Ivan", 27);
        man.show_info();
        man.setAge(29);
        System.out.println(man.getAge());
        System.out.println(man.getName());
    }
}
