package shapes;

public class Square extends Rectangle{
    int side;
//use 'super' to reference super class when you have default constructor issues
    public Square(int side) {
        //parameters passed through have to include super class parameters that you want to reference
        super(side, side);
        this.length = side;
        this.width = side;
    }
    @Override
    public int getArea() {
        System.out.println(side ^ 2);
        return side^2;
    }
    public int getPerimeter() {
        System.out.println(4 * side);
        return 4*side;
    }
}
