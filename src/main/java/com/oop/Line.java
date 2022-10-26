package com.oop;

public class Line {
    private Point a;
    private Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public boolean isParallel(Line line) {
        if (this.a.getX() * this.a.getY() == this.b.getX() * this.b.getY()) {
            System.out.println("Lines are parallel");
        } else {
            System.out.println("Lines are not parallel");
        }
        return true;
    }
}
