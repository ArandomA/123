package com.neimeng.zgl.boot02.domain;

import java.io.Serializable;

public class CategoryVO implements Serializable {
    private String id;
    private String categoryId;
    private Long clickCount;
    private Long  orderCount;
    private Long  payCount;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Long getClickCount() {
        return clickCount;
    }

    public void setClickCount(String clickCount) {
        this.clickCount = Long.parseLong(clickCount.trim());
    }

    public Long getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(String orderCount) {
        this.orderCount = Long.parseLong(orderCount.trim());
    }

    public Long getPayCount() {
        return payCount;
    }

    public void setPayCount(String payCount) {
        this.payCount = Long.parseLong(payCount.trim());
    }
}
