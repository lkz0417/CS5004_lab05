public class Circle extends AbstractShape{
  private double x,y;
  private double radius;

  public Circle(double x, double y, double radius) {
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double getRadius() {
    return radius;
  }
  /**
   *
   * @return the circle's area
   */
  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  /**
   *
   * @return the circle's perimeter
   */
  @Override
  public double getPerimeter() {
    return Math.PI * 2 * radius;
  }
}
