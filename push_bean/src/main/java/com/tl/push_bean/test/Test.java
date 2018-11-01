package com.tl.push_bean.test;

import java.io.Serializable;

public class Test implements Serializable {
    private Integer id;

    private static final long serialVersionUID = 1L;

    public Test(Integer id) {
        this.id = id;
    }

    public Test() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}