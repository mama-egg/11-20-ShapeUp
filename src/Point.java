// A Point object represents a pair of (x, y) coordinates.
public class Point {
  
  int a;
  int b;
  
  public Point() { //Construct a point at (0, 0)
  getX();
  }
  
  public Point(int x, int y) { //Construct a point and set it to (x, y)
  getX();
  }
  
  public int getX (Point a) { //Return the x value of the point
    return this.x;
  }
  
  public int getY (Point a) { //Return the y value of the point
    return this.y;
  }
  
  public double distanceFromOrigin (Point a) { //Find the point's distance from (0, 0)
    
    int ydistance = this.x - 0;
      if(ydistance < 0) {
        ydistance = -ydistance
      }
      
    int xdistance = this.y - 0;
      if(xdistance < 0) {
        xdistance = -xdistance;
      }
    
    int distance = 
  }
}
