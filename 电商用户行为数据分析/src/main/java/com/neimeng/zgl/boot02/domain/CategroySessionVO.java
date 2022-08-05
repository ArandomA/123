package com.neimeng.zgl.boot02.domain;

import java.io.Serializable;
import java.util.List;

public class CategroySessionVO implements Serializable {

     private String categoryId;
     private Long[] session_count = new Long[10];

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Long[] getSession_count() {
        return session_count;
    }

    public void setSession_count(List<Long> session_count) {
        session_count.toArray(this.session_count);
    }
}
