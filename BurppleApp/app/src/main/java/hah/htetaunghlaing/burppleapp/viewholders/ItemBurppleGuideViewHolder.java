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
import hah.htetaunghlaing.burppleapp.data.vo.GuideVO;

/**
 * Created by Htet Aung Hlaing on 1/12/2018.
 */

public class ItemBurppleGuideViewHolder extends RecyclerView.ViewHolder {


    @BindView(R.id.iv_burpple_guide_image)
    ImageView ivBurppleGuideImage;

    @BindView(R.id.tv_guide_burpple)
    TextView ivGuideBurrple;

    public ItemBurppleGuideViewHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);


    }
    public void setGuide(GuideVO guide){
        ivGuideBurrple.setText(guide.getGuideTitle());

        Glide.with(ivBurppleGuideImage.getContext())
                .load(guide.getGuideImage())
                .into(ivBurppleGuideImage);
    }
}
