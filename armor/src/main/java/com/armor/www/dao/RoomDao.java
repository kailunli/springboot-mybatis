package com.armor.www.dao;

import com.armor.www.entity.RoomEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface RoomDao {

    @Select( value = "select * from wht_rooms where roomid=#{roomId}" )
    RoomEntity getRoom(@Param( value = "roomId") int roomId);

}
