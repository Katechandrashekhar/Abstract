package main;

import shapes.Graphic;
import shapes.Line;
import shapes.Rectangle;

public class Main {
    // Utility method to create and draw a shape
    static void drawUtil(Graphic shape, int x1, int y1, int x2, int y2) {
        shape.setStart(x1, y1);
        shape.setEnd(x2, y2);
        shape.draw();
    }

    public static void main(String[] args) {
        // Create a Line object and draw it
        Graphic line = new Line();
        drawUtil(line, 10, 20, 30, 40);

        // Create a Rectangle object and draw it
        Graphic rectangle = new Rectangle();
        drawUtil(rectangle, 5, 5, 25, 30);
    }
}
