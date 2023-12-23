public class Shape {
   private Point[] points;

   public Shape(Point[] points){
       this.points = points;
   }
   public double perimeter(){
       double perimeter = 0;
       for(int i = 0; i<points.length;i++){
           perimeter += points[i].distanceTo(points[(i + 1) % points.length]);
       }
       return perimeter;
   }
   public double longestSide(){
       double currentLongest = 0;
       for (int i =0;i<points.length;i++){
           double side = points[i].distanceTo(points[(i + 1) % points.length]);
           if (side>currentLongest){
               currentLongest = side;
           }
       }
       return currentLongest;
   }
   public double avgSide(){
       return this.perimeter()/ points.length;
   }
}
