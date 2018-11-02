package com.tl.push_bean.user;

import java.io.Serializable;

public class UserDetail implements Serializable {
    private Long id;

    private Long userId;

    private String idNumber;

    private String homeAddress;

    private static final long serialVersionUID = 1L;

    public UserDetail(Long id, Long userId, String idNumber, String homeAddress) {
        this.id = id;
        this.userId = userId;
        this.idNumber = idNumber;
        this.homeAddress = homeAddress;
    }

    public UserDetail() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress == null ? null : homeAddress.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", homeAddress=").append(homeAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}