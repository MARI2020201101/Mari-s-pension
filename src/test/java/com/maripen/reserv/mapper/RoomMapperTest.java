package com.maripen.reserv.mapper;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class RoomMapperTest {
    @Autowired
    RoomMapper roomMapper;

    @Test
    public void roomSelectTest(){
        roomMapper.selectAll();
    }
}
