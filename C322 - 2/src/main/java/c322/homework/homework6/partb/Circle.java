package c322.homework.homework6.partb;

import java.awt.*;

public class Circle extends BaseShape {
    public int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        return radius * 2;
    }

    @Override
    public int getHeight() {
        return radius * 2;
    }

    public void draw(Graphics graphics) {
        super.draw(graphics);
        graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1);
    }
}