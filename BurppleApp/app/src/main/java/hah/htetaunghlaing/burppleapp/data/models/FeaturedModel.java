package hah.htetaunghlaing.burppleapp.data.models;

import hah.htetaunghlaing.burppleapp.network.FeaturedDataAgent;
import hah.htetaunghlaing.burppleapp.network.FeaturedOkHttpDadaAgent;

/**
 * Created by Htet Aung Hlaing on 1/13/2018.
 */

public class FeaturedModel {

    private static FeaturedModel sObjInstance;
    private FeaturedDataAgent mFeaturedDataAgent;

    private FeaturedModel() {
        mFeaturedDataAgent = FeaturedOkHttpDadaAgent.getObjInstance();
    }

    public static FeaturedModel getObjInstance(){
        if(sObjInstance == null)
        {
            sObjInstance = new FeaturedModel();
        }
        return sObjInstance;

    }

    public void loadFeatured(){
    mFeaturedDataAgent.loadFeatured();
    }
}
