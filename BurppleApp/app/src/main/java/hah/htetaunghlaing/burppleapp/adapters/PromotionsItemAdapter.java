package hah.htetaunghlaing.burppleapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

import hah.htetaunghlaing.burppleapp.R;
import hah.htetaunghlaing.burppleapp.data.vo.PromotionVO;
import hah.htetaunghlaing.burppleapp.viewholders.ItemPromotionsViewHolder;

/**
 * Created by Htet Aung Hlaing on 1/12/2018.
 */

public class PromotionsItemAdapter extends RecyclerView.Adapter<ItemPromotionsViewHolder>{

    private List<PromotionVO> mPromotionList;

    public PromotionsItemAdapter() {
        mPromotionList = new ArrayList<>();
    }

    @Override
    public ItemPromotionsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_promotions,parent,false);
        ItemPromotionsViewHolder itemPromotionsViewHolder = new ItemPromotionsViewHolder(view);


        return itemPromotionsViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemPromotionsViewHolder holder, int position) {
       holder.setPromotion(mPromotionList.get(position));
    }


    @Override
    public int getItemCount() {
        return mPromotionList.size();
    }

    public void setPromotion(List<PromotionVO> promotionVOList){
        mPromotionList = promotionVOList;
        notifyDataSetChanged();
    }
}
