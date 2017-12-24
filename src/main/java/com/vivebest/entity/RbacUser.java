package com.vivebest.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * Rbac用户实体类
 * @author he.wj
 * @create 2017-12-23 21:08
 **/
public class RbacUser implements Serializable {
    private Integer id;

    private String userId;

    private String gbkUserName;

    private String big5UserName;

    private String enUserName;

    private String othUserName;

    private String orgId;

    private Integer userLevel;

    private String loginName;

    private String password;

    private Date passwordExpiredDate;

    private String defaultRoleId;

    private Date lastLoginTime;

    private String loginIp;

    private Integer failedNumber;

    private String phoneNumber;

    private String mobilePhone;

    private String email;

    private String remark;

    private String status;

    private Date effectiveDate;

    private Date maturityDate;

    private Integer userIndex;

    private String resetMark;

    private String lastUpdateOrgId;

    private String lastUpdateUserId;

    private Date lastUpdateTime;

    private String createOrgId;

    private String createUserId;

    private Date createTime;

    private String filler;

    private String language;

    private Integer firstLogin;

    private String imageUrl;

    private String lastTheme;

    private String lastThemeColor;

    private static final long serialVersionUID = 1L;

    public RbacUser(Integer id, String userId, String gbkUserName, String big5UserName, String enUserName, String othUserName, String orgId, Integer userLevel, String loginName, String password, Date passwordExpiredDate, String defaultRoleId, Date lastLoginTime, String loginIp, Integer failedNumber, String phoneNumber, String mobilePhone, String email, String remark, String status, Date effectiveDate, Date maturityDate, Integer userIndex, String resetMark, String lastUpdateOrgId, String lastUpdateUserId, Date lastUpdateTime, String createOrgId, String createUserId, Date createTime, String filler, String language, Integer firstLogin, String imageUrl, String lastTheme, String lastThemeColor) {
        this.id = id;
        this.userId = userId;
        this.gbkUserName = gbkUserName;
        this.big5UserName = big5UserName;
        this.enUserName = enUserName;
        this.othUserName = othUserName;
        this.orgId = orgId;
        this.userLevel = userLevel;
        this.loginName = loginName;
        this.password = password;
        this.passwordExpiredDate = passwordExpiredDate;
        this.defaultRoleId = defaultRoleId;
        this.lastLoginTime = lastLoginTime;
        this.loginIp = loginIp;
        this.failedNumber = failedNumber;
        this.phoneNumber = phoneNumber;
        this.mobilePhone = mobilePhone;
        this.email = email;
        this.remark = remark;
        this.status = status;
        this.effectiveDate = effectiveDate;
        this.maturityDate = maturityDate;
        this.userIndex = userIndex;
        this.resetMark = resetMark;
        this.lastUpdateOrgId = lastUpdateOrgId;
        this.lastUpdateUserId = lastUpdateUserId;
        this.lastUpdateTime = lastUpdateTime;
        this.createOrgId = createOrgId;
        this.createUserId = createUserId;
        this.createTime = createTime;
        this.filler = filler;
        this.language = language;
        this.firstLogin = firstLogin;
        this.imageUrl = imageUrl;
        this.lastTheme = lastTheme;
        this.lastThemeColor = lastThemeColor;
    }

    public RbacUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getGbkUserName() {
        return gbkUserName;
    }

    public void setGbkUserName(String gbkUserName) {
        this.gbkUserName = gbkUserName == null ? null : gbkUserName.trim();
    }

    public String getBig5UserName() {
        return big5UserName;
    }

    public void setBig5UserName(String big5UserName) {
        this.big5UserName = big5UserName == null ? null : big5UserName.trim();
    }

    public String getEnUserName() {
        return enUserName;
    }

    public void setEnUserName(String enUserName) {
        this.enUserName = enUserName == null ? null : enUserName.trim();
    }

    public String getOthUserName() {
        return othUserName;
    }

    public void setOthUserName(String othUserName) {
        this.othUserName = othUserName == null ? null : othUserName.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getPasswordExpiredDate() {
        return passwordExpiredDate;
    }

    public void setPasswordExpiredDate(Date passwordExpiredDate) {
        this.passwordExpiredDate = passwordExpiredDate;
    }

    public String getDefaultRoleId() {
        return defaultRoleId;
    }

    public void setDefaultRoleId(String defaultRoleId) {
        this.defaultRoleId = defaultRoleId == null ? null : defaultRoleId.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public Integer getFailedNumber() {
        return failedNumber;
    }

    public void setFailedNumber(Integer failedNumber) {
        this.failedNumber = failedNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(Date maturityDate) {
        this.maturityDate = maturityDate;
    }

    public Integer getUserIndex() {
        return userIndex;
    }

    public void setUserIndex(Integer userIndex) {
        this.userIndex = userIndex;
    }

    public String getResetMark() {
        return resetMark;
    }

    public void setResetMark(String resetMark) {
        this.resetMark = resetMark == null ? null : resetMark.trim();
    }

    public String getLastUpdateOrgId() {
        return lastUpdateOrgId;
    }

    public void setLastUpdateOrgId(String lastUpdateOrgId) {
        this.lastUpdateOrgId = lastUpdateOrgId == null ? null : lastUpdateOrgId.trim();
    }

    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId == null ? null : lastUpdateUserId.trim();
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getCreateOrgId() {
        return createOrgId;
    }

    public void setCreateOrgId(String createOrgId) {
        this.createOrgId = createOrgId == null ? null : createOrgId.trim();
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler == null ? null : filler.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public Integer getFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(Integer firstLogin) {
        this.firstLogin = firstLogin;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getLastTheme() {
        return lastTheme;
    }

    public void setLastTheme(String lastTheme) {
        this.lastTheme = lastTheme == null ? null : lastTheme.trim();
    }

    public String getLastThemeColor() {
        return lastThemeColor;
    }

    public void setLastThemeColor(String lastThemeColor) {
        this.lastThemeColor = lastThemeColor == null ? null : lastThemeColor.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RbacUser other = (RbacUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getGbkUserName() == null ? other.getGbkUserName() == null : this.getGbkUserName().equals(other.getGbkUserName()))
            && (this.getBig5UserName() == null ? other.getBig5UserName() == null : this.getBig5UserName().equals(other.getBig5UserName()))
            && (this.getEnUserName() == null ? other.getEnUserName() == null : this.getEnUserName().equals(other.getEnUserName()))
            && (this.getOthUserName() == null ? other.getOthUserName() == null : this.getOthUserName().equals(other.getOthUserName()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getUserLevel() == null ? other.getUserLevel() == null : this.getUserLevel().equals(other.getUserLevel()))
            && (this.getLoginName() == null ? other.getLoginName() == null : this.getLoginName().equals(other.getLoginName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPasswordExpiredDate() == null ? other.getPasswordExpiredDate() == null : this.getPasswordExpiredDate().equals(other.getPasswordExpiredDate()))
            && (this.getDefaultRoleId() == null ? other.getDefaultRoleId() == null : this.getDefaultRoleId().equals(other.getDefaultRoleId()))
            && (this.getLastLoginTime() == null ? other.getLastLoginTime() == null : this.getLastLoginTime().equals(other.getLastLoginTime()))
            && (this.getLoginIp() == null ? other.getLoginIp() == null : this.getLoginIp().equals(other.getLoginIp()))
            && (this.getFailedNumber() == null ? other.getFailedNumber() == null : this.getFailedNumber().equals(other.getFailedNumber()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getMobilePhone() == null ? other.getMobilePhone() == null : this.getMobilePhone().equals(other.getMobilePhone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getEffectiveDate() == null ? other.getEffectiveDate() == null : this.getEffectiveDate().equals(other.getEffectiveDate()))
            && (this.getMaturityDate() == null ? other.getMaturityDate() == null : this.getMaturityDate().equals(other.getMaturityDate()))
            && (this.getUserIndex() == null ? other.getUserIndex() == null : this.getUserIndex().equals(other.getUserIndex()))
            && (this.getResetMark() == null ? other.getResetMark() == null : this.getResetMark().equals(other.getResetMark()))
            && (this.getLastUpdateOrgId() == null ? other.getLastUpdateOrgId() == null : this.getLastUpdateOrgId().equals(other.getLastUpdateOrgId()))
            && (this.getLastUpdateUserId() == null ? other.getLastUpdateUserId() == null : this.getLastUpdateUserId().equals(other.getLastUpdateUserId()))
            && (this.getLastUpdateTime() == null ? other.getLastUpdateTime() == null : this.getLastUpdateTime().equals(other.getLastUpdateTime()))
            && (this.getCreateOrgId() == null ? other.getCreateOrgId() == null : this.getCreateOrgId().equals(other.getCreateOrgId()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getFiller() == null ? other.getFiller() == null : this.getFiller().equals(other.getFiller()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getFirstLogin() == null ? other.getFirstLogin() == null : this.getFirstLogin().equals(other.getFirstLogin()))
            && (this.getImageUrl() == null ? other.getImageUrl() == null : this.getImageUrl().equals(other.getImageUrl()))
            && (this.getLastTheme() == null ? other.getLastTheme() == null : this.getLastTheme().equals(other.getLastTheme()))
            && (this.getLastThemeColor() == null ? other.getLastThemeColor() == null : this.getLastThemeColor().equals(other.getLastThemeColor()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getGbkUserName() == null) ? 0 : getGbkUserName().hashCode());
        result = prime * result + ((getBig5UserName() == null) ? 0 : getBig5UserName().hashCode());
        result = prime * result + ((getEnUserName() == null) ? 0 : getEnUserName().hashCode());
        result = prime * result + ((getOthUserName() == null) ? 0 : getOthUserName().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getUserLevel() == null) ? 0 : getUserLevel().hashCode());
        result = prime * result + ((getLoginName() == null) ? 0 : getLoginName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPasswordExpiredDate() == null) ? 0 : getPasswordExpiredDate().hashCode());
        result = prime * result + ((getDefaultRoleId() == null) ? 0 : getDefaultRoleId().hashCode());
        result = prime * result + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        result = prime * result + ((getLoginIp() == null) ? 0 : getLoginIp().hashCode());
        result = prime * result + ((getFailedNumber() == null) ? 0 : getFailedNumber().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getMobilePhone() == null) ? 0 : getMobilePhone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getEffectiveDate() == null) ? 0 : getEffectiveDate().hashCode());
        result = prime * result + ((getMaturityDate() == null) ? 0 : getMaturityDate().hashCode());
        result = prime * result + ((getUserIndex() == null) ? 0 : getUserIndex().hashCode());
        result = prime * result + ((getResetMark() == null) ? 0 : getResetMark().hashCode());
        result = prime * result + ((getLastUpdateOrgId() == null) ? 0 : getLastUpdateOrgId().hashCode());
        result = prime * result + ((getLastUpdateUserId() == null) ? 0 : getLastUpdateUserId().hashCode());
        result = prime * result + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        result = prime * result + ((getCreateOrgId() == null) ? 0 : getCreateOrgId().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getFiller() == null) ? 0 : getFiller().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getFirstLogin() == null) ? 0 : getFirstLogin().hashCode());
        result = prime * result + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        result = prime * result + ((getLastTheme() == null) ? 0 : getLastTheme().hashCode());
        result = prime * result + ((getLastThemeColor() == null) ? 0 : getLastThemeColor().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", gbkUserName=").append(gbkUserName);
        sb.append(", big5UserName=").append(big5UserName);
        sb.append(", enUserName=").append(enUserName);
        sb.append(", othUserName=").append(othUserName);
        sb.append(", orgId=").append(orgId);
        sb.append(", userLevel=").append(userLevel);
        sb.append(", loginName=").append(loginName);
        sb.append(", password=").append(password);
        sb.append(", passwordExpiredDate=").append(passwordExpiredDate);
        sb.append(", defaultRoleId=").append(defaultRoleId);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", failedNumber=").append(failedNumber);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", mobilePhone=").append(mobilePhone);
        sb.append(", email=").append(email);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", effectiveDate=").append(effectiveDate);
        sb.append(", maturityDate=").append(maturityDate);
        sb.append(", userIndex=").append(userIndex);
        sb.append(", resetMark=").append(resetMark);
        sb.append(", lastUpdateOrgId=").append(lastUpdateOrgId);
        sb.append(", lastUpdateUserId=").append(lastUpdateUserId);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", createOrgId=").append(createOrgId);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createTime=").append(createTime);
        sb.append(", filler=").append(filler);
        sb.append(", language=").append(language);
        sb.append(", firstLogin=").append(firstLogin);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", lastTheme=").append(lastTheme);
        sb.append(", lastThemeColor=").append(lastThemeColor);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}