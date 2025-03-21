import java.util.ArrayList;

public class Author {
    public String name;
    public ArrayList<Title> titles;
    
    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }
    
    public void addTitle(Title title) {
        titles.add(title);
    }
    
    public float calculateTotalPay() {
        float totalPay = 0.0f;
        for (Title title : titles) {
            totalPay += title.calculateRoyalty();
        }
        return Math.round(totalPay * 100.0f) / 100.0f;
    }
    
    public String getName() {
        return name;
    }
}

