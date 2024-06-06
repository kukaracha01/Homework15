public class Grifindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Grifindor(String nameStudent, int powerStudent, int distanceTransgration,
                     int nobility, int honor, int courage) {
        super(nameStudent, powerStudent, distanceTransgration);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Grifindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}';
    }
}
