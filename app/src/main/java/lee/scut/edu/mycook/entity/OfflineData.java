package lee.scut.edu.mycook.entity;

import lee.scut.edu.mycook.entity.FoodDetails.Food;
import lee.scut.edu.mycook.entity.FoodLists.FoodLists;

/**
 * Created by jsonlee on 11/10/15.
 */
public class OfflineData {
    public Food[] foods;
    public FoodLists foodLists;
    public OfflineData(){
        foods = new Food[15];
    }
}
