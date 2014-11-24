// A Line object represents a line defined by a pair of Points.
public class Line {
  Point start;
  Point end;
  Point p3 = new Point(0, 0);
  int a;
  int b;
  
  public Line (Point p3, int a, int b) {
    double slopezero = (p3.y - p3.y)/(p3.x - p3.x);
    double plusb = p3.y - (slopezero * p3.x);
    this.x = this.x + a;
    this.y = this.y + b;
    
  }
  
  public Line (Point start, Point end, int a, int b) {
    public double length (Point start, Point end) {
      distance(start, end);
      return dist;
    }
    
    public double slope (Point start, Point end) {
      double slope = (end.y - start.y)/(end.x - strat.x);
      return slope;
    }
    
    public String toString (Point start, Point end) {
      String linestring = ("((" + start.x + "," + start.y + ")(" + end.x + "," + end.y + "))");
      return linestring;
    }
  }
}
