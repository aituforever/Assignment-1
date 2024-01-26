public class Shape {//class Shape(of points)
   private Point[] points;//array of point to create a shape

   public Shape(Point[] points){
       this.points = points;
   }//constructor with 1 argument
   public double perimeter(){//method to calculate perimeter of shape
       double perimeter = 0;
       for(int i = 0; i<points.length;i++){
           perimeter += points[i].distanceTo(points[(i + 1) % points.length]);//used distanceto method from Point class
       }
       return perimeter;//return the perimeter of the shape
   }
   public double longestSide(){//method to find the longest side of the shape by comparing
       double currentLongest = 0;//start to comparison
       for (int i =0;i<points.length;i++){
           double side = points[i].distanceTo(points[(i + 1) % points.length]);//current side calculation
           if (side>currentLongest){//comparing current side with current longest side
               currentLongest = side;//replaces if current side is bigger
           }
       }
       return currentLongest;//return longest side of shape
   }
   public double avgSide(){//method to find average side length of shape
       return this.perimeter()/ points.length;//average side is just perimeter by amount of points
   }
}
