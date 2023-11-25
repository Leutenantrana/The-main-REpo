package part8.Interfacepractice.p1;

public class main {
    public static void main(String[] args) {
        CustomTacoBox custo =new CustomTacoBox(12);

        custo.eat();
        custo.eat();
        System.out.println(custo.tacosRemaining());
    }
}
