package part8.Inheritence.practice.p2;

public class ColorPoint extends Point {
    String color;

    public ColorPoint(int x, int y, String color){
        super(x, y);
        this.color = color;
    }

    @Override
    public String toString(){
        return "(" + this.location() + ") distance " + this.manhattanDistanceFromOrigin() + " Color : " + this.color;
    }
    
}
