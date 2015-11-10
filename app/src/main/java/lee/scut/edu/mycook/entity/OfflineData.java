package lee.scut.edu.mycook.entity;

import java.util.ArrayList;
import java.util.List;

import lee.scut.edu.mycook.entity.FoodDetails.Food;
import lee.scut.edu.mycook.entity.FoodDetails.FoodComent;
import lee.scut.edu.mycook.entity.FoodDetails.FoodMaterial;
import lee.scut.edu.mycook.entity.FoodDetails.FoodStep;
import lee.scut.edu.mycook.entity.FoodLists.FoodLists;
import lee.scut.edu.mycook.entity.FoodLists.FoodRecommend;

/**
 * Created by jsonlee on 11/10/15.
 */
public class OfflineData {
    String picPath = "/sdcard/chushitong";
    public Food[] foods;

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
        foods[0].picUrl = "/sdcard/chushitong/manyuequqi.jpg";
        foods[0].videoUrl = "/sdcard/chushitong/manyuequqi.flv";
        foods[0].foodSteps = steps;
        foods[0].foodMaterials = materials;
        foods[0].foodComents = coments;
    }
}
