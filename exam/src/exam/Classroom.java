package exam;

public class Classroom {
    private String className;
    private int studentNumber;
    private double avgScore;
    private String description;

    public Classroom() {
    }

    public Classroom(String className, int studentNumber, double avgScore, String description) {
        this.className = className;
        this.studentNumber = studentNumber;
        this.avgScore = avgScore;
        this.description = description;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void calculateTotalScore() {
        System.out.println(getClassName()+"班级总分:"+studentNumber * avgScore);
    }
    public void show(){
        System.out.println("班级名称"+getClassName()+"班级人数:"+getStudentNumber()+"班级平均分"+getAvgScore()+"班级描述;"+description);
    }
}
