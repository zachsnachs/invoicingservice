package c322.homework.homework6.partb;

import java.awt.*;

public class ShapeTestDrive {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.orange)
                ),

                new CompoundShape(
                        new Circle(35, 30, 40, Color.YELLOW),
                        new Dot(145, 122, Color.black)
                )
        );
    }
}