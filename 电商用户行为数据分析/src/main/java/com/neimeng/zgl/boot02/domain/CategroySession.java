package com.neimeng.zgl.boot02.domain;

import java.io.Serializable;

public class CategroySession implements Serializable {
    private String id;
    private String  categoryId;
    private String sessionId;
    private Long count;

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

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = Long.parseLong(count);
    }
}
