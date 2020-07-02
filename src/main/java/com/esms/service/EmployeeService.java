package com.esms.service;

import com.esms.po.Employee; /**
 * 
 * 2020/02/10 15:20
 */
public interface EmployeeService {
    void deleteByPrimaryKey(int id);

    void deleteByQuery(int[] ids);

    void insert(Employee employee);

    Employee findByeAccount(String eAccount);

    void updateByPrimaryKeySelective(Employee employee);
}
