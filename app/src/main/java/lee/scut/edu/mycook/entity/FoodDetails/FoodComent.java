package lee.scut.edu.mycook.entity.FoodDetails;

/**
 * Created by jsonlee on 10/16/15.
 */
public class FoodComent {
    public int grade; //打分
    public boolean done; //做过
    public String userName; //评论用户名
    public String content; //评论内容
    public String time; //评论时间

    public FoodComent(int grade, boolean done, String userName, String content, String time) {
        this.grade = grade;
        this.done = done;
        this.userName = userName;
        this.content = content;
        this.time = time;
    }

}
