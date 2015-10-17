package lee.scut.edu.mycook.entity.FoodDetails;

/**
 * Created by jsonlee on 10/16/15.
 */
public class FoodComent {
    public int grade; //打分
    public boolean done; //做过
    public String userName;
    public String content;
    public String time;

    public FoodComent(int grade, boolean done, String userName, String content, String time) {
        this.grade = grade;
        this.done = done;
        this.userName = userName;
        this.content = content;
        this.time = time;
    }

}
