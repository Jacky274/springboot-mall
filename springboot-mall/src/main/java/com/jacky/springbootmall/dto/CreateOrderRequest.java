package com.jacky.springbootmall.dto;

import javax.validation.constraints.NotEmpty;
import java.util.List;

public class CreateOrderRequest {
    @NotEmpty  //用在 List 或 Map 變數上
    private List<BuyItem> buyItemList;

    public List<BuyItem> getBuyItemList() {
        return buyItemList;
    }

    public void setBuyItemList(List<BuyItem> buyItemList) {
        this.buyItemList = buyItemList;
    }
}
