package lee.scut.edu.mycook.entity;

import com.google.gson.Gson;

import java.util.List;

import lee.scut.edu.mycook.entity.FoodDetails.Food;
import lee.scut.edu.mycook.entity.FoodLists.FoodListItem;
import lee.scut.edu.mycook.entity.FoodLists.FoodLists;
import lee.scut.edu.mycook.entity.FoodLists.FoodRecommend;

/**
 * Created by jsonlee on 11/10/15.
 */
public class OfflineData {
    public static class FoodArray{
        public List<Food> foodArray;
    }
    final String json = "{\"foodArray\":[{\"id\": 14,\"name\": \"剁椒鱼头\",\"introduction\": \"剁椒鱼头属湘菜系，是湖南的一道名菜\",\"isFavorite\": true,\"isUp\": true,\"picUrl\": \"/sdcard/chushitong/14.jpg\",\"videoUrl\": \"/sdcard/chushitong/dadujiaozi.flv\",\"foodMaterials\": [{\"materialName\": \"鱼头\",\"weight\": \"500克\"},{\"materialName\": \"花生油\",\"weight\": \"3汤匙\"},{\"materialName\": \"姜\",\"weight\": \"1小块\"},{\"materialName\": \"料酒\",\"weight\": \"1茶匙\"},{\"materialName\": \"细香葱\",\"weight\": \"5棵\"},{\"materialName\": \"食盐\",\"weight\": \"1/2茶匙\"},{\"materialName\": \"蒜\",\"weight\": \"5瓣\"},{\"materialName\": \"鱼露\",\"weight\": \"1茶匙\"},{\"materialName\": \"剁椒\",\"weight\": \"4茶匙\"}],\"foodSteps\": [{\"number\": 1,\"step\": \"将鱼头洗净，去腮，去鳞。准备好自制剁椒和姜、葱、蒜\"},{\"number\": 2,\"step\": \"把姜切丝加入鱼头\"},{\"number\": 3,\"step\": \"加入适量盐\"},{\"number\": 4,\"step\": \"加入料酒，抓匀腌制20分钟\"},{\"number\": 5,\"step\": \"腌好后在鱼头上盖上自制剁椒\"},{\"number\": 6,\"step\": \"热水上锅中火蒸十分钟\"},{\"number\": 7,\"step\": \"蒸鱼时把葱蒜切碎\"},{\"number\": 8,\"step\": \"把葱蒜均匀的撒在鱼头上\"},{\"number\": 9,\"step\": \"另起锅放一大勺油烧至冒烟\"},{\"number\": 10,\"step\": \"把烧热的油均匀的淋在鱼头上\"},{\"number\": 11,\"step\": \"最后淋少许的鱼露提味\"}],\"foodComents\": [{\"grade\": 5,\"done\": true,\"userName\": \"时光倒转\",\"content\": \"好吃的鱼头，热乎乎的\",\"time\": \"2015.11.01 15:03:09\"},{\"grade\": 4,\"done\": false,\"userName\": \"杭州网友\",\"content\": \"想做，收藏了\",\"time\": \"2015.09.26 07:21:32\"}]},{\"id\": 10,\"name\": \"家常版烧鸭\",\"introduction\": \"家庭版烧鸭简便易做，有烤箱就轻松解决了，味道也很赞\",\"isFavorite\": true,\"isUp\": true,\"picUrl\": \"/sdcard/chushitong/10.jpg\",\"videoUrl\": \"/sdcard/chushitong/dadujiaozi.flv\",\"foodMaterials\": [{\"materialName\": \"鸭\",\"weight\": \"1/2只\"},{\"materialName\": \"芝麻油\",\"weight\": \"1/2茶匙\"},{\"materialName\": \"五香粉\",\"weight\": \"1茶匙\"},{\"materialName\": \"老抽\",\"weight\": \"1/2茶匙\"},{\"materialName\": \"蒜\",\"weight\": \"5瓣\"},{\"materialName\": \"姜\",\"weight\": \"一小块\"},{\"materialName\": \"食盐\",\"weight\": \"3茶匙\"},{\"materialName\": \"生抽\",\"weight\": \"4茶匙\"},{\"materialName\": \"白糖\",\"weight\": \"1茶匙\"},{\"materialName\": \"麦芽糖\",\"weight\": \"1茶匙\"},{\"materialName\": \"水\",\"weight\": \"适量\"}],\"foodSteps\": [{\"number\": 1,\"step\": \"半只鸭处理干净\"},{\"number\": 2,\"step\": \"把蒜和姜剁碎，用生抽、食盐、芝麻油、白糖、五香粉搅匀做腌味料\"},{\"number\": 3,\"step\": \"把姜、蒜和腌料倒在鹅上，用手把料汁抹均匀，并按摩一会，然后腌制约2小时，中途翻面并按摩\"},{\"number\": 4,\"step\": \"腌好后把鹅上的姜和蒜去掉，放在网上风干水分\"},{\"number\": 5,\"step\": \"风干后再鹅的上下刷上蜜汁，蜜汁用麦芽糖和温水调成\"},{\"number\": 6,\"step\": \"烤箱先预热两分钟，烤盘上铺上锡纸接油，把鹅放在烤网上，置烤箱上数第三层，上下火加热风，温度调至220度，先烤25分钟\"},{\"number\": 7,\"step\": \"取出鹅，把鹅翅和腿下面容易焦的部分用锡纸抱起来，再刷一次蜜汁\"},{\"number\": 8,\"step\": \"接着入烤箱上下火210度再烤20分钟即可\"}],\"foodComents\": [{\"grade\": 5,\"done\": false,\"userName\": \"深圳网友\",\"content\": \"好饿，回家做饭吃！\",\"time\": \"2015.09.28 12:36:43\"},{\"grade\": 4,\"done\": false,\"userName\": \"西宁网友\",\"content\": \"简单实用，但卤汁怎么做呢\",\"time\": \"2015.11.02 23:02:05\"}]},{\"id\": 2,\"name\": \"广东烤鸭\",\"introduction\": \"在烧腊店里，最出名的莫过于烧鸭和叉烧了\",\"isFavorite\": true,\"isUp\": true,\"picUrl\": \"/sdcard/chushitong/2.jpg\",\"videoUrl\": \"/sdcard/chushitong/dadujiaozi.flv\",\"foodMaterials\": [{\"materialName\": \"盐\",\"weight\": \"2茶匙\"},{\"materialName\": \"蚝油\",\"weight\": \"1汤匙\"},{\"materialName\": \"八角\",\"weight\": \"1/2个\"},{\"materialName\": \"蒜子\",\"weight\": \"1/2个\"},{\"materialName\": \"蜂蜜\",\"weight\": \"15克\"},{\"materialName\": \"酱油\",\"weight\": \"2汤匙\"},{\"materialName\": \"白糖\",\"weight\": \"1/2茶匙\"},{\"materialName\": \"黑椒粉\",\"weight\": \"1/2茶匙\"},{\"materialName\": \"生姜\",\"weight\": \"5克\"}],\"foodSteps\": [{\"number\": 1,\"step\": \"把鸭子清理干净，沥干水分\"},{\"number\": 2,\"step\": \"八角、生姜、蒜子拍扁剁碎放容器里\"},{\"number\": 3,\"step\": \"加入黑椒粉\"},{\"number\": 4,\"step\": \"再加进白糖、酱油、蚝油、米酒拌匀\"},{\"number\": 5,\"step\": \"再把调好的酱汁均匀涂至鸭身上（里外均要涂）\"},{\"number\": 6,\"step\": \"用保鲜袋封号，腌制一天（中途需要翻面）\"},{\"number\": 7,\"step\": \"把腌制好的鸭子用烤架晾起，放冰箱里风干表面水分\"},{\"number\": 8,\"step\": \"烤箱提前预热，把鸭子连同烤架一起放进，底下放烤盘（因为会出大量出油，，所以需铺油纸或锡纸），上下火160度烤90分钟（中途需翻另一面烤）\"},{\"number\": 9,\"step\": \"时间到后再拿出涂上一层蜂蜜，再继续烤10分钟\"}],\"foodComents\": [{\"grade\": 5,\"done\": false,\"userName\": \"厦门网友\",\"content\": \"go go go\",\"time\": \"2015.11.09 12:36:43\"},{\"grade\": 4,\"done\": false,\"userName\": \"dadada\",\"content\": \"不错，简单实用，超赞\",\"time\": \"2015.11.02 23:02:05\"}]},{\"id\": 7,\"name\": \"潮汕红壳桃\",\"introduction\": \"潮汕民间习俗，凡时年八节，几乎家家户户都要做红桃粿、酵粿、白桃饭\",\"isFavorite\": true,\"isUp\": false,\"picUrl\": \"/sdcard/chushitong/7.jpg\",\"videoUrl\": \"/sdcard/chushitong/dadujiaozi.flv\",\"foodMaterials\": [{\"materialName\": \"糯米粉\",\"weight\": \"2000克\"},{\"materialName\": \"香菇\",\"weight\": \"300克\"},{\"materialName\": \"虾米\",\"weight\": \"300克\"},{\"materialName\": \"糯米\",\"weight\": \"768克\"},{\"materialName\": \"猪肉\",\"weight\": \"600克\"},{\"materialName\": \"花生油\",\"weight\": \"12碗\"},{\"materialName\": \"白糖\",\"weight\": \"300克\"},{\"materialName\": \"葱\",\"weight\": \"80克\"}],\"foodSteps\": [{\"number\": 1,\"step\": \"糯米浸水\"},{\"number\": 2,\"step\": \"将糯米磨成糯米粉\"},{\"number\": 3,\"step\": \"把馅料炒制好\"},{\"number\": 4,\"step\": \"磨好的糯米粉和水和成团\"},{\"number\": 5,\"step\": \"模具内滴入适量油\"},{\"number\": 6,\"step\": \"包上馅料，像平常包包子的手法大概一致\"},{\"number\": 7,\"step\": \"然后扣在模具上，倒扣即可\"},{\"number\": 8,\"step\": \"铺上香蕉叶，上锅蒸20分钟左右即可\"}],\"foodComents\": [{\"grade\": 4,\"done\": false,\"userName\": \"杰米\",\"content\": \"有特色\",\"time\": \"2015.10.27 02:47:43\"},{\"grade\": 3,\"done\": true,\"userName\": \"汕头网友\",\"content\": \"还欠一种粉\",\"time\": \"2015.07.17 18:30:48\"}]},{\"id\": 5,\"name\": \"豉油鸡\",\"introduction\": \"豉油鸡菜肉的质地很重要，而且做法不一，但是简单容易做\",\"isFavorite\": true,\"isUp\": false,\"picUrl\": \"/sdcard/chushitong/5.jpg\",\"videoUrl\": \"/sdcard/chushitong/dadujiaozi.flv\",\"foodMaterials\": [{\"materialName\": \"鸡\",\"weight\": \"1000克\"},{\"materialName\": \"海天酱油\",\"weight\": \"适量\"},{\"materialName\": \"蒜头\",\"weight\": \"3瓣\"},{\"materialName\": \"红米酒\",\"weight\": \"2小杯\"},{\"materialName\": \"花生油\",\"weight\": \"3汤匙\"},{\"materialName\": \"姜\",\"weight\": \"2小块\"},{\"materialName\": \"糖\",\"weight\": \"2汤匙\"},{\"materialName\": \"香葱\",\"weight\": \"3根\"}],\"foodSteps\": [{\"number\": 1,\"step\": \"先把姜削干净切片并切成姜丝，再拍蒜头，把葱切段备用\"},{\"number\": 2,\"step\": \"先往鸡身倒进大约半肚子酱油用手伸入鸡肚按摩，把酱油抹匀，再把切好的姜丝，部分葱蒜放进鸡肚中，然后把酱油浇到鸡身上使整个鸡身沾上酱油，腌制30分钟\"},{\"number\": 3,\"step\": \"放3~4汤匙油下锅烧热，放鸡下去不断翻身，炸至金黄然后加入清水、剩余葱段、蒜头，开大火盖锅浇滚\"},{\"number\": 4,\"step\": \"加两汤匙糖，两小杯红米酒，转小火慢焖至干水即可上碟切块\"}],\"foodComents\": [{\"grade\": 2,\"done\": false,\"userName\": \"永州网友\",\"content\": \"豉油鸡根本不是这样做的，这样做出来就老了根本就不爽口\",\"time\": \"2015.09.07 17:01:43\"},{\"grade\": 3,\"done\": false,\"userName\": \"奶茶莫莫\",\"content\": \"大约炖多长时间呢？\",\"time\": \"2015.03.09 11:42:48\"}]},{\"id\": 9,\"name\": \"广式萝卜糕\",\"introduction\": \"一道非常经典的方式点心，口感软糯，口味独特，配粥非常棒\",\"isFavorite\": true,\"isUp\": true,\"picUrl\": \"/sdcard/chushitong/9.jpg\",\"videoUrl\": \"/sdcard/chushitong/dadujiaozi.flv\",\"foodMaterials\": [{\"materialName\": \"白萝卜\",\"weight\": \"1根\"},{\"materialName\": \"香菇\",\"weight\": \"3朵\"},{\"materialName\": \"粘米粉\",\"weight\": \"250克\"},{\"materialName\": \"广东香肠\",\"weight\": \"2根\"},{\"materialName\": \"虾皮\",\"weight\": \"一把\"},{\"materialName\": \"食盐\",\"weight\": \"1小勺\"},{\"materialName\": \"胡椒粉\",\"weight\": \"适量\"},{\"materialName\": \"植物油\",\"weight\": \"30毫升\"},{\"materialName\": \"蚝油\",\"weight\": \"2勺\"},{\"materialName\": \"水\",\"weight\": \"适量\"}],\"foodSteps\": [{\"number\": 1,\"step\": \"粘米粉加适量清水（粘米粉和水的比例为2:1），调入盐搅拌均匀，静置一会再搅拌至无颗粒\"},{\"number\": 2,\"step\": \"香肠、香菇都切成小丁，白萝卜擦成丝，撒盐，腌10分钟，挤干水分\"},{\"number\": 3,\"step\": \"起油锅，放香肠煸炒，然后加入香菇一起煸炒\"},{\"number\": 4,\"step\": \"放萝卜丝炒匀，加虾皮继续翻炒一会\"},{\"number\": 5,\"step\": \"将米浆加进去，慢慢搅拌至米浆凝固\"},{\"number\": 6,\"step\": \"取容器，周围抹上油，倒入炒好的料，稍压实\"},{\"number\": 7,\"step\": \"盖上保鲜膜，上锅蒸1个小时\"},{\"number\": 8,\"step\": \"待冷却后切成小块，放平底锅煎至两面金黄即可\"}],\"foodComents\": [{\"grade\": 5,\"done\": false,\"userName\": \"杰米\",\"content\": \"喜欢，收藏了\",\"time\": \"2015.10.25 06:47:43\"},{\"grade\": 2,\"done\": true,\"userName\": \"深圳网友\",\"content\": \"不正宗\",\"time\": \"2014.12.13 13:58:48\"}]},{\"id\": 8,\"name\": \"油榄角蒸鲈鱼\",\"introduction\": \"广东的朋友经常会用油榄角蒸鱼、排骨，味道清香四溢\",\"isFavorite\": true,\"isUp\": false,\"picUrl\": \"/sdcard/chushitong/8.jpg\",\"videoUrl\": \"/sdcard/chushitong/dadujiaozi.flv\",\"foodMaterials\": [{\"materialName\": \"鲈鱼\",\"weight\": \"1条\"},{\"materialName\": \"植物油\",\"weight\": \"2汤匙\"},{\"materialName\": \"白糖\",\"weight\": \"1茶匙\"},{\"materialName\": \"红椒\",\"weight\": \"少许\"},{\"materialName\": \"油榄角\",\"weight\": \"20克\"},{\"materialName\": \"食盐\",\"weight\": \"1茶匙\"},{\"materialName\": \"蒸鱼豉油\",\"weight\": \"2茶匙\"},{\"materialName\": \"葱\",\"weight\": \"10克\"},{\"materialName\": \"姜\",\"weight\": \"10克\"}],\"foodSteps\": [{\"number\": 1,\"step\": \"鲈鱼剖好后，沥干水，并在鱼身上抹上适量的盐，如果想让鱼更鲜甜，可以再放入少许的糖抹在鱼身上\"},{\"number\": 2,\"step\": \"接着在盘子底部放上几片姜，再把鱼放在上面，并且在鱼肚子里放入姜丝、葱段、油榄角\"},{\"number\": 3,\"step\": \"再切上一些红椒丝摆放在鱼身上\"},{\"number\": 4,\"step\": \"一定是水开后才放鱼进去蒸制，蒸上十分钟即可\"},{\"number\": 5,\"step\": \"取出把盘子里的汤汁滗掉，然后倒上蒸鱼豉油\"},{\"number\": 6,\"step\": \"放入葱丝，浇上热油，大功告成\"}],\"foodComents\": [{\"grade\": 2,\"done\": true,\"userName\": \"湖州网友\",\"content\": \"蒸鱼蒸十分钟？\",\"time\": \"2015.10.01 23:08:43\"},{\"grade\": 3,\"done\": false,\"userName\": \"柳州网友\",\"content\": \"油榄角是什么？我们这里貌似没有\",\"time\": \"2015.09.12 18:30:48\"}]},{\"id\": 1,\"name\": \"清蒸大闸蟹\",\"introduction\": \"秋风起，蟹脚肥，又到了吃蟹的季节，要让这个秋天完满不是，清蒸最是鲜美了\",\"isFavorite\": true,\"isUp\": true,\"picUrl\": \"/sdcard/chushitong/1.jpg\",\"videoUrl\": \"/sdcard/chushitong/dadujiaozi.flv\",\"foodMaterials\": [{\"materialName\": \"葱油\",\"weight\": \"1汤匙\"},{\"materialName\": \"香醋\",\"weight\": \"1汤匙\"},{\"materialName\": \"小葱\",\"weight\": \"1根\"},{\"materialName\": \"蒸鱼豉油\",\"weight\": \"1汤匙\"},{\"materialName\": \"姜\",\"weight\": \"15克\"},{\"materialName\": \"料酒\",\"weight\": \"1汤匙\"}],\"foodSteps\": [{\"number\": 1,\"step\": \"大闸蟹用刷子把外壳刷洗干净\"},{\"number\": 2,\"step\": \"蒸锅中放水，把姜片与小葱洁放入锅中\"},{\"number\": 3,\"step\": \"倒入一汤匙料酒，开大火，把水烧开\"},{\"number\": 4,\"step\": \"锅中水开后，把大闸蟹放入蒸锅，注意要把肚皮朝上，蒸15分钟即可取出\"},{\"number\": 5,\"step\": \"姜切细丝\"},{\"number\": 6,\"step\": \"加入蒸鱼豉油，葱油，香醋拌匀成蘸汁\"}],\"foodComents\": [{\"grade\": 5,\"done\": false,\"userName\": \"深圳网友\",\"content\": \"有创意，收藏了 不错\",\"time\": \"2015.11.09 12:36:43\"},{\"grade\": 4,\"done\": true,\"userName\": \"小马杨\",\"content\": \"孩子的大爱\",\"time\": \"2015.11.02 23:02:05\"}]},{\"id\": 13,\"name\": \"麻婆豆腐\",\"introduction\": \"有名的川菜，让你流口水\",\"isFavorite\": true,\"isUp\": false,\"picUrl\": \"/sdcard/chushitong/13.jpg\",\"videoUrl\": \"/sdcard/chushitong/dadujiaozi.flv\",\"foodMaterials\": [{\"materialName\": \"豆腐\",\"weight\": \"100g\"},{\"materialName\": \"辣酱\",\"weight\": \"1勺\"},{\"materialName\": \"酱油\",\"weight\": \"1小碟\"},{\"materialName\": \"大蒜\",\"weight\": \"半颗\"}],\"foodSteps\": [{\"number\": 1,\"step\": \"豆腐切块，装盘，要嫩\"},{\"number\": 2,\"step\": \"辣酱炒熟，淋在豆腐上\"},{\"number\": 3,\"step\": \"等待十分钟，豆腐充分吸收\"}],\"foodComents\": [{\"grade\": 5,\"done\": true,\"userName\": \"萌萌哒是我\",\"content\": \"这么简单就能做，十分钟就会了\",\"time\": \"2015.09.0814:32\"},{\"grade\": 2,\"done\": false,\"userName\": \"叶良辰来也\",\"content\": \"辣酱要选对，我偏爱湖南的辣酱，正宗\",\"time\": \"2015.10.0809:12\"}]},{\"id\": 4,\"name\": \"广式脆皮烧肉\",\"introduction\": \"烧肉是广东人最喜欢的食品之一，是烧腊店的必备良品\",\"isFavorite\": true,\"isUp\": false,\"picUrl\": \"/sdcard/chushitong/4.jpg\",\"videoUrl\": \"/sdcard/chushitong/dadujiaozi.flv\",\"foodMaterials\": [{\"materialName\": \"五花肉\",\"weight\": \"500克\"},{\"materialName\": \"五香粉\",\"weight\": \"1茶匙\"},{\"materialName\": \"食盐\",\"weight\": \"8克\"},{\"materialName\": \"料酒\",\"weight\": \"2茶匙\"},{\"materialName\": \"小苏打\",\"weight\": \"少许\"},{\"materialName\": \"食用油\",\"weight\": \"2汤匙\"},{\"materialName\": \"香葱\",\"weight\": \"3棵\"},{\"materialName\": \"姜\",\"weight\": \"3片\"}],\"foodSteps\": [{\"number\": 1,\"step\": \"将五花肉洗净，然后凉水下锅，放入葱、姜和1茶匙料酒，慢慢煮至肉变色，用筷子扎一下，没有血水溢出\"},{\"number\": 2,\"step\": \"肉煮熟后立即捞出来凉水洗干净，用镊子把毛拔干净，再用牙签插洞孔\"},{\"number\": 3,\"step\": \"抹上小苏打，再在猪皮抹上半茶匙的盐，腌20分钟左右\"},{\"number\": 4,\"step\": \"翻到肉一面把肉划开，划到快接近脂肪时就好，不要划断猪皮\"},{\"number\": 5,\"step\": \"切好后把肉与肉的缝隙、左右侧边都抹上五香粉，肉皮不能抹五香粉，否则烤的时候颜色就不好看了\"},{\"number\": 6,\"step\": \"五香粉抹好后在抹入适量的盐，肉的缝隙、表面与侧面都要抹入\"},{\"number\": 7,\"step\": \"放在考网架自然风干肉块水分并入味2小时以上\"},{\"number\": 8,\"step\": \"周围的锡纸围起来仅裸露肉块的皮面，放入烤箱，将温度设置到最高温度230度，上下加热，烤制时间约45分钟\"},{\"number\": 9,\"step\": \"从烤箱取出，然后涂一层食用油，然后将它放回烤箱中烤制至表皮油干取出\"}],\"foodComents\": [{\"grade\": 3,\"done\": false,\"userName\": \"苏州网友\",\"content\": \"一共是45分钟还是45分钟拿出来刷油继续烤？不明\",\"time\": \"2015.08.14 21:48:21\"},{\"grade\": 2,\"done\": false,\"userName\": \"盘锦网友\",\"content\": \"和肖肉差不多吧，吐槽一下\",\"time\": \"2015.08.05 18:46:48\"},{\"grade\": 4,\"done\": true,\"userName\": \"杰米\",\"content\": \"步骤麻烦，但是成品很好吃\",\"time\": \"2015.07.14 10:51:16\"}]},{\"id\": 11,\"name\": \"急汁牛肉球\",\"introduction\": \"牛肉球是点心的一种，在珠三角地区，如广东、香港很常见\",\"isFavorite\": true,\"isUp\": true,\"picUrl\": \"/sdcard/chushitong/11.jpg\",\"videoUrl\": \"/sdcard/chushitong/dadujiaozi.flv\",\"foodMaterials\": [{\"materialName\": \"牛肉\",\"weight\": \"250克\"},{\"materialName\": \"香油\",\"weight\": \"1勺\"},{\"materialName\": \"胡椒粉\",\"weight\": \"1勺\"},{\"materialName\": \"马蹄\",\"weight\": \"80克\"},{\"materialName\": \"急汁\",\"weight\": \"30克\"},{\"materialName\": \"姜\",\"weight\": \"一块\"},{\"materialName\": \"食盐\",\"weight\": \"1勺\"},{\"materialName\": \"猪肉（肥）\",\"weight\": \"60克\"},{\"materialName\": \"葱\",\"weight\": \"1根\"},{\"materialName\": \"陈皮\",\"weight\": \"1块\"}],\"foodSteps\": [{\"number\": 1,\"step\": \"准备材料，牛肉250克、肥猪肉60克、姜、葱、陈皮\"},{\"number\": 2,\"step\": \"马蹄洗净去皮切成细碎粒，葱、姜切末，陈皮切碎\"},{\"number\": 3,\"step\": \"牛肉和肥猪肉切成小块，加入姜末，放入料理机打成牛肉馅\"},{\"number\": 4,\"step\": \"牛肉馅里加入食盐、白糖、胡椒粉、香油、生粉仔细搅拌\"},{\"number\": 5,\"step\": \"加入陈皮、马蹄、葱，一边加水一边大力摔肉，直到绞肉有弹性且不粘手即可\"},{\"number\": 6,\"step\": \"摔打好的肉馅用手捏住虎口挤出肉球来，记得是挤，肉放在手心里在拇指和食指中间挤出来，这样的肉球才有弹性\"},{\"number\": 7,\"step\": \"把做好的牛肉球放到锅中大火蒸十五分钟，中途不开盖\"},{\"number\": 8,\"step\": \"吃的时候蘸着急汁\"}],\"foodComents\": [{\"grade\": 5,\"done\": false,\"userName\": \"紫气东来\",\"content\": \"马蹄是什么食材啊？\",\"time\": \"2015.05.08 20:56:43\"},{\"grade\": 4,\"done\": false,\"userName\": \"东方不败\",\"content\": \"哪天我要试试\",\"time\": \"2015.01.13 19:52:05\"}]},{\"id\": 12,\"name\": \"菠萝咕噜肉\",\"introduction\": \"自己在家就能做的菜，好吃易做\",\"isFavorite\": true,\"isUp\": false,\"picUrl\": \"/sdcard/chushitong/12.jpg\",\"videoUrl\": \"/sdcard/chushitong/dadujiaozi.flv\",\"foodMaterials\": [{\"materialName\": \"猪里脊肉\",\"weight\": \"300克\"},{\"materialName\": \"菠萝\",\"weight\": \"1/2个\"},{\"materialName\": \"红皮洋葱\",\"weight\": \"1个\"},{\"materialName\": \"鸡蛋\",\"weight\": \"1个\"},{\"materialName\": \"白糖\",\"weight\": \"10克\"},{\"materialName\": \"水淀粉\",\"weight\": \"100克\"},{\"materialName\": \"水\",\"weight\": \"适量\"},{\"materialName\": \"青椒\",\"weight\": \"1/2个\"},{\"materialName\": \"蒜\",\"weight\": \"5瓣\"},{\"materialName\": \"番茄酱\",\"weight\": \"50克\"},{\"materialName\": \"米醋\",\"weight\": \"10克\"},{\"materialName\": \"食盐\",\"weight\": \"适量\"}],\"foodSteps\": [{\"number\": 1,\"step\": \"洋葱、青椒和红椒切滚刀块备用\"},{\"number\": 2,\"step\": \"菠萝切块用淡盐水浸泡备用\"},{\"number\": 3,\"step\": \"里脊切菠萝大小块，放入料酒和盐腌制10分钟\"},{\"number\": 4,\"step\": \"番茄酱加白糖、食盐、米醋，搅拌均匀备用\"},{\"number\": 5,\"step\": \"里脊肉加鸡蛋，使蛋液均匀的裹在每块里脊肉上\"},{\"number\": 6,\"step\": \"将裹好蛋液的里脊肉放淀粉中，使每块肉均匀的裹满淀粉\"},{\"number\": 7,\"step\": \"锅内倒入油，中小火炸至白色捞出；再大火把油烧至冒烟复炸里脊至金黄色捞出，这样口感才会外焦里嫩\"},{\"number\": 8,\"step\": \"锅内放入油，倒入洋葱青红椒炒至半熟，盛出备用，再放入蒜末，煸炒出香味\"},{\"number\": 9,\"step\": \"倒入调好的番茄酱，放入菠萝\"},{\"number\": 10,\"step\": \"依次放入洋葱、里脊肉煸炒三分钟后加水淀粉\"},{\"number\": 11,\"step\": \"最后加香油即可\"}],\"foodComents\": [{\"grade\": 5,\"done\": true,\"userName\": \"王的男人\",\"content\": \"喜欢这道菜酸酸甜甜的味道\",\"time\": \"2015.08.24 10:37:43\"},{\"grade\": 4,\"done\": false,\"userName\": \"糯米甜甜\",\"content\": \"挺好吃的样子\",\"time\": \"2014.12.28 17:37:34\"}]},{\"id\": 6,\"name\": \"广式脆皮凤爪\",\"introduction\": \"豉汁蒸风爪，一道粤式茶楼里经典的一款早茶茶点\",\"isFavorite\": true,\"isUp\": false,\"picUrl\": \"/sdcard/chushitong/6.jpg\",\"videoUrl\": \"/sdcard/chushitong/dadujiaozi.flv\",\"foodMaterials\": [{\"materialName\": \"鸡爪\",\"weight\": \"500克\"},{\"materialName\": \"花生米\",\"weight\": \"100克\"},{\"materialName\": \"姜葱蒜\",\"weight\": \"30克\"},{\"materialName\": \"料酒\",\"weight\": \"1茶匙\"},{\"materialName\": \"食盐\",\"weight\": \"1茶匙\"},{\"materialName\": \"食用油\",\"weight\": \"适量\"},{\"materialName\": \"红烧酱油\",\"weight\": \"1茶匙\"},{\"materialName\": \"生粉\",\"weight\": \"少许\"},{\"materialName\": \"豆豉\",\"weight\": \"15克\"},{\"materialName\": \"小红椒\",\"weight\": \"10克\"},{\"materialName\": \"胡椒粉\",\"weight\": \"少许\"},{\"materialName\": \"白糖\",\"weight\": \"1.5茶匙\"},{\"materialName\": \"生抽\",\"weight\": \"1茶匙\"},{\"materialName\": \"蚝油\",\"weight\": \"1茶匙\"}],\"foodSteps\": [{\"number\": 1,\"step\": \"风爪洗净对半剖开\"},{\"number\": 2,\"step\": \"放入小锅中，加入葱、姜、料酒，小火焯烫去血沫\"},{\"number\": 3,\"step\": \"捞出后，再次冲洗干净上面的污物\"},{\"number\": 4,\"step\": \"沥干水后，用少量的红烧酱油上上色\"},{\"number\": 5,\"step\": \"用吸油纸垫着，吸干水分，务必要充分吸干，以防后面炸的时候会炸锅烫伤自己\"},{\"number\": 6,\"step\": \"油温达七成，下风爪，炸至金黄\"},{\"number\": 7,\"step\": \"捞出来，用清水浸泡，知道表面起皱为止\"},{\"number\": 8,\"step\": \"风爪沥干水放入大碗中，加入泡发好的花生米，放入适量的油、盐、糖、生抽、红烧酱油、蚝油、胡椒粉、料酒、生粉、葱、姜、蒜、小红椒碎、豆豉粒\"},{\"number\": 9,\"step\": \"充分拌匀，封上保鲜膜，伤锅蒸60分钟即可\"}],\"foodComents\": [{\"grade\": 5,\"done\": false,\"userName\": \"中山网友\",\"content\": \"本人很喜欢这道菜，先收藏了\",\"time\": \"2015.10.06 09:58:21\"},{\"grade\": 5,\"done\": false,\"userName\": \"杰米\",\"content\": \"看起来好好吃\",\"time\": \"2015.08.05 18:46:48\"},{\"grade\": 3,\"done\": true,\"userName\": \"隐形蝴蝶\",\"content\": \"为什么要放生粉呢\",\"time\": \"2015.07.14 10:51:16\"}]},{\"id\": 3,\"name\": \"香菇滑鸡煲仔饭\",\"introduction\": \"煲仔饭，饭菜一锅端！\",\"isFavorite\": false,\"isUp\": false,\"picUrl\": \"/sdcard/chushitong/3.jpg\",\"videoUrl\": \"/sdcard/chushitong/dadujiaozi.flv\",\"foodMaterials\": [{\"materialName\": \"大米\",\"weight\": \"150克\"},{\"materialName\": \"鸡蛋\",\"weight\": \"1个\"},{\"materialName\": \"香菇\",\"weight\": \"4个\"},{\"materialName\": \"鸡腿\",\"weight\": \"1个\"},{\"materialName\": \"菜心\",\"weight\": \"8棵\"},{\"materialName\": \"色拉油\",\"weight\": \"2勺\"},{\"materialName\": \"烤肉酱\",\"weight\": \"2勺\"},{\"materialName\": \"盐\",\"weight\": \"少许\"},{\"materialName\": \"生抽\",\"weight\": \"2勺\"},{\"materialName\": \"香油\",\"weight\": \"0.5勺\"},{\"materialName\": \"料酒\",\"weight\": \"1勺\"},{\"materialName\": \"蒜头\",\"weight\": \"2瓣\"},{\"materialName\": \"蚝油\",\"weight\": \"1勺\"},{\"materialName\": \"砂糖\",\"weight\": \"0.5勺\"}],\"foodSteps\": [{\"number\": 1,\"step\": \"大鸡腿去骨头，切成长块，不要太细\"},{\"number\": 2,\"step\": \"鸡块放进碗里，加入料酒和烤肉酱腌制2小时\"},{\"number\": 3,\"step\": \"大米淘洗干净后浸泡一小时\"},{\"number\": 4,\"step\": \"香菇清洗干净后2个切小块，2个切花\"},{\"number\": 5,\"step\": \"起油锅爆香蒜片\"},{\"number\": 6,\"step\": \"放入鸡腿翻炒，加入香菇一起翻炒\"},{\"number\": 7,\"step\": \"加点盐、生抽、砂糖一起煮到鸡肉变色盛出备用\"},{\"number\": 8,\"step\": \"菜心和2个整香菇一起焯水，加点盐和油煮熟后捞出备用\"},{\"number\": 9,\"step\": \"砂锅里刷上油，加入侵泡过的大米后加入适量清水河油开始煮饭\"},{\"number\": 10,\"step\": \"煮开后转小火用勺子搅拌一下以防粘底，继续煮到米饭有小孔\"},{\"number\": 11,\"step\": \"加入炒好的鸡腿香菇，盖上盖子小火煮10分钟\"},{\"number\": 12,\"step\": \"加入一个鸡蛋后关火焖15分钟，最后加入菜心\"},{\"number\": 13,\"step\": \"炒鸡腿香菇汁水可以加入或者调一个浇汁：蚝油1勺、生抽2勺、砂糖0.5勺、香油0.5勺，加适量冷开水调匀，把浇汁淋在煲仔饭上拌匀即可\"}],\"foodComents\": [{\"grade\": 5,\"done\": true,\"userName\": \"陈先生\",\"content\": \"蛮好吃的，自己加了一点辣更好吃\",\"time\": \"2015.10.07 12:59:21\"},{\"grade\": 3,\"done\": false,\"userName\": \"gabriell\",\"content\": \"好难做看起来\",\"time\": \"2015.08.12 13:04:05\"}]},{\"id\": 15,\"name\": \"香辣虾\",\"introduction\": \"香辣虾是一道汁浓、麻辣味浓、肉质紧韧爽脆的名菜\",\"isFavorite\": true,\"isUp\": true,\"picUrl\": \"/sdcard/chushitong/15.jpg\",\"videoUrl\": \"/sdcard/chushitong/dadujiaozi.flv\",\"foodMaterials\": [{\"materialName\": \"虾\",\"weight\": \"500克\"},{\"materialName\": \"花生油\",\"weight\": \"30克\"},{\"materialName\": \"姜\",\"weight\": \"4片\"},{\"materialName\": \"料酒\",\"weight\": \"1勺\"},{\"materialName\": \"干辣椒\",\"weight\": \"15克\"},{\"materialName\": \"芹菜\",\"weight\": \"2根\"},{\"materialName\": \"蒜\",\"weight\": \"3瓣\"},{\"materialName\": \"鱼露\",\"weight\": \"2勺\"},{\"materialName\": \"四川麻辣酱\",\"weight\": \"1勺\"},{\"materialName\": \"干花椒\",\"weight\": \"5克\"}],\"foodSteps\": [{\"number\": 1,\"step\": \"虾开背，挑去虾线，清水冲洗\"},{\"number\": 2,\"step\": \"干辣椒段，生姜，大蒜切成粒\"},{\"number\": 3,\"step\": \"准备四川麻辣酱适量\"},{\"number\": 4,\"step\": \"热锅热油小火将虾炒至金黄，盛出备用\"},{\"number\": 5,\"step\": \"锅留底油小火放入姜、蒜爆香，加入四川麻辣酱炒香\"},{\"number\": 6,\"step\": \"再下干辣椒和干花椒炒香\"},{\"number\": 7,\"step\": \"接着加入炸过的虾大火快速翻炒均匀\"},{\"number\": 8,\"step\": \"烹入少许料酒，鱼露，撒入芹菜段翻炒均匀即可\"}],\"foodComents\": [{\"grade\": 3,\"done\": true,\"userName\": \"南宁网友\",\"content\": \"炸虾有什么技巧吗？我做的肉老是粘壳，不好剥\",\"time\": \"2015.10.28 15:03:09\"},{\"grade\": 4,\"done\": false,\"userName\": \"丹丹\",\"content\": \"看起来好好吃\",\"time\": \"2015.07.17 07:21:32\"}]}]}";
    String picPath = "/sdcard/chushitong/";
    public List<Food> foods;
    public FoodLists foodLists;

    public OfflineData() {
        Gson gson = new Gson();
        foods  = gson.fromJson(json,FoodArray.class).foodArray;
        foodLists = new FoodLists();
        for (int i = 0; i < 5; i++) {
            foodLists.recommendFood.add(new FoodRecommend(foods.get(i).name,foods.get(i).picUrl,foods.get(i).id));
            foodLists.allFoods.add(new FoodListItem(foods.get(i).id,foods.get(i).name));
        }
        for (int i = 5; i < 10; i++) {
            foodLists.popFoods.add(new FoodRecommend(foods.get(i).name,foods.get(i).picUrl,foods.get(i).id));
            foodLists.allFoods.add(new FoodListItem(foods.get(i).id,foods.get(i).name));
        }
        for (int i = 10; i < 15; i++) {
            foodLists.historyFood.add(new FoodRecommend(foods.get(i).name,foods.get(i).picUrl,foods.get(i).id));
            foodLists.allFoods.add(new FoodListItem(foods.get(i).id,foods.get(i).name));
        }
    }
    public Food getFoodById(int id){
        System.out.println("offline id:"+id);
        for (Food food : foods) {
            if(food.id == id)
                return food;
        }
        return new Food();
    };
}
