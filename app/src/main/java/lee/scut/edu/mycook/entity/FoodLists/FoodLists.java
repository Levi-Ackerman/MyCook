package lee.scut.edu.mycook.entity.FoodLists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsonlee on 10/17/15.
 * 食物列表，第二层菜单需要的数据
 */
public class FoodLists {
    public List<FoodListItem> allFoods;     //全部菜谱,右边列表
    public List<FoodRecommend> popFoods;    //热门菜谱
    public List<FoodRecommend> recommendFood;//猜你喜欢
    public List<FoodRecommend> historyFood;  //历史记录
    public FoodLists(){
        allFoods =new ArrayList<>();
        popFoods =new ArrayList<>();
        recommendFood = new ArrayList<>();
        historyFood = new ArrayList<>();
    }
}
