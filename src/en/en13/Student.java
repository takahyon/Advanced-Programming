package en.en13;

/**
 * Created by Taka on 2017/07/10.
 */
public class Student {
    String id;
    int score;
    String grade;

    Student(String id, int score) {
        this.id = id;
        this.score = score;
    }

    private String getGrade() {
        if (score > 80) {
            return "A";
        } else if (score >= 70 && score < 79) {
            return "B";
        } else if (score > 60 && score < 69) {
            return "C";
        } else {
            return "D";
        }

    }

    public void add(int n) {
        this.score += n;
        System.out.println("1番目の学生の得点に" + n + "点加えます");
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                        ", score=" + score +
                        ", grade='" + getGrade();
    }
}
