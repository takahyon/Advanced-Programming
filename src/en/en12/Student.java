package en.en12;

/**
 * 学生を表すクラスです。
 *
 * このクラスは学籍番号 studentId と得点 scor　をフィールドとして持ちます。
 * Created by Taka on 2017/07/03.
 */
public class Student extends Object{
    private String studentId;
    private int score;

    public Student(String studentId, int score){
        this.studentId = studentId;
        this.score = score;
    }

    public String getStudentId(){
        return studentId;

    }

    public int getScore(){
        return score;
    }

    /**
     * この学生が合格か不合格かを判断します。
     * @return このインスタンスのScoreが60以上の場合trueを返します。そうでない場合はfalseを返します。
     */
    public boolean isPass(){
        if(score >= 60){
            return true;
        }else{
            return false;
        }
    }

    /**
     * この学生の特典を調整します。引数の値がこのインスタンスのscoreに足されます。引数に負の値を入れることもできます。
     * @param diff -scoreに足す値;
     */
    public void adjust(int diff){
        this.score+= diff;
    }
}
