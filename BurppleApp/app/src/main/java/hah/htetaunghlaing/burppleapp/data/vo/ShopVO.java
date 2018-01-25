package hah.htetaunghlaing.burppleapp.data.vo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Htet Aung Hlaing on 1/14/2018.
 */

public class ShopVO {
    @SerializedName("burpple-shop-id")
    private String shopId;

    @SerializedName("burpple-shop-name")
    private String shopName;

    @SerializedName("burpple-shop-area")
    private String shopArea;

    public String getShopId() {
        return shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopArea() {
        return shopArea;
    }
}
