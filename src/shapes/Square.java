package shapes;

public class Square extends Rectangle{
    int side;
//use 'super' to reference super class when you have default constructor issues
    public Square(int side) {
        //parameters passed through have to include super class parameters that you want to reference
        super(side, side);
        this.side = side;
    }
    @Override
    public int getArea() {
        return (side * side);
    }
    public int getPerimeter() {
        return 4*side;
    }
}
