package part8.Inheritence.practice.p2;

public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int manhattanDistanceFromOrigin(){
        return Math.abs(x) + Math.abs(y);
    }

    protected String location(){
        return x + ", " + y;
    }

    @Override
    public String toString() {
        return "(" + this.location() + ") distance " + this.manhattanDistanceFromOrigin();
    }
    
}
