package com.armor.www.entity;

import java.util.List;

public class UserEntity {

    private int userId;

    private String phone;

    private String userCode;

    private String nickName;

    private int userType;

    private int teacherType;

    private String headImg;

    private int isDelete;

    private int apprenticeFlag;

    private int roomId;

    private RoomEntity room;

    private List<BankacntEntity> bankAcnt;

    /* getter and setter */

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPhone() {
        if (null == phone) { return ""; }
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserCode() {
        if (null == userCode) { return ""; }
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getNickName() {
        if (null == nickName) { return ""; }
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public int getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(int teacherType) {
        this.teacherType = teacherType;
    }

    public String getHeadImg() {
        if ( null == headImg ) { return ""; }
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public int getApprenticeFlag() {
        return apprenticeFlag;
    }

    public void setApprenticeFlag(int apprenticeFlag) {
        this.apprenticeFlag = apprenticeFlag;
    }

    public RoomEntity getRoom() {
        return room;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public void setRoom(RoomEntity room) {
        this.room = room;
    }

    public List<BankacntEntity> getBankAcnt() {
        return bankAcnt;
    }

    public void setBankAcnt(List<BankacntEntity> bankAcnt) {
        this.bankAcnt = bankAcnt;
    }

    @Override
    public String toString() {
        String user = "{userId:"+ userId +", phone:"+ phone +", nickName:"+ nickName +", userCode:"+ userCode +", userType:"+ userType +", teacherType:"+ teacherType +", apprenticeFlag:"+ apprenticeFlag +", isDelete:"+ isDelete +"}";
        return user;
    }
}
