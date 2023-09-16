package com.example.itemservice.domain;

import lombok.Data;

@Data //@Data를 도메인에 쓰는 건 위험. DTO는 괜찮지만 확인해 볼 것
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

}
