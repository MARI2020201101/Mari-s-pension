package com.maripen.reserv.entity;

import java.time.LocalDateTime;

public class Reserv {
    /*
    TBL_RESERV	예약테이블
    이름           널?       유형
    ------------ -------- --------------
    RESERV_ID    NOT NULL VARCHAR2(14)
    NAME         NOT NULL VARCHAR2(30)
    START_DATE   NOT NULL VARCHAR2(12)
    STAY_DATE    NOT NULL NUMBER(2)
    RESERV_STATE          VARCHAR2(30)
    ADULT_COUNT  NOT NULL NUMBER(3)
    CHILD_COUNT           NUMBER(3)
    BABY_COUNT            NUMBER(3)
    ROOM_ID      NOT NULL VARCHAR2(20)
    ROOM_PRICE   NOT NULL NUMBER(10)
    EXTRA_PRICE           NUMBER(10)
    TOTAL_PRICE  NOT NULL NUMBER(10)
    TEL          NOT NULL NUMBER(11)
    PAYMENT      NOT NULL VARCHAR2(30)
    PEAKUP                CHAR(1)
    ARR_TIME              VARCHAR2(6)
    DEPARTURE             VARCHAR2(50)
    TRANSPORT             VARCHAR2(50)
    REQUEST               VARCHAR2(1000)
    RESERV_DATE           DATE

     */
    private Long reservId;
    private String name;
    private String startDate;
    private int stayDate;
    private String reservState;
    private int adultCount;
    private int childCount;
    private int babyCount;
    private Long roomId;
    private int roomPrice;
    private int ExtraPrice;
    private int TotalPrice;
    private int tel;
    private String payment;
    private String peakUp;
    private String arrTime;
    private String departure;
    private String transport;
    private String request;
    private String reservDate;

}
