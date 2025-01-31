abstract class AbstractShape {
    protected int x, y;

    public AbstractShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();

    public final void display() {
        System.out.println("This is a final method inside an abstract class.");
    }
}

class Circle extends AbstractShape {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing Circle at (%d, %d) with radius %d%n", x, y, radius);
    }
}

class Rectangle extends AbstractShape {
    private int width, height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing Rectangle from (%d, %d) with width %d and height %d%n", x, y, width, height);
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractShape shape1 = new Circle(10, 20, 5);
        AbstractShape shape2 = new Rectangle(5, 5, 15, 10);

        shape1.draw();
        shape1.display();

        shape2.draw();
        shape2.display();
    }
}
