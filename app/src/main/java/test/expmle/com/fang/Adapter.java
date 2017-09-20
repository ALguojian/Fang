package test.expmle.com.fang;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hello on 2017/9/20.
 */

public class Adapter extends BaseQuickAdapter<String, BaseViewHolder> {

    private Context context;
    private List<String> list = new ArrayList<>();

    public Adapter(Context context) {
        super(R.layout.item_1);
        this.context = context;
        for (int i = 0; i < 9; i++) {
            list.add(i + "");
        }
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

        RecyclerView recyclerViewImageVIew = helper.getView(R.id.recyclerViewImageView);
        RecyclerView recyclerViewComment = helper.getView(R.id.recyclerComment);

        recyclerViewImageVIew.setLayoutManager(new GridLayoutManager(context, 3));
        recyclerViewComment.setLayoutManager(new LinearLayoutManager(context));

        OneAdapter oneAdapter = new OneAdapter();
        TwoAdapter twoAdapter = new TwoAdapter();

        recyclerViewImageVIew.setAdapter(oneAdapter);
        recyclerViewComment.setAdapter(twoAdapter);

        oneAdapter.setNewData(list);
        twoAdapter.setNewData(list);
    }

    private class TwoAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

        public TwoAdapter() {
            super(R.layout.item_3);
        }
        @Override
        protected void convert(BaseViewHolder helper, String item) {
        }
    }

    private class OneAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

        public OneAdapter() {
            super(R.layout.item_2);
        }
        @Override
        protected void convert(BaseViewHolder helper, String item) {
        }
    }
}
