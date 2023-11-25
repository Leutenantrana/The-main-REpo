package part8.Interfacepractice.p1;

public class TripleTacoBox implements TacoBox {
    private int tacos;

    // Constructor
    public TripleTacoBox() {
        this.tacos = 3;
    }

    // Implementing methods from the interface
    @Override
    public int tacosRemaining() {
        return tacos;
    }

    @Override

    public void eat() {
        if (tacos > 0) {
            tacos--;
        }
    }

}
