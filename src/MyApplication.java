import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("C:\\Users\\Alan\\IdeaProjects\\as1\\src\\file.txt");
        Scanner scanner = new Scanner(file);
        List<Point> coordinates = new ArrayList<>();
        while(scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            coordinates.add(new Point(x,y));
        }
        scanner.close();
        Point[] answers = new Point[coordinates.size()];
        answers = coordinates.toArray(answers);

        Shape shape = new Shape(answers);
        System.out.println(("P = "+shape.perimeter()));
        System.out.println(("Longest side = "+shape.longestSide()));
        System.out.println(("Avg side length = "+shape.avgSide()));
    }
}
