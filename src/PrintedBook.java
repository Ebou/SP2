public class PrintedBook extends Title {
    public int pages;
    
    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }
    
    @Override
    public double calculatePoints() {
        return pages * convertLiteratureType() * copies;
    }
}

