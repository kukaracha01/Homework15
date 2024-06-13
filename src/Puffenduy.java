public class Puffenduy extends Hogwarts {
    private int hardWork;
    private int loyality;
    private int honesty;

    public Puffenduy(String nameStudent, int powerStudent, int distanceTransgration,
                     int hardWork, int loyality, int honesty) {
        super(nameStudent, powerStudent, distanceTransgration);
        this.hardWork = hardWork;
        this.loyality = loyality;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyality() {
        return loyality;
    }

    public void setLoyality(int loyality) {
        this.loyality = loyality;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public void equalToPuffenduy(Puffenduy student) {
        if (this.getPower() > student.getPower()) {
            System.out.println("win");
        } else if (this.getPower() > student.getPower()) {
            System.out.println("lose");
        } else {
            System.out.println("nichya");
        }

    }

    public int getPower() {
        return this.getDistanceTransgration() + this.getPowerStudent() + this.getLoyality() + this.getHonesty() + this.getHardWork();
    }
    @Override
    public String toString() {
        return "Puffenduy{" +
                " " +
                getNameStudent() +
                " " +
                getPowerStudent() +
                " " +
                getDistanceTransgration() +
                "hardWork=" + hardWork +
                ", loyality=" + loyality +
                ", honesty=" + honesty +
                '}';
    }
}
