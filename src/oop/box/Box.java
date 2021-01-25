package oop.box;

public class Box {
    private double width;
    private double height;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Constructor lessons
    // Create constructor
    public Box() {
        this.width = 0;
        this.height = 0;
        this.length = 0;
    }

    // Overload constructor
    public Box(double size) {
        this.height = size;
        this.width = size;
        this.length = size;
    }


    // Obj in param
    public Box(Box box) {
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

    public void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box increase(int i) {
        return new Box(width * i, height * i, length * i);
    }

    // Method lessons
    public void showVolume(String nameBox) {
        double volume = returnVolume();
        System.out.println(nameBox + volume);
    }

    public double returnVolume() {
        return width * height * length;
    }


    // objects - param and return obj
    // var compare method
    public int compare(Box box) {
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
