package lee.scut.edu.mycook.entity.FoodDetails;

/**
 * Created by jsonlee on 10/17/15.
 */
public class FoodMaterial {
    public String materialName; // 材料名
    public String weight; //用量

    public FoodMaterial(String materialName, String weight) {
        this.materialName = materialName;
        this.weight = weight;
    }
}
