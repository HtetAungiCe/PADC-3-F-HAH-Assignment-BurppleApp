package hah.htetaunghlaing.burppleapp.network.responses;

import java.util.List;

import hah.htetaunghlaing.burppleapp.data.vo.FeaturedVO;

/**
 * Created by Htet Aung Hlaing on 1/20/2018.
 */

public class GetFeatureResponse {
    private int code;
    private String message;
    private String apiVersion;
    private String page;
    private List<FeaturedVO> featured;

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

    public List<FeaturedVO> getFeatured() {
        return featured;
    }
}
