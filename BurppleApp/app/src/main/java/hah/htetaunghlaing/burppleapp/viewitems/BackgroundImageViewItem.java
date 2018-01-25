package hah.htetaunghlaing.burppleapp.viewitems;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import hah.htetaunghlaing.burppleapp.R;
import hah.htetaunghlaing.burppleapp.data.vo.FeaturedVO;

/**
 * Created by Htet Aung Hlaing on 1/11/2018.
 */

public class BackgroundImageViewItem extends FrameLayout {

    @BindView(R.id.iv_background_image)
    ImageView ivBackGroundImage;

    @BindView(R.id.tv_features)
    TextView tvFeatures;

    @BindView(R.id.tv_features_background_image)
    TextView tvFeaturesBackgroundIamge;

    @BindView(R.id.tv_features_say_about_that)
    TextView tvFeaturesSayAboutThat;

    public BackgroundImageViewItem(@NonNull Context context) {
        super(context);
    }

    public BackgroundImageViewItem(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BackgroundImageViewItem(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this,this);


    }
    public  void setData(FeaturedVO featured){
        Glide.with(ivBackGroundImage.getContext())
                .load(featured.getFeatureImage())
                .into(ivBackGroundImage);

        tvFeatures.setText(featured.getFeatureTag());

        tvFeaturesBackgroundIamge.setText(featured.getFeatureTitle());
        tvFeaturesSayAboutThat.setText(featured.getFeatureDescription());
    }
}
