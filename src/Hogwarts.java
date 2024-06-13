public class Hogwarts {
    private String nameStudent;
    private int powerStudent;
    private int distanceTransgration;

    public Hogwarts(String nameStudent, int powerStudent, int distanceTransgration) {
        this.nameStudent = nameStudent;
        if (this.powerStudent < 0 && this.powerStudent > 100) {
            throw new IllegalArgumentException("не правильно");
        } else {
            this.powerStudent = powerStudent;
        }
        if (this.distanceTransgration <= 100 && this.distanceTransgration >= 0) {
            this.distanceTransgration = distanceTransgration;
        } else {
            throw new IllegalArgumentException("не правильно");
        }
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public int getPowerStudent() {
        return powerStudent;
    }

    public int getDistanceTransgration() {
        return distanceTransgration;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void setPowerStudent(int powerStudent) {
        this.powerStudent = powerStudent;
    }

    public void setDistanceTransgration(int distanceTransgration) {
        this.distanceTransgration = distanceTransgration;
    }

    public void equalToHogwarts(Hogwarts student) {
        if (this.getPower() > student.getPower()) {
            System.out.println("win");
        } else if (this.getPower() < student.getPower()) {
            System.out.println("lose");
        } else {
            System.out.println("nichya");
        }

    }

    public int getPower() {
        return this.getDistanceTransgration() + this.getPowerStudent();
    }

    @Override
    public String toString() {
        return "Факультет " +
                ", имя" + nameStudent + '\'' +
                ", сила колдовства" + powerStudent + ", расстояние трансгрессии=" + distanceTransgration;
    }


}
