package c322.homework.homework6.partb;

import java.awt.*;

public class Dot extends BaseShape {
    private final int DOT_SIZE = 3;

    public Dot(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public int getWidth() {
        return DOT_SIZE;
    }

    @Override
    public int getHeight() {
        return DOT_SIZE;
    }

    @Override
    public void draw(Graphics graphics) {
        super.draw(graphics);
        graphics.fillRect(x - 1, y - 1, getWidth(), getHeight());
    }
}