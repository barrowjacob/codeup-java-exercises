package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral(double lengthParam, double widthParam) {
        this.length = lengthParam;
        this.width = widthParam;
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public abstract double setLength();
    public abstract double setWidth();
}

