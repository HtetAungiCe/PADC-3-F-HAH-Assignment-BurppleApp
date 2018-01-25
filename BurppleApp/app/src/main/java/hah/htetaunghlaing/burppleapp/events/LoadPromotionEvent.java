package hah.htetaunghlaing.burppleapp.events;

import java.util.List;

import hah.htetaunghlaing.burppleapp.data.models.PromotionModel;
import hah.htetaunghlaing.burppleapp.data.vo.PromotionVO;

/**
 * Created by Htet Aung Hlaing on 1/14/2018.
 */

public class LoadPromotionEvent {

    private List<PromotionVO> promotionList;

    public LoadPromotionEvent(List<PromotionVO> promotionVOList) {
        this.promotionList = promotionVOList;
    }

    public List<PromotionVO> getPromotionList() {
        return promotionList;
    }
}
