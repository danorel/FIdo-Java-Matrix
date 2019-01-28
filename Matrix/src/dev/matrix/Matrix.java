package dev.matrix;

public class Matrix {
    // The sizes of the Matrix
    private int width, height;

    public Matrix setWidth(int width) {
        this.width = width;
        return this;
    }

    public Matrix setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

