package exam;

public class Test4 {
    public static void main(String[] args) {
        Classroom classroom1 = new Classroom("高三(1)班",50,79,"高三一班");
        Classroom classroom2 = new Classroom("高三(2)班",66,80,"高三二班");
        classroom1.calculateTotalScore();
        classroom1.show();
        System.out.println("-------");
        classroom2.calculateTotalScore();
        classroom2.show();
    }

}
