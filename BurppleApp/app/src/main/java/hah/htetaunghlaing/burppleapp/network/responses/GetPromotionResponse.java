package hah.htetaunghlaing.burppleapp.network.responses;

import java.util.List;

import hah.htetaunghlaing.burppleapp.data.vo.PromotionVO;

/**
 * Created by Htet Aung Hlaing on 1/14/2018.
 */

public class GetPromotionResponse {
    private int code;
    private String message;
    private String apiVersion;
    private String page;
    private List<PromotionVO> promotions;

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

    public List<PromotionVO> getPromotions() {
        return promotions;
    }
}
