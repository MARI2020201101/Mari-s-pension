package com.maripen.reserv.mapper;

import com.maripen.reserv.entity.Reserv;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReservMapper {
    public List<Reserv> selectAll();
}
