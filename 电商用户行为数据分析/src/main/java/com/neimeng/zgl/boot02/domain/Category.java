package com.neimeng.zgl.boot02.domain;

import java.io.Serializable;

/**
 * @author Liyufei
 * @version 1.0
 * @Date 2022/8/3 16:02
 */
public class Category implements Serializable {
    private String categoryId;  //col categoryId
    private String clickCount;
    private String  orderCount;
    private String  payCount;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getClickCount() {
        return clickCount;
    }

    public void setClickCount(String clickCount) {
        this.clickCount = clickCount;
    }

    public String getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(String orderCount) {
        this.orderCount = orderCount;
    }

    public String getPayCount() {
        return payCount;
    }

    public void setPayCount(String payCount) {
        this.payCount = payCount;
    }
}
