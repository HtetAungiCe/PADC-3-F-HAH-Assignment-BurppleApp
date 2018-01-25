package hah.htetaunghlaing.burppleapp.data.models;

import hah.htetaunghlaing.burppleapp.network.PromotionOkHttpDataAgent;
import hah.htetaunghlaing.burppleapp.network.PromotionDataAgent;

/**
 * Created by Htet Aung Hlaing on 1/14/2018.
 */

public class PromotionModel {

    private PromotionDataAgent mPromotionDataAgent;
    private static PromotionModel sObjInstance;

    private PromotionModel() {
        mPromotionDataAgent = PromotionOkHttpDataAgent.getsObjInstance();
    }

    public static PromotionModel getObjInstance() {

        if (sObjInstance == null) {
            sObjInstance = new PromotionModel();
        }
        return sObjInstance;
    }

    public void loadPromotion(){
        mPromotionDataAgent.loadPromotion();
    }
}
