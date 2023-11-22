package part8.equal;

public class main {
    public static void main(String[] args) {
        simpleDate d = new simpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new simpleDate(5, 2, 2012)));
        System.out.println(d.equals(new simpleDate(1, 2, 2000)));
    }
}
