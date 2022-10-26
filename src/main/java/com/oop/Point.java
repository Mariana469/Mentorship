package com.oop;

import org.jetbrains.annotations.NotNull;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(30, 40);
        System.out.println("p1.distance(p2) = " + p1.distance(p2));
    }

    double distance(int x, int y) {
        int distanceX = this.x - x;
        int distanceY = this.y - y;
        return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }

    double distance(@NotNull Point p) {
        return distance(p.x, p.y);
    }
}
