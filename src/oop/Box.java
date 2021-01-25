package oop;

public class Box {
    double width;
    double height;
    double length;

    // Constructor lessons
    // Create constructor
    Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    // Overload constructor
    Box(double size) {
        this.height = size;
        this.width = size;
        this.length = size;
    }


    // Obj in param
    Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.length = box.length;
    }

    // Create param constructor
    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box increase(int i) {
        return new Box(width * i, height * i, length * i);
    }

    // Method lessons
    void showVolume(String nameBox) {
        double volume = returnVolume();
        System.out.println(nameBox + volume);
    }

    double returnVolume() {
        return width * height * length;
    }


    // objects - param and return obj
    // var compare method
    int compare(Box box) {
        double thisVolume = returnVolume();
        double boxVolume = box.returnVolume();
        int result;
        if (thisVolume > boxVolume) {
            result = 1;
        } else if (thisVolume < boxVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}
