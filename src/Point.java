// A Point object represents a pair of (x, y) coordinates.
public class Point {
  
  public int a;
  public int b;
  
  Point pzero = new Point() { //Construct a point at (0, 0)
  
  this.x = 0;
  this.y = 0;
  }
  
  Point pone = new Point(int x, int y) { //Construct a point and set it to (x, y)
  
  this.x = x;
  this.y = y;
  
    public int getX () {
      return this.x;
    }
    
    public int getY () {
      return this.y;
    }
    
    public double distanceFromOrigin () {
     int ydistance = this.y - 0;
     int xdistance = this.x - 0;
     double distance = Math.sqrt((xdistance*xdistance)+(ydistance*ydistance));
     return distance;
    }
    
    public double distance (Point a) {
      int ydist = this.y - a.y;
      int xdist = this.x - a.x;
      double dist = Math.sqrt(2*(xdist*xdist)+2*(ydist*ydist));
      return dist;
    }
    
    public String toString () {
      return ("(" + this.x + "," + this.y + ")");
    }
    
    public void setX (int a) {
      this.x = a;
    }
    
    public void setY (int b) {
      this.y = b;
    }
    
    public void translate (int c, int d) {
      this.x = this.x + c;
      this.y = this.y + d;
    }
  }
