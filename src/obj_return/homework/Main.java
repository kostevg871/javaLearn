package obj_return.homework;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(5,5,5);
        Box box2 = new Box(2,2,2);
        Box box3 = box1.dimension_equals(box2);
        Box box4 = new Box(box1, box3);
        box1.showVolume();
        box2.showVolume();
        box3.showVolume();
        double volumeSum = box1.returnVolume() + box3.returnVolume();
        System.out.println(volumeSum);
        box4.showVolume();

    }
}
