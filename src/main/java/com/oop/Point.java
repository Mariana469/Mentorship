package com.oop;

import org.jetbrains.annotations.NotNull;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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
