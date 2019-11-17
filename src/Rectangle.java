import java.util.Scanner;

public class Rectangle implements Drawable{
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public void draw() {
        System.out.println();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
