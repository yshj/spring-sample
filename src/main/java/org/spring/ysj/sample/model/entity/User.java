package org.spring.ysj.sample.model.entity;

import java.util.Date;

public class User {
    private Integer uid;

    private String account;

    private String name;

    private String pass;

    private Integer loginLastip;

    private Integer loginCount;

    private Date loginLasttime;

    private Integer parent1;

    private Integer parent2;

    private Integer parent3;

    private Byte isPartner;

    private Byte isAgent;

    private Byte isMember;

    private Byte isService;

    private Integer withPartner;

    private Integer withAgent;

    private Double money;

    private Date memberTime;

    private Date expireTime;

    private String src;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass == null ? null : pass.trim();
    }

    public Integer getLoginLastip() {
        return loginLastip;
    }

    public void setLoginLastip(Integer loginLastip) {
        this.loginLastip = loginLastip;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Date getLoginLasttime() {
        return loginLasttime;
    }

    public void setLoginLasttime(Date loginLasttime) {
        this.loginLasttime = loginLasttime;
    }

    public Integer getParent1() {
        return parent1;
    }

    public void setParent1(Integer parent1) {
        this.parent1 = parent1;
    }

    public Integer getParent2() {
        return parent2;
    }

    public void setParent2(Integer parent2) {
        this.parent2 = parent2;
    }

    public Integer getParent3() {
        return parent3;
    }

    public void setParent3(Integer parent3) {
        this.parent3 = parent3;
    }

    public Byte getIsPartner() {
        return isPartner;
    }

    public void setIsPartner(Byte isPartner) {
        this.isPartner = isPartner;
    }

    public Byte getIsAgent() {
        return isAgent;
    }

    public void setIsAgent(Byte isAgent) {
        this.isAgent = isAgent;
    }

    public Byte getIsMember() {
        return isMember;
    }

    public void setIsMember(Byte isMember) {
        this.isMember = isMember;
    }

    public Byte getIsService() {
        return isService;
    }

    public void setIsService(Byte isService) {
        this.isService = isService;
    }

    public Integer getWithPartner() {
        return withPartner;
    }

    public void setWithPartner(Integer withPartner) {
        this.withPartner = withPartner;
    }

    public Integer getWithAgent() {
        return withAgent;
    }

    public void setWithAgent(Integer withAgent) {
        this.withAgent = withAgent;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getMemberTime() {
        return memberTime;
    }

    public void setMemberTime(Date memberTime) {
        this.memberTime = memberTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src == null ? null : src.trim();
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
        User other = (User) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPass() == null ? other.getPass() == null : this.getPass().equals(other.getPass()))
            && (this.getLoginLastip() == null ? other.getLoginLastip() == null : this.getLoginLastip().equals(other.getLoginLastip()))
            && (this.getLoginCount() == null ? other.getLoginCount() == null : this.getLoginCount().equals(other.getLoginCount()))
            && (this.getLoginLasttime() == null ? other.getLoginLasttime() == null : this.getLoginLasttime().equals(other.getLoginLasttime()))
            && (this.getParent1() == null ? other.getParent1() == null : this.getParent1().equals(other.getParent1()))
            && (this.getParent2() == null ? other.getParent2() == null : this.getParent2().equals(other.getParent2()))
            && (this.getParent3() == null ? other.getParent3() == null : this.getParent3().equals(other.getParent3()))
            && (this.getIsPartner() == null ? other.getIsPartner() == null : this.getIsPartner().equals(other.getIsPartner()))
            && (this.getIsAgent() == null ? other.getIsAgent() == null : this.getIsAgent().equals(other.getIsAgent()))
            && (this.getIsMember() == null ? other.getIsMember() == null : this.getIsMember().equals(other.getIsMember()))
            && (this.getIsService() == null ? other.getIsService() == null : this.getIsService().equals(other.getIsService()))
            && (this.getWithPartner() == null ? other.getWithPartner() == null : this.getWithPartner().equals(other.getWithPartner()))
            && (this.getWithAgent() == null ? other.getWithAgent() == null : this.getWithAgent().equals(other.getWithAgent()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getMemberTime() == null ? other.getMemberTime() == null : this.getMemberTime().equals(other.getMemberTime()))
            && (this.getExpireTime() == null ? other.getExpireTime() == null : this.getExpireTime().equals(other.getExpireTime()))
            && (this.getSrc() == null ? other.getSrc() == null : this.getSrc().equals(other.getSrc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPass() == null) ? 0 : getPass().hashCode());
        result = prime * result + ((getLoginLastip() == null) ? 0 : getLoginLastip().hashCode());
        result = prime * result + ((getLoginCount() == null) ? 0 : getLoginCount().hashCode());
        result = prime * result + ((getLoginLasttime() == null) ? 0 : getLoginLasttime().hashCode());
        result = prime * result + ((getParent1() == null) ? 0 : getParent1().hashCode());
        result = prime * result + ((getParent2() == null) ? 0 : getParent2().hashCode());
        result = prime * result + ((getParent3() == null) ? 0 : getParent3().hashCode());
        result = prime * result + ((getIsPartner() == null) ? 0 : getIsPartner().hashCode());
        result = prime * result + ((getIsAgent() == null) ? 0 : getIsAgent().hashCode());
        result = prime * result + ((getIsMember() == null) ? 0 : getIsMember().hashCode());
        result = prime * result + ((getIsService() == null) ? 0 : getIsService().hashCode());
        result = prime * result + ((getWithPartner() == null) ? 0 : getWithPartner().hashCode());
        result = prime * result + ((getWithAgent() == null) ? 0 : getWithAgent().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getMemberTime() == null) ? 0 : getMemberTime().hashCode());
        result = prime * result + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        result = prime * result + ((getSrc() == null) ? 0 : getSrc().hashCode());
        return result;
    }
}