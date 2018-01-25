package hah.htetaunghlaing.burppleapp.data.vo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Htet Aung Hlaing on 1/18/2018.
 */

public class GuideVO {


    @SerializedName("burpple-guide-id")
    private String guideId;
    @SerializedName("burpple-guide-image")
    private String guideImage;
    @SerializedName("burpple-guide-title")
    private String guideTitle;
    @SerializedName("burpple-guide-desc")
    private String GuideDesc;

    public String getGuideId() {
        return guideId;
    }

    public String getGuideImage() {
        return guideImage;
    }

    public String getGuideTitle() {
        return guideTitle;
    }

    public String getGuideDesc() {
        return GuideDesc;
    }
}
