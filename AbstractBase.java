abstract class AbstractBase {
    public void normalMethod() {
        System.out.println("This is a normal method inside an abstract class.");
    }
}

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

class Constants {
    public static final double PI = 3.14159;

    public static void printPi() {
        System.out.println("Value of PI: " + PI);
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractBase obj1 = new AbstractBase() {};
        obj1.normalMethod();

        Circle circle = new Circle(10, 20, 5);
        circle.draw();
        circle.display();

        Constants.printPi();
    }
}
