package shapes;

public class Square extends Rectangle{
//use 'super' to reference super class when you have default constructor issues
    public Square(int side) {
        //parameters passed through have to include super class parameters that you want to reference
        super(side, side);
        this.length = side;
        this.width = side;
    }
    @Override
    public double getArea() {
        return (Math.pow(super.length, 2));
    }
    public double getPerimeter() {
        return 4*super.width;
    }
}
