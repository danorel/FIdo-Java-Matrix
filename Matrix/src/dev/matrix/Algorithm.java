package dev.matrix;

public class Algorithm {
    private static int width, height;
    private static int count = 0;

    public static int calculate(int width, int height){
        bfs(0, 0);
        return count;
    }

    public static boolean bfs(int location_x, int location_y){
        if(location_x < 0 && location_x > width && location_y < 0 && location_y > height){
            return false;
        } else {
            bfs(location_x - 1, location_y);
            bfs(location_x + 1, location_y);
            bfs(location_x, location_y + 1);
            bfs(location_x, location_y - 1);
        }
        return false;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
