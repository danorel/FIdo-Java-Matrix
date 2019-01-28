package dev.matrix;

public class Problem {
    public int getAmountOfWaysByCombination(int width, int height) {
        return Combination.calculate(width, height);
    }

    public int getAmountOfWaysByCombination(int width, int height, int x, int y) {
        return Combination.calculate(width, height, x, y);
    }


    public int getAmountOfWaysByAlgorithm(int width, int height) {
        return Algorithm.calculate(width, height);
    }

}
