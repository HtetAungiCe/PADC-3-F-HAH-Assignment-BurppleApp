package hah.htetaunghlaing.burppleapp.activities;

import android.os.Bundle;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;


import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import hah.htetaunghlaing.burppleapp.BurppleApp;
import hah.htetaunghlaing.burppleapp.R;
import hah.htetaunghlaing.burppleapp.adapters.BackgroundImageViewAdapter;
import hah.htetaunghlaing.burppleapp.adapters.BurppleGuideAdapter;
import hah.htetaunghlaing.burppleapp.adapters.PromotionsItemAdapter;
import hah.htetaunghlaing.burppleapp.data.models.FeaturedModel;
import hah.htetaunghlaing.burppleapp.data.models.GuideModel;
import hah.htetaunghlaing.burppleapp.data.models.PromotionModel;
import hah.htetaunghlaing.burppleapp.data.vo.PromotionVO;
import hah.htetaunghlaing.burppleapp.events.LoadFeatureEvent;
import hah.htetaunghlaing.burppleapp.events.LoadGuideEvent;
import hah.htetaunghlaing.burppleapp.events.LoadPromotionEvent;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.vp_background_image_burpple)
    ViewPager vpBackgroundImageBupple;

    @BindView(R.id.rv_promotions_items)
    RecyclerView rvPromotionViewItem;

    @BindView(R.id.rv_burpple_guide)
    RecyclerView rvBurppleGuide;

    private BackgroundImageViewAdapter mBackgroundImageViewAdapter = new BackgroundImageViewAdapter();
    private PromotionsItemAdapter mPromotionsItemAdapter;
    private BurppleGuideAdapter mBurppleGuideAdapter = new BurppleGuideAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ButterKnife.bind(this,this);

        vpBackgroundImageBupple.setAdapter(mBackgroundImageViewAdapter);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        mPromotionsItemAdapter = new PromotionsItemAdapter();
        rvPromotionViewItem.setLayoutManager(linearLayoutManager);
        rvPromotionViewItem.setAdapter(mPromotionsItemAdapter);

        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        rvBurppleGuide.setLayoutManager(linearLayoutManager1);
        rvBurppleGuide.setAdapter(mBurppleGuideAdapter);

        PromotionModel.getObjInstance().loadPromotion();
        GuideModel.getObjInstance().loadGuide();
        FeaturedModel.getObjInstance().loadFeatured();
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPromotionLoaded(LoadPromotionEvent event){
        Log.d(BurppleApp.LOG_TAP,"mmPromotionLoaded"+event.getPromotionList().size());
        mPromotionsItemAdapter.setPromotion(event.getPromotionList());
    }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onGuideLoaded(LoadGuideEvent event){
        mBurppleGuideAdapter.setGuide(event.getGuideList());
    }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onFeaturedLoaded(LoadFeatureEvent event){
        mBackgroundImageViewAdapter.setData(event.getFeaturedList());
    }

}
