package com.example.rating;

import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by 鱼握拳 on 2018/4/13.
 */

public class HomeAdapter extends BaseQuickAdapter<HomeItem.ItemListBean, BaseViewHolder> {
    public HomeAdapter(List<HomeItem.ItemListBean> data) {
        super(R.layout.item, data);
        Log.e(TAG, "HomeAdapter: "+data.size() );
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeItem.ItemListBean item) {
        helper.setText(R.id.text, item.getData().getTitle());
        // 加载网络图片
        Glide.with(mContext).load(item.getData().getCover().getFeed()).crossFade().into((ImageView) helper.getView(R.id.iv));
    }


}

