package com.armor.www.dao;

import com.armor.www.entity.UserEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    /* 获取用户 */
    @Select("select * from wht_userinfos where userid=#{userId, jdbcType=INTEGER}")
    UserEntity getUser(@Param("userId") int userId);

    /* 获取用户列表 */
    @Select("select * from wht_userinfos u limit #{offset, jdbcType=INTEGER}, #{length, jdbcType=INTEGER}")
    UserEntity[] getUserList(@Param("offset") int offset, @Param("length") int length);

    /* 获取用户及其直播间 */
    @Select(value = "select * from wht_userinfos where userid=#{userId, jdbcType=INTEGER}")
    @Results(id = "userRoom", value = {
            @Result( property = "roomId", column = "roomid"),
            @Result( property = "room", column = "roomid", one = @One( select = "com.armor.www.dao.RoomDao.getRoom"))
    })
    UserEntity getUserroom(@Param("userId") int userId);

    /* 获取用户及其银行账户 */
    @Select(value = "select * from wht_userinfos where userid=#{userId, jdbcType=INTEGER}")
    @Results(id = "userBankAcnts", value = {
            @Result( property = "userId", column = "userid"),
            @Result( property = "bankAcnt", column = "userid", many = @Many( select = "com.armor.www.dao.BankacntDao.getBankacnt"))
    })
    UserEntity getUserBankacnt(@Param("userId") int userId);

    /* 获取用户、房间及银行账户 */
    @Select(value = "select * from wht_userinfos where userid=#{userId, jdbcType=INTEGER}")
    /*@MapKey("userRoomAndBkacnts")
    @ResultMap( value = {"userRoom", "userBankAcnts"})*/
    @Results({
            @Result( property = "roomId", column = "roomid"),
            @Result( property = "room", column = "roomid", one = @One( select = "com.armor.www.dao.RoomDao.getRoom")),
            @Result( property = "userId", column = "userid"),
            @Result( property = "bankAcnt", column = "userid", many = @Many( select = "com.armor.www.dao.BankacntDao.getBankacnt"))
    })
    UserEntity getUserRoomAndBankAcnts(@Param("userId") int userId);
}
