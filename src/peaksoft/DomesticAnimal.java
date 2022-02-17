package peaksoft;

public abstract class DomesticAnimal  {

    private double weight;
    private int age;
    private String gender;
    private String nickName;



    public DomesticAnimal(double weight, int age, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "DomesticAnimal: \n" +
                "weight: " + weight +
                ", age: " + age +
                ", gender: " + gender +
                ", nickName: " + nickName +"\n";
    }
}