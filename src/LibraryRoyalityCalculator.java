public class LibraryRoyalityCalculator {
    public static void main(String[] args) {
        Author olgaRavn = new Author("Olga Ravn");
        
        PrintedBook celestinePrinted = new PrintedBook("Celestine", "SKØN", 140, 166);
        AudioBook celestineAudio = new AudioBook("Celestine", "SKØN", 140, 192);
        
        olgaRavn.addTitle(celestinePrinted);
        olgaRavn.addTitle(celestineAudio);
        
        float totalPay = olgaRavn.calculateTotalPay();
        
        System.out.println(olgaRavn.getName() + ": " + totalPay + "kr");
    }
}

