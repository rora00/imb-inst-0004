public class Rectangle implements Shape{
    private int height = 10;
    private int width = 5;

    public void drawShape(){
        System.out.println("Drawing rectangle...");
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                System.out.print("*");
            }
        System.out.println("*");
        }
    }
}