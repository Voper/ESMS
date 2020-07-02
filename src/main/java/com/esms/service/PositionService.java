package com.esms.service;

import com.esms.po.Position;

import java.util.List;

/**
 * 
 * 2020/02/7 8:28
 */
public interface PositionService {
    List<Position> findSelective(Position position);

    int insertSelective(Position position);

    Position findByPrimaryKey(int id);

    void updateByPrimaryKeySelective(Position position);

    void deleteByPrimaryKey(int id);

    void deleteByQuery(int[] ids);

    Position findByDname(String p_name);
}
