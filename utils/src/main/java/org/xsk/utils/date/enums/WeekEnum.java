package org.xsk.utils.date.enums;

import lombok.Getter;

/*
 * @Description: 周一到周日的枚举对象
 * @Version: 1.0
 * @Autor: x-one
 * @Date: 2020-12-23 14:30:16
 * @LastEditors: x-one
 * @LastEditTime: 2020-12-23 16:02:55
 */
@Getter
public enum WeekEnum {
    MONDAY(1,"周一"),
    TUESDAY(2,"周二"),
    WEDNESDAY(3,"周三"),
    THURSDAY(4,"周四"),
    FRIDAY(5,"周五"),
    SATURDAY(6,"周六"),
    WEEKDAY(7,"周日");

    private final int code;
    private final String desc;

    private WeekEnum(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public static WeekEnum getByCode(int code){
        for (WeekEnum week : WeekEnum.values()) {
            if(week.getCode() == code){
                return week;
            }
        }
        return null;
    }

    public static WeekEnum getByDesc(String desc){
        for (WeekEnum week : WeekEnum.values()) {
            if(week.getDesc().equals(desc)){
                return week;
            }
        }
        return null;
    }
}
