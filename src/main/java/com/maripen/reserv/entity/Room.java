package com.maripen.reserv.entity;

public class Room {

    /*
    TBL_ROOM	객실테이블
    이름            널?       유형
    ------------- -------- -------------
    ROOM_ID       NOT NULL VARCHAR2(20)
    ROOM_NAME     NOT NULL VARCHAR2(100)
    INFO                   VARCHAR2(255)
    ROOM_SIZE     NOT NULL NUMBER(5)
    CRI_NUM       NOT NULL NUMBER(6)
    MAX_NUM       NOT NULL NUMBER(10)
    WEEKDAY_PRICE NOT NULL NUMBER(10)
    WEEKEND_PRICE NOT NULL NUMBER(10)
    EXTRA_INFO             VARCHAR2(255)
    PEAK_PRICE    NOT NULL NUMBER(10)
     */
    private Long roomId;
    private String roomName;
    private String info;
    private int size;
    private int criNum;
    private int maxNum;
    private int weekdayPrice;
    private int weekendPrice;
    private int peakPrice;
    private String extraInfo;

}
