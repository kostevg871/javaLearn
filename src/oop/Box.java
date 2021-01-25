package oop;

public class Box {
    double width;
    double height;
    double length;

    void setDimens(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    // Method lessons
    void showVolume(String nameBox) {
        double volume = width * height * length;
        System.out.println(nameBox + volume);
    }

    double returnVolume() {
        return width * height * length;
    }
}
