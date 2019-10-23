public class Rectangle {
    private int height, width;

    Rectangle(int _height, int _width) {
        height = _height;
        width = _width;
    }

    int getArea() {
        return height * width;
    }

    int getPerimeter() {
        return 2 * (height + width);
    }

    void Draw() {
        for (int x = 0; x < width; x++) {
            System.out.print('*');
        }
        System.out.println();
        for (int x = 0; x < height - 2; x++) {
            System.out.print('*');
            for (int y = 0; y < width - 2; y++) {
                System.out.print(' ');
            }
            System.out.println('*');
        }
        for (int x = 0; x < width; x++) {
            System.out.print('*');
        }
        System.out.println();
    }
}

class TestRectangle {
    static public void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println("Area:"+rectangle.getArea());
        System.out.println("Perimeter:"+rectangle.getPerimeter());
        rectangle.Draw();
    }
}