package hah.htetaunghlaing.burppleapp.network.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import hah.htetaunghlaing.burppleapp.data.vo.GuideVO;

/**
 * Created by Htet Aung Hlaing on 1/18/2018.
 */

public class GetGuideResponse {
    private int code;
    private String message;
    private String apiVersion;
    private String page;

    @SerializedName("featured")
    private List<GuideVO> guide;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPage() {
        return page;
    }

    public List<GuideVO> getGuide() {
        return guide;
    }
}
