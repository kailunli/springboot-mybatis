package com.armor.www.service;

import com.armor.www.dao.RoomDao;
import com.armor.www.entity.RoomEntity;
import org.springframework.beans.factory.annotation.Autowired;

public class RoomService {

    @Autowired
    private RoomDao roomDao;

    RoomEntity getRoom(int roomId) {
        return roomDao.getRoom(roomId);
    }


}
