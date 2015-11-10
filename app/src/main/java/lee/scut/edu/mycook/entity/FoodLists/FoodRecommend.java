package lee.scut.edu.mycook.entity.FoodLists;

/**
 * Created by jsonlee on 10/17/15.
 * 推荐的菜品，附图
 */
public class FoodRecommend {
    public String name;

    public FoodRecommend(String name, String picUrl, int id) {
        this.name = name;
        this.picUrl = picUrl;
        this.id = id;
    }

    public String picUrl;
    public int id;
}
