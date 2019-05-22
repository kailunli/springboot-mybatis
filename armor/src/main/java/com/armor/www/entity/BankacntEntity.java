package com.armor.www.entity;

public class BankacntEntity {

    private String acntNo;

    private String idNo;

    private String realName;

    private int acntType;

    private String branchTitle;

    private int isdelete;

    /* getter and setter */

    public String getAcntNo() {
        return acntNo;
    }

    public void setAcntNo(String acntNo) {
        this.acntNo = acntNo;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getacntType() {
        return acntType;
    }

    public void setacntType(int acntType) {
        this.acntType = acntType;
    }

    public String getbranchTitle() {
        return branchTitle;
    }

    public void setbranchTitle(String branchTitle) {
        this.branchTitle = branchTitle;
    }

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }
}
