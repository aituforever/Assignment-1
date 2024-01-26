import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;//imported necessary classes to use
public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException{//added case of file not existing
        File file = new File("C:\\Users\\Alan\\IdeaProjects\\as1\\src\\file.txt");//create a file located at this directory
        Scanner scanner = new Scanner(file);//Scanner object to read from the file
        List<Point> coordinates = new ArrayList<>(); //Arraylist to store all Point objects
        while(scanner.hasNextDouble()){//If there is next double var in file
            double x = scanner.nextDouble();//first double - x coordinate
            double y = scanner.nextDouble();//second double - y coordinate
            coordinates.add(new Point(x,y));//add new point with this coordinates to Point list
        }
        scanner.close();//Scanner closes
        Point[] answers = new Point[coordinates.size()];
        answers = coordinates.toArray(answers);
        //Convert arraylist to array

        Shape shape = new Shape(answers);//new shape object with Points array
        System.out.println(("P = "+shape.perimeter()));//print perimeter
        System.out.println(("Longest side = "+shape.longestSide()));//print longest side
        System.out.println(("Avg side length = "+shape.avgSide()));//print average side length
    }
}
