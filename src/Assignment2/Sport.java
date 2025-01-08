package Assignment2;

public abstract class Sport {
    private String sportName;

    public Sport(String sportName) {
        this.sportName = sportName;
    }

    public String getSportName() {
        return sportName;
    }

    public abstract void displayDetails();
}

