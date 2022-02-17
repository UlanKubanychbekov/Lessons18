package peaksoft;

public class Horse extends DomesticAnimal{
    private String colour;

    public Horse(double weight, int age, String gender, String nickName, String colour) {
        super(weight, age, gender, nickName);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
