package param_method.homework;

public class Rect {
    int width;
    int height;

    void setDimens(int width, int height){
        this.width = width;
        this.height = height;
    }

    int perimeter(){
        return width + height;
    }

    int square(){
        return width * height;
    }
}
