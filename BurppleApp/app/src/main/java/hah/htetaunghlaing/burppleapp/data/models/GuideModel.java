package hah.htetaunghlaing.burppleapp.data.models;

import hah.htetaunghlaing.burppleapp.network.GuideDataAgent;
import hah.htetaunghlaing.burppleapp.network.GuideOkHttpDataAgent;

/**
 * Created by Htet Aung Hlaing on 1/18/2018.
 */

public class GuideModel {


    private GuideDataAgent mGuideDataAgent;
    private static GuideModel sObjInstance;

    private GuideModel(){
        mGuideDataAgent = GuideOkHttpDataAgent.getObjInstance();
    }

    public static GuideModel getObjInstance(){
        if(sObjInstance == null){

            sObjInstance = new GuideModel();
        }return  sObjInstance;
    }

    public void loadGuide(){
            mGuideDataAgent.loadGuide();
    }
}
