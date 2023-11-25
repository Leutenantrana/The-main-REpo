package part8.Interfacepractice.p2;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // ArrayList<Readable> readingList = new ArrayList<>();

        // readingList.add(new TextMessages("ope", "never been programming before"));
        // readingList.add(new TextMessages("ope", "gonna love it i think!"));
        // readingList.add(new TextMessages("ope", "give me something more challenging! :)"));
        // readingList.add(new TextMessages("ope", "you think i can do it?"));
        // readingList.add(new TextMessages("ope", "up here we send several messages each day"));
        ArrayList<String> pages = new ArrayList<>();
        pages.add("A method can call itself.");

        // readingList.add(new Ebook("Introduction to Recursion.", pages));

        // for (Readable readable: readingList) {
        //     System.out.println(readable.read());
        // }

        // ReadingList jonisList = new ReadingList();
        // jonisList.add(new TextMessages("arto", "have you written the tests yet?"));
        // jonisList.add(new TextMessages("arto", "have you checked the submissions yet?"));
        // jonisList.add(new Ebook("Introduction to recursion", pages));
        // System.out.println(jonisList.read());

        // System.out.println("Joni's to-read: " + jonisList.toRead());

        ReadingList jonisList = new ReadingList();
        int i = 0;
        while (i < 1000) {
            jonisList.add(new TextMessages("arto", "have you written the tests yet?"));
            i = i + 1;
        }

        System.out.println("Joni's to-read: " + jonisList.toRead());
        System.out.println("Delegating the reading to Verna");

        ReadingList vernasList = new ReadingList();
        vernasList.add(jonisList);
        // vernasList.read();

        System.out.println();
        System.out.println("Joni's to-read: " + jonisList.toRead());

    }
}
