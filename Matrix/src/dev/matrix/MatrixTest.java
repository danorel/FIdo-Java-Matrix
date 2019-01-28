package dev.matrix;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTest {

    private Matrix matrix;
    private Problem problem;
    private static List<List<Integer>> testCases;

    @org.junit.Before
    public void beforeEach(){
        matrix = new Matrix();
        problem = new Problem();
    }

    @org.junit.BeforeClass
    public static void beforeAll(){
        testCases = Arrays.asList(
                Arrays.asList(2,2,2),
                Arrays.asList(3,3,6),
                Arrays.asList(1,1,1),
                Arrays.asList(3,2,3),
                Arrays.asList(4,3,10)
        );
    }

    @org.junit.Test
    public void setSizes() {
        matrix.setWidth(3);
        matrix.setHeight(3);
        assertEquals(3, matrix.getWidth());
        assertEquals(3, matrix.getHeight());
    }

    @org.junit.Test
    public void getAmountOfWays() {
//        testCases.stream().forEach(testCase -> {
//                matrix.setSizes(testCase.get(0), testCase.get(1));
//                assertEquals((int)testCase.get(2), matrix.getAmountOfWaysByCombination());
//            }
//        );

        for(int index = 0; index < testCases.size(); index++){
            matrix.setWidth(testCases.get(index).get(0));
            matrix.setHeight(testCases.get(index).get(1));
            assertEquals(testCases.get(index).get(2).intValue(), problem.getAmountOfWaysByCombination(matrix.getWidth(), matrix.getHeight()));
        }
    }
}
