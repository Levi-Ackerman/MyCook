package lee.scut.edu.mycook.entity.FoodLists;

/**
 * Created by jsonlee on 10/17/15.
 * 所有菜品的列表
 */
public class FoodListItem {
    public FoodListItem(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String name;
    public int id;
}
