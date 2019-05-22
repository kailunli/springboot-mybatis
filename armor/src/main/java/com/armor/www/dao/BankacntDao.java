package com.armor.www.dao;

import com.armor.www.entity.BankacntEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BankacntDao {

    @Select( value = "select * from wht_userinfos_account where user_id=#{userId, jdbcType=INTEGER}" )
    @Results( id = "userBankAcnt", value = {
            @Result( column = "idnumber", property = "idNo"),
            @Result( column = "account_numer", property = "acntNo"),
            @Result( column = "real_name", property = "realName"),
            @Result( column = "account_type", property = "acntType"),
            @Result( column = "branchbank", property = "branchTitle"),
    })
    List<BankacntEntity> getBankacnt(@Param("userId") int userId);
}
