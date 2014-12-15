// A Point object represents a pair of (x, y) coordinates.
public class Point {
  
  public int x;
  public int y;
  
  public Point() {
    this.x = 0;
    this.y = 0;
  }
  
  public Point() {
    this.x = x;
    this.y = y;
  }
  
  public int getX() {
    return x;
  }
  
  public int getY() {
    return y;
  }
  
  public double distanceFromOrigin() {
    return Math.sqrt((x*x) + (y*y));
  }
  
  public double distance(Point p) {
    return 2 * (Math.sqrt(((p.x - x)*(p.x - x)) +((p.y - y)*(p.y - y)));
  }
  
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
  
  public void setX(int newX) {
    x = newX;
  }
  
  public void setY(int newY) {
    y = newY;
  }
  
  public void translate(int a, int b) {
    x = x + a;
    y = y + b;
  }
}
