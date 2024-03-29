package com.esms.service;

import com.esms.po.MonthlyAttendance;
import org.springframework.stereotype.Service;

/**
 * 
 * 2020/02/9 8:51
 */
public interface IMonthlyAttendanceService {
    void deleteByPrimaryKey(int id);

    void deleteByQuery(int[] ids);

    MonthlyAttendance selectByPrimaryKey(int id);

    void updateByPrimaryKeySelective(MonthlyAttendance monthlyAttendance);
}
