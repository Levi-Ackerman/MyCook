package lee.scut.edu.mycook.entity;

import java.util.ArrayList;
import java.util.List;

import lee.scut.edu.mycook.entity.FoodDetails.Food;
import lee.scut.edu.mycook.entity.FoodDetails.FoodComent;
import lee.scut.edu.mycook.entity.FoodDetails.FoodMaterial;
import lee.scut.edu.mycook.entity.FoodDetails.FoodStep;
import lee.scut.edu.mycook.entity.FoodLists.FoodListItem;
import lee.scut.edu.mycook.entity.FoodLists.FoodLists;
import lee.scut.edu.mycook.entity.FoodLists.FoodRecommend;

/**
 * Created by jsonlee on 11/10/15.
 */
public class OfflineData {
    String picPath = "/sdcard/chushitong/";
    public Food[] foods;
    public FoodLists foodLists;

    public OfflineData() {
        foods = new Food[15];
        List<FoodStep> steps;
        List<FoodMaterial> materials;
        List<FoodComent> coments;

        steps = new ArrayList<>();
        materials = new ArrayList<>();
        coments = new ArrayList<>();
        steps.add(new FoodStep(1, "在准备做曲奇之前2个小时，必须把黄油从冰箱拿出来室温软化到用手指能轻易搓一个洞，不能熔化成液体啊"));
        steps.add(new FoodStep(2, "准备已经软化好的黄油，把糖粉全部倒进去，可以用面粉筛过一下筛，更容易混合"));
        steps.add(new FoodStep(3, "然后用刮刀把它们混合均匀，用压，刮的方式很容易混合的"));
        steps.add(new FoodStep(4, "然后一个鸡蛋分两次加入黄油里面"));
        steps.add(new FoodStep(5, "用电动打蛋器搅拌均匀，一定要把上一次的鸡蛋搅拌均匀之后再加入剩余鸡蛋，用同样的方法混匀"));
        steps.add(new FoodStep(6, "低筋面粉过筛全部加入黄油里面"));
        steps.add(new FoodStep(7, "蔓越莓用料理机打碎，没有机器的朋友可以用刀切碎，碎一点，太大颗反而不好吃"));
        steps.add(new FoodStep(8, "把蔓越莓碎倒入面粉和黄油里"));
        steps.add(new FoodStep(9, "用刮刀和手，想办法把它们混合均匀吧，混合到没有干粉就可以了，不要过度搅拌，导致面粉起筋，曲奇就不酥脆了"));
        steps.add(new FoodStep(10, "然后放入模具塑形，这是Tinrry每一块曲奇都一样大小的秘密武器哦~~"));
        steps.add(new FoodStep(11, "然后把塑形好的面团放进冰箱冷藏最少2小时，天气热可以放冷冻，目的是要面团变硬，好切"));
        materials.add(new FoodMaterial("低筋面粉", "350克"));
        materials.add(new FoodMaterial("糖粉", "150克"));
        materials.add(new FoodMaterial("黄油", "250克"));
        materials.add(new FoodMaterial("蔓越莓干", "125克"));
        materials.add(new FoodMaterial("鸡蛋", "1个"));
        coments.add(new FoodComent(4,true,"追随蔡蔡","饼干在烤制过程中发生严重变形，油渗出现象明显","2015-11-01"));
        foods[0] =new Food();
        foods[0].foodId = 0;
        foods[0].name = "蔓越曲奇";
        foods[0].introduction = "好吃又低卡路里的零食，在家有烤箱就能做，绝对值得一试！";
        foods[0].picUrl = picPath+"manyuequqi.jpg";
        foods[0].videoUrl = picPath+"manyuequqi.flv";
        foods[0].foodSteps = steps;
        foods[0].foodMaterials = materials;
        foods[0].foodComents = coments;

        steps = new ArrayList<>();
        materials = new ArrayList<>();
        coments = new ArrayList<>();
        steps.add(new FoodStep(1, "鸡胸片成两大片然后用刀背敲松，切成条再切成块备用"));
        steps.add(new FoodStep(2, "葱切成1.5-2cm的段，姜切片，辣椒用剪刀剪开去除种子"));
        steps.add(new FoodStep(3, "切好的鸡肉用料酒、胡椒粉、生抽酱油调味后淹制15分钟后加入干淀粉拌匀备用"));
        steps.add(new FoodStep(4, "把除水淀粉以外酱汁材料中所有的食材在一个碗里混合备用"));
        steps.add(new FoodStep(5, "锅中加入平时炒菜的油，油热后把调好味的鸡肉滑炒直到看不到粉色的生鸡肉就盛出来"));
        steps.add(new FoodStep(6, "锅中留底油小火，加入花椒、干辣椒炒出香味后加入葱、姜继续炒出香味"));
        steps.add(new FoodStep(7, "转大火加入炒好的鸡肉翻炒，然后加入调好的酱汁稍煮1分钟左右"));
        steps.add(new FoodStep(8, "用水淀粉勾芡后加入炸花生米翻炒均匀就可以出锅了"));
        materials.add(new FoodMaterial("鸡胸肉", "1块"));
        materials.add(new FoodMaterial("白胡椒粉", "1茶勺"));
        materials.add(new FoodMaterial("生抽酱油", "1/2茶勺"));
        materials.add(new FoodMaterial("干淀粉", "1茶勺"));
        materials.add(new FoodMaterial("白糖", "50g"));
        materials.add(new FoodMaterial("葱", "5g"));
        materials.add(new FoodMaterial("姜", "适量"));
        materials.add(new FoodMaterial("干辣椒", "2茶勺"));
        coments.add(new FoodComent(4,true,"蔡蔡","滑炒鸡肉时不要时间太长，否则鸡肉会变老","2015-11-01"));
        coments.add(new FoodComent(4,true,"追随","调味料可以个人口味适当调整用量","2015-09-01"));
        foods[1] =new Food();
        foods[1].foodId = 1;
        foods[1].name = "宫保鸡丁";
        foods[1].introduction = "跟随这个食谱有个传统故事，它讲述这道菜如何从古代演变到今天。它的味道充满层次，酸甜中略带一点辣，因为这些味道的组合让这道菜变的很受欢迎，事实让宫保鸡丁在全世界也是最有名的一道中餐了。你一定要试试这道菜。";
        foods[1].picUrl = picPath+"gongbaojiding.jpg";
        foods[1].videoUrl = picPath+"gongbaojiding.flv";
        foods[1].foodSteps = steps;
        foods[1].foodMaterials = materials;
        foods[1].foodComents = coments;

        steps = new ArrayList<>();
        materials = new ArrayList<>();
        coments = new ArrayList<>();
        steps.add(new FoodStep(1, "饺子皮上加上饺子馅料，对折将上部面皮捏合"));
        steps.add(new FoodStep(2, "两手拇指与食指夹住两侧面皮，用力捏紧"));
        steps.add(new FoodStep(3, "两手向中间挤压，挤出饺子的大肚子来"));
        materials.add(new FoodMaterial("饺子皮", "若干"));
        materials.add(new FoodMaterial("饺子馅", "若干"));
        coments.add(new FoodComent(4,false,"追","看似最简单的包法，其实才是最难整的！！表示学不会！/(ㄒoㄒ)/~~","2015-11-01"));
        coments.add(new FoodComent(1,true,"蔡","在捏的过程中，两手应该是交叠着的，将饺子包在手心","2014-01-01"));
        coments.add(new FoodComent(5,true,"岚小新","用这种方式可以包入更多馅料，不要吝啬哦","2015-04-01"));
        foods[2] =new Food();
        foods[2].foodId = 2;
        foods[2].name = "大肚饺子";
        foods[2].introduction = "肚子鼓鼓的大饺子看起来就很喜庆\n" +
                "饺子的形状有很多，鼓肚子的、长形的，甚至圆圆的三角的\n" +
                "这种用挤的方式来包饺子的方法貌似是多见于北方，一捏一挤速度快包馅多";
        foods[2].picUrl = picPath+"dadujiaozi.jpg";
        foods[2].videoUrl = picPath+"dadujiaozi.flv";
        foods[2].foodSteps = steps;
        foods[2].foodMaterials = materials;
        foods[2].foodComents = coments;

        foodLists = new FoodLists();
        foodLists.recommendFood.add(new FoodRecommend(foods[0].name,foods[0].picUrl,foods[0].foodId));
        foodLists.historyFood.add(new FoodRecommend(foods[1].name,foods[1].picUrl,foods[1].foodId));
        foodLists.popFoods.add(new FoodRecommend(foods[2].name,foods[2].picUrl,foods[2].foodId));
        for (int i = 0; i < 3; i++) {
            foodLists.allFoods.add(new FoodListItem(foods[i].foodId,foods[i].name));
        }
    }
}
