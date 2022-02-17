package peaksoft;

import java.util.Arrays;

public class Farm {

    private String address;
    private String ownerName;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheeps;

    public Farm(String address, String ownerName, Cow[] cows, Horse[] horses, Sheep[] sheeps) {
        this.address = address;
        this.ownerName = ownerName;
        this.cows = cows;
        this.horses = horses;
        this.sheeps = sheeps;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    @Override
    public String toString() {
        return "Farm: " +
                "address: " + address + '\n' +
                "ownerName: " + ownerName + '\n' +
                "cows: " + cows.length +
                "\nhorses: " + horses.length +
                "\nsheeps: " + sheeps.length +
                "\n"+ Arrays.toString(cows) +" \n"+ Arrays.toString(sheeps)+"\n"+ Arrays.toString(horses);

    }
}




