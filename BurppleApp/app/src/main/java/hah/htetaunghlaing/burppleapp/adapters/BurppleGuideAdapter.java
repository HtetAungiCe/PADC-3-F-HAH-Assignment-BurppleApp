package hah.htetaunghlaing.burppleapp.adapters;


import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import hah.htetaunghlaing.burppleapp.R;
import hah.htetaunghlaing.burppleapp.data.vo.GuideVO;
import hah.htetaunghlaing.burppleapp.viewholders.ItemBurppleGuideViewHolder;

/**
 * Created by Htet Aung Hlaing on 1/12/2018.
 */

public class BurppleGuideAdapter extends RecyclerView.Adapter<ItemBurppleGuideViewHolder> {


    private List<GuideVO> mGuideList;

    public BurppleGuideAdapter() {
        mGuideList = new ArrayList<>();
    }

    @Override
    public ItemBurppleGuideViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_burpple_guide, parent, false);
        ItemBurppleGuideViewHolder burppleGuideViewHolder = new ItemBurppleGuideViewHolder(view);


        return burppleGuideViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemBurppleGuideViewHolder holder, int position) {
            holder.setGuide(mGuideList.get(position));
    }

    @Override
    public int getItemCount() {
        return mGuideList.size();
    }

    public void setGuide(List<GuideVO> guideList){
        mGuideList = guideList;
        notifyDataSetChanged();
    }
}
