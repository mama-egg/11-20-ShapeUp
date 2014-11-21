// A Line object represents a line defined by a pair of Points.
public class Line {
  Point start;
  Point end;
  Point p3 = new Point(0, 0);
  int a;
  int b;
  
  public Line(Point p3, int a, int b) {
    double slopezero = (p3.y - p3.y)/(p3.x - p3.x);
    double plusb = p3.y - (slopezero * p3.x);
    this.x = this.x + a;
    this.y = this.y + b;
    
  }
  
  public Line(Point start, Point end, int a, int b) {
    double slope = (end.y - start.y)/(end.x - start.x);
    double b = start.y - (slope * start.x);
    
    int tempy = end.y - start.y;
    int tempx = end.x - start.x;
    int tempy2 = (end.y - start.y)*(end.y - start.y);
    int tempx2 = (end.x - start.x)*(end.x - start.x);
    double length = Math.sqrt(tempy2 + tempx2);
    
    this.x = this.x + a;
    this.y = this.y + b;
    
  }
  
  
}
