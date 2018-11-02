package com.tl.push_bean.user;

import java.io.Serializable;

public class User implements Serializable {
    private Long id;

    private String loginName;

    private String userName;

    private String password;

    private String cellPhone;

    private Long companyId;

    private String workNumber;

    private static final long serialVersionUID = 1L;

    public User(Long id, String loginName, String userName, String password, String cellPhone, Long companyId, String workNumber) {
        this.id = id;
        this.loginName = loginName;
        this.userName = userName;
        this.password = password;
        this.cellPhone = cellPhone;
        this.companyId = companyId;
        this.workNumber = workNumber;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone == null ? null : cellPhone.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber == null ? null : workNumber.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loginName=").append(loginName);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", cellPhone=").append(cellPhone);
        sb.append(", companyId=").append(companyId);
        sb.append(", workNumber=").append(workNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}