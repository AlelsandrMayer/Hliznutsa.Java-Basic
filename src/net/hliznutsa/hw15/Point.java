package net.hliznutsa.hw15;

import java.util.Objects;

public class Point implements Cloneable {
    private int x;
    private int y;

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    static double pointDistance(int firstX, int firstY, int secondX, int secondY) {
        int summaX = firstX - secondX;
        int summaY = firstY - secondY;
        int summaXy = (summaX * summaX) + (summaY * summaY);
        return Math.sqrt(summaXy);
    }

    static double pointDistanceZero(int x, int y) {
        return pointDistance(x, y, 0, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point point)) return false;
        return getX() == point.getX() && getY() == point.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }

    @Override
    public String toString() {
        return "X = " + this.x + "  Y = " + this.y;
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }
}
