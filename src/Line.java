// A Line object represents a line defined by a pair of Points.
public class Line {
  
  public Point start;
  public Point end;
  
  public Line() {
    start.x = 0;
    stert.y = 0;
    end.x = 0;
    end.y = 0;
  }
  
  public Line(Point startPoint, Point endPoint) {
    start = startPoint;
    end = endPoint;
  }
  
  public double length(Point startPoint, Point endPoint) {
    return Point.distance(startPoint, endPoint);
  }
  
  public double slope() {
    return (end.y - start.y) / (end.x - start.x);
  }
  
  public String toString() {
    return ("(" + start.x + ", " + start.y + "), (" + end.x + ", " + end.y + ")");
  }
  
  public void translate(int a, int b) {
    start.x += a;
    end.x += a;
    start.y += b;
    end.y += b;
  }
}
