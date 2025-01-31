package shapes;

public class Rectangle extends Graphic {
    @Override
    public void draw() {
        System.out.printf("Draw rectangle from (%d, %d) to (%d, %d)%n", x1, y1, x2, y2);
    }
}
