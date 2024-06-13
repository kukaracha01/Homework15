public class Slizerine extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slizerine(String nameStudent, int powerStudent, int distanceTransgration,
                     int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(nameStudent, powerStudent, distanceTransgration);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    public void equalToSlizerine(Slizerine student) {
        if (this.getPower() > student.getPower()) {
            System.out.println("win");
        } else if (this.getPower() < student.getPower()) {
            System.out.println("lose");
        } else {
            System.out.println("nichya");
        }

    }

    public int getPower() {
        return this.getDistanceTransgration() + this.getPowerStudent() + this.getThirstForPower() + this.getResourcefulness() + this.getAmbition() + this.getDetermination() + this.getCunning();
    }

    @Override
    public String toString() {
        return "Slizerine{" +
                " " +
                getNameStudent() +
                " " +
                getPowerStudent() +
                " " +
                getDistanceTransgration() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                '}';
    }
}
