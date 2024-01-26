public class Point {//class point is created
    private double x, y;//private coordinates variables
    public Point(double x, double y){//constructor with 2 arguments
        this.x = x;
        this.y = y;
    }
    public double distanceTo(Point destination){//method to calculate distance between points in 2D space
        return Math.sqrt(Math.pow(this.x - destination.x, 2) + Math.pow(this.y - destination.y, 2));
    }
    public String ToString(){
        return ("x= "+this.x+", y= "+this.y);
    }//return points in the string format
}
