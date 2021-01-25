package obj_return.homework;

public class Box {
    double height;
    double weight;
    double length;

    Box(double height, double weight, double length) {
        this.length = length;
        this.height = height;
        this.weight = weight;
    }

    Box(Box box1, Box box2) {
        this.height = box1.height + box2.height;
        this.weight = box1.weight + box2.weight;
        this.length = box1.length + box2.length;
    }

    void showVolume() {
        double volume = returnVolume();
        System.out.println(volume);
    }

    double returnVolume() {
        return weight * height * length;
    }


    Box dimension_equals(Box box) {
        return new Box(this.height + box.height, this.weight + box.weight, this.length + box.length);
    }
}
