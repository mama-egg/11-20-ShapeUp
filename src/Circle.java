// A Circle object represents a circle defined by a center point and a radius.
public class Circle {
  
  public Point center;
  public double radius;
  
  //Constructors
  public Circle() {
    center = 0;
    radius = 0;
  }
  
  public Circle(Point startPoint, Point endPoint) {
    center = startPoint;
    radius = endPoint.x - startPoint.x;
  }
  
  public Circle(Point p1, double d1) {
    center = p1;
    radius = d1;
  }
  
  //Accessors
  public double getRadius() {
    return radius;
  }
  
  public double area() {
    return π*radius*radius;
  }
  
  public double circumference() {
    return 2*π*radius;
  }
  
  public double diameter() {
    return 2*radius;
  }
  
  public String toString() {
    return "(" + center.x + ", " + center.y + ")" + radius;
  }
  
  //Mutators
  public void translate(int a, int b) {
    center.x += a;
    center.y += b;
    /*I'm a bit confused about this part-the README says to add 
    a to the X value of each end point and to add b to the Y 
    value of each point. 
    
    Does that mean it affects only the center, or do I just not understand?*/
  }
  
  public void changeRadius(double d2) {
    radius += d2;
  }
}
