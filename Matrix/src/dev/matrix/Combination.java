package dev.matrix;

public class Combination {

    public static int calculate(int width, int height){
        return (factorial( (width - 1) + (height - 1)) / (factorial(width - 1) * factorial(height - 1)));
    }

    public static int calculate(int width, int height, int x, int y){
        if(x <= width && x > 1 && y <= height && y > 1){
            return (factorial( (x - 1) + (y - 1)) / (factorial(x - 1) * factorial(y - 1)));
        } else if(x > width || y > height){
            return 0;
        } else if(x <= 0 || y <= 0){
            return 0;
        } else {
            return 1;
        }
    }

    private static int factorial(int number){
        return (number == 1 || number == 0) ? number : number * factorial(number - 1);
    }
}
