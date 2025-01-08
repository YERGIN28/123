package Assignment2;

public class Player extends Sport {
    private String playerName;
    private int age;
    private String position;

    public Player(String sportName, String playerName, int age, String position) {
        super(sportName);
        this.playerName = playerName;
        this.age = age;
        this.position = position;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public void displayDetails() {
        System.out.println("Sport: " + getSportName() + ", Player Name: " + playerName +
                ", Age: " + age + ", Position: " + position);
    }

    @Override
    public String toString() {
        return "Player{" +
                "sportName='" + getSportName() + '\'' +
                ", playerName='" + playerName + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Player)) return false;
        Player other = (Player) obj;
        return getSportName().equals(other.getSportName()) &&
                playerName.equals(other.playerName);
    }

    @Override
    public int hashCode() {
        return getSportName().hashCode() + playerName.hashCode();
    }
}
