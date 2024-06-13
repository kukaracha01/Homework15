public class Cogtevran extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Cogtevran(String nameStudent, int powerStudent, int distanceTransgration,
                     int intelligence, int wisdom, int wit, int creativity) {
        super(nameStudent, powerStudent, distanceTransgration);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public void equalToCogtevran(Cogtevran student) {
        if (this.getPower() > student.getPower()) {
            System.out.println("win");
        } else if (this.getPower() > student.getPower()) {
            System.out.println("lose");
        } else {
            System.out.println("nichya");
        }

    }

    public int getPower() {
        return this.getDistanceTransgration() + this.getPowerStudent() + this.getWit() + this.getWisdom() + this.getCreativity() + this.getIntelligence();
    }

    @Override
    public String toString() {
        return "Cogtevran{" +
                " " +
                getNameStudent() +
                " " +
                getPowerStudent() +
                " " +
                getDistanceTransgration() +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }
}
