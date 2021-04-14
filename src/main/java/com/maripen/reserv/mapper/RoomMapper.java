package com.maripen.reserv.mapper;

import com.maripen.reserv.entity.Room;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoomMapper {

    public List<Room> selectAll();
}
