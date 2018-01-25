package hah.htetaunghlaing.burppleapp.events;

import java.util.List;

import hah.htetaunghlaing.burppleapp.data.vo.GuideVO;

/**
 * Created by Htet Aung Hlaing on 1/18/2018.
 */

public class LoadGuideEvent {

    private List<GuideVO> guideList;

    public LoadGuideEvent(List<GuideVO> guideList) {
        this.guideList = guideList;
    }

    public List<GuideVO> getGuideList() {
        return guideList;
    }
}
