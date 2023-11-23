package part8.Inheritence.practice.p2;

public class Point3D extends Point {
    int z;

    public Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    

    @Override

   
    
    public int manhattanDistanceFromOrigin(){
        return super.manhattanDistanceFromOrigin() + Math.abs(z);
    }

    protected String location(){
        return super.location() + " , " + z;
    }
}
