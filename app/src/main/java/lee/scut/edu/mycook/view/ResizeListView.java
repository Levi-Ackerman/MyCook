package lee.scut.edu.mycook.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by jsonlee on 10/17/15.
 */
public class ResizeListView extends ListView {
    public ResizeListView(Context context) {
        super(context);
    }

    public ResizeListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ResizeListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setAdapter(ListAdapter adapter) {
        super.setAdapter(adapter);
        setListViewHeightBasedOnChildren();
    }

    public void setListViewHeightBasedOnChildren() {
        // 获取ListView对应的Adapter
        ListAdapter listAdapter = getAdapter();
        if (listAdapter == null) {
            return;
        }

        int totalHeight = 0;
        for (int i = 0, len = listAdapter.getCount(); i < len; i++) {
            // listAdapter.getCount()返回数据项的数目
            View listItem = listAdapter.getView(i, null, this);
            // 计算子项View 的宽高
            listItem.measure(0, 0);
            // 统计所有子项的总高度
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = getLayoutParams();
        params.height = totalHeight+ (getDividerHeight() * (listAdapter.getCount() - 1));
        // listView.getDividerHeight()获取子项间分隔符占用的高度
        // params.height最后得到整个ListView完整显示需要的高度
        setLayoutParams(params);
    }
}
