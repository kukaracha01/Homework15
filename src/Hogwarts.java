public class Hogwarts {
    private String nameStudent;
    private int powerStudent;
    private int distanceTransgration;

    public Hogwarts(String nameStudent, int powerStudent, int distanceTransgration) {
        this.nameStudent = nameStudent;
        this.powerStudent = powerStudent;
        this.distanceTransgration = distanceTransgration;
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

    @Override
    public String toString() {
        return "Факультет " +
                ", имя" + nameStudent + '\'' +
                ", сила колдовства" + powerStudent + ", расстояние трансгрессии=" + distanceTransgration;
    }
}
