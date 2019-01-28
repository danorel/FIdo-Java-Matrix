package dev.matrix;

interface App {
    static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.setHeight(3).setWidth(4);
        Problem sample = new Problem();
        System.out.println(sample.getAmountOfWaysByCombination(matrix.getWidth(), matrix.getHeight(), 1, 3));
//        System.out.println(sample.getAmountOfWaysByAlgorithm(matrix.getWidth(), matrix.getHeight()));
    }
}
