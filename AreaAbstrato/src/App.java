import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sca = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();


        System.out.println("Digite a quantidade de shapes ");
        int numeroShapes = sca.nextInt();



        for (int i = 1; i <= numeroShapes; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Retangle or Circle (r/c)??");
            char ch = sca.next().charAt(0);
            System.out.println("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sca.next());
            if (ch == 'r') {
                System.out.println("Width: ");
                double width = sca.nextDouble();
                System.out.println("Height: ");
                double height = sca.nextDouble();
                list.add(new Rectangle(color, width, height));

            } else {
                System.out.println("Radius :");
                double radius = sca.nextDouble();
                list.add(new Circle(color, radius));

            }
        }

        System.out.println("\nArea dos Shapes");
        for(Shape shape : list){
            System.out.println(String.format("%.2f", shape.Area()));
        }
    }
}
