package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double lengthParam, double widthParam) {
        super(lengthParam, widthParam);
    }

    @Override
    public double setLength() {
        return 0;
    }

    @Override
    public double setWidth() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }


//    protected double width;
//    protected double length;
//
//    public Rectangle(double width, double length) {
//        this.width = width;
//        this.length = length;
//    }
//
//    public double getArea() {
//        return width * length;
//    }
//    public double getPerimeter() {
//        return 2 * width + 2 * length;
//    }

}
