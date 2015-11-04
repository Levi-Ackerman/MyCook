package lee.scut.edu.mycook.entity.FoodDetails;

import java.util.List;

/**
 * Created by jsonlee on 10/16/15.
 * 食物的具体描述，第三层菜单需要的所有数据
 */
public class Food {
    public String name; //名字
    public String introduction; //介绍
    public boolean isFavorite; //收藏
    public boolean isUp; //点赞
    public String picUrl; //大图链接
    public String videoUrl; //视频链接
    public List<FoodMaterial> foodMaterials; //食材
    public List<FoodStep> foodSteps; //做菜步骤
    public List<FoodComent> foodComents; //评论

    public Food(String name, String introduction, boolean isFavorite, boolean isUp, String picUrl, String videoUrl, List<FoodMaterial> foodMaterials, List<FoodStep> foodSteps, List<FoodComent> foodComents) {
        this.name = name;
        this.introduction = introduction;
        this.isFavorite = isFavorite;
        this.isUp = isUp;
        this.picUrl = picUrl;
        this.videoUrl = videoUrl;
        this.foodMaterials = foodMaterials;
        this.foodSteps = foodSteps;
        this.foodComents = foodComents;
    }
}
