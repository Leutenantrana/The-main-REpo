package part8.Interfacepractice.p3;

public class packer {
    private Factory factory;

    public packer() {
        this.factory = new Factory();
    }

    public Box giveABoxOfThings() {
         Box box = new Box(100);

         int i = 0;
         while (i < 10) {
             Packable newThing = factory.ProduceNew();
             box.add(newThing);

             i = i + 1;
         }

         return box;
    }
    
}
