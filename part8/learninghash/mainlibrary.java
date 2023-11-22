package part8.learninghash;

public class mainlibrary {
    public static void main(String[] args) {
        library l =new library();
        book senseAndSensibility = new book("Sense and Sensibility", 1811, "...");
        book prideAndPrejudice = new book("Pride and Prejudice", 1813, "....");
        book prideInNation = new book("Nation and Pride", 1813, "....");

        l.addBook(senseAndSensibility);
        l.addBook(prideAndPrejudice);
        l.addBook(prideInNation);

        
        System.out.println(l.getbook("PRIDE AND PREJUDICE"));

        System.out.println(l.getBookByPart("pride"));

        // System.out.println(l.getbook("P R I D E A N D P R e J U D I C E"));

        // System.out.println(l.getbook("Sense and Sensibility"));

        // System.out.println(l.getBookByPart("sense"));

       
    }
    
}
