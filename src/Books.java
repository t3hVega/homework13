public class Books {
    public static void main(String[] args) {
        Author markTwain = new Author("Mark", "Twain");
        Author stanislawLem = new Author("Stanislaw","Lem");
        Book solaris = new Book("Solaris", stanislawLem, 1959);
        Book theAdventuresOfTomSawyer = new Book("The Adventures of Tom Sawyer", markTwain,1876);
        solaris.setYear(1961);
        System.out.println(theAdventuresOfTomSawyer.toString()
                + " written by " + theAdventuresOfTomSawyer.getAuthor().toString());
        System.out.println(solaris.toString()
                + " written by " + solaris.getAuthor().toString());
        System.out.println("ДЗ сделано");

    }
}