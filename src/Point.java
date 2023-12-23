
public class Point {
    private double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distanceTo(Point destination){
        return Math.sqrt(Math.pow(this.x - destination.x, 2) + Math.pow(this.y - destination.y, 2));
    }
    public String ToString(){
        return ("x= "+this.x+", y= "+this.y);
    }
}
