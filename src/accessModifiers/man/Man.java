package accessModifiers.man;

public class Man {
    private String name;
    private int age;


    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show_info() {
        System.out.println(name);
        System.out.println(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("age need > 0");
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


}
