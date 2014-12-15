// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
public class Rectangle {
  
  public Point origin;
  public int width;
  public int height;
  
  public Rectangle() {
    origin.x = 0;
    origin.y = 0;
    height = 0;
    width = 0;
  }
  
  public Rectangle(Point bottomLeft, Point topRight) {
    origin = bottomLeft;
    height = topRight.y - bottomLeft.y;
    width = topRight.x - bottomLeft.x;
  }
  
  public Rectangle(Point p1, int a, int b) {
    origin = p1;
    height = a;
    width = b;
  }
  
  //Accessors
  public Point getBottomLeft() {
    return origin;
  }
  
  public Point getTopRight() {
    return (origin.x + width, origin.y + height);
  }
  
  public int getHeight() {
    return height;
  }
  
  public int getWidth() {
    return width;
  }
  
  public double getArea() {
    return height*width;
  }
  
  public double getDiameter() {
    return Math.sqrt((width * width) + (height * height));
  }
  
  public int getPerimeter() {
    return (width * 2) + (length * 2);
  }
  
  public boolean isSquare() {
    boolean result = false;
    if(length == width) {
      result = true;
    }
    return result;
  }
  
  public String toString() {
    return "(" + origin.x + ", " + origin.y + ") height: " + height + ", width: " + width;
  }
  
  public void translate(int c, int d) {
    origin.x += c;
    origin.y += d;
  }
  
  public void scale(int dx, int dy) {
    origin.x += dx;
    origin.y += dy;
  }
}
