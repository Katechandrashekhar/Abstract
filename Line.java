package shapes;

public class Line extends Graphic {
    @Override
    public void draw() {
        System.out.printf("Draw line from (%d, %d) to (%d, %d)%n", x1, y1, x2, y2);
    }
}
