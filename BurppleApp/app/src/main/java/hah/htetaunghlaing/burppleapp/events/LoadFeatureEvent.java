package hah.htetaunghlaing.burppleapp.events;

import java.util.List;

import hah.htetaunghlaing.burppleapp.data.vo.FeaturedVO;

/**
 * Created by Htet Aung Hlaing on 1/20/2018.
 */

public class LoadFeatureEvent {
    private List<FeaturedVO> featuredList;

    public LoadFeatureEvent(List<FeaturedVO> featuredList) {
        this.featuredList = featuredList;
    }

    public List<FeaturedVO> getFeaturedList() {
        return featuredList;
    }
}
