package hah.htetaunghlaing.burppleapp.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import hah.htetaunghlaing.burppleapp.R;
import hah.htetaunghlaing.burppleapp.data.vo.PromotionVO;

/**
 * Created by Htet Aung Hlaing on 1/12/2018.
 */

public class ItemPromotionsViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_promotions_detail)
    TextView tvPromotionDetail;

    @BindView(R.id.tv_shop_name)
    TextView tvShopName;

    @BindView(R.id.tv_reviewer_name)
    TextView tvReviewerName;

    @BindView(R.id.tv_promotions_date)
    TextView tvPromotionDate;

    @BindView(R.id.iv_promotion_item_image)
    ImageView ivPromotionItemIamge;

    public ItemPromotionsViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
    public void setPromotion(PromotionVO promotion){

        tvPromotionDetail.setText(promotion.getPromotionTitle());
        tvPromotionDate.setText(promotion.getPromotionUntil());
        tvShopName.setText(promotion.getPromotionShop().getShopName());
        tvReviewerName.setText(promotion.getPromotionShop().getShopArea());

        Glide.with(ivPromotionItemIamge.getContext())
                .load(promotion.getPromotionImage())
                .into(ivPromotionItemIamge);
    }
}
