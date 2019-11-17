import  java.util.Scanner;
public class Triangle implements Drawable {

    @Override
    public void draw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosc trojkata");
        int a = scanner.nextInt();

        for (int i = 1; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}