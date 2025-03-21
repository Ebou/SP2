public abstract class Title {
    public String title;
    public String literatureType;
    public int copies;
    public double rate = 0.067574;
    
    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }
    
    public double calculateRoyalty() {
        double points = calculatePoints();
        return points * rate;
    }
    
    public double convertLiteratureType() {
        switch (literatureType) {
            case "BI":
                return 3.0;
            case "TE":
                return 3.0;
            case "LYRIK":
                return 6.0;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1.0;
            default:
                return 0.0;
        }
    }
    
    public abstract double calculatePoints();
}

