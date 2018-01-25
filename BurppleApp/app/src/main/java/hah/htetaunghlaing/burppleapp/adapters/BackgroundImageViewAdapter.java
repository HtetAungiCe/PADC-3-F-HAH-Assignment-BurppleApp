package hah.htetaunghlaing.burppleapp.adapters;


import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import hah.htetaunghlaing.burppleapp.R;
import hah.htetaunghlaing.burppleapp.data.vo.FeaturedVO;
import hah.htetaunghlaing.burppleapp.viewitems.BackgroundImageViewItem;

/**
 * Created by Htet Aung Hlaing on 1/11/2018.
 */

public class BackgroundImageViewAdapter extends PagerAdapter {

    private List<FeaturedVO> featuredList;


    public BackgroundImageViewAdapter() {
        this.featuredList = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return featuredList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return  (view == (View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(container.getContext());

        BackgroundImageViewItem view = (BackgroundImageViewItem) layoutInflater.inflate(R.layout.item_background_image_burpple,container,false);
        view.setData(featuredList.get(position));
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
    public void setData(List<FeaturedVO> featuredVOList){
        this.featuredList = featuredVOList;
        notifyDataSetChanged();
    }
}
