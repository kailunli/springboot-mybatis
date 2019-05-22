package com.armor.www.service;

import com.armor.www.dao.UserDao;
import com.armor.www.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public class UserService {

    @Autowired
    private UserDao userDao;

    /* 获取用户 */
    public UserEntity getUser(int userId) {
        UserEntity user = userDao.getUser(userId);
        return user;
    }

    /* 获取用户列表 */
    public UserEntity[]getUserList(int page, int size) {
        UserEntity[]users = null;
        int offset = page * size;
        users = userDao.getUserList(offset, size);

        return users;
    }

    /* 获取用户及其直播间 */
    public UserEntity getUserroom(int userId) {
        UserEntity userroom = userDao.getUserroom(userId);
        return userroom;
    }

    /* 获取用户及其银行账户 */
    public UserEntity getUserBankacnt(int userId) {
        UserEntity userroom = userDao.getUserBankacnt(userId);
        return userroom;
    }

    /* 获取用户直播间及银行账户 */
    public UserEntity getUserRoomAndBankAcnts(int userId) {
        UserEntity result = userDao.getUserRoomAndBankAcnts(userId);
        return result;
    }




}
