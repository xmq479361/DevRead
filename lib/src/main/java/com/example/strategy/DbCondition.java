package com.example.strategy;

import com.example.cache.Condition;
import com.j256.ormlite.stmt.Where;

import java.sql.SQLException;
import java.util.LinkedList;

/**
 * 数据库策略基类
 */
public abstract class DbCondition implements Condition {

    public DbCondition() {
    }


    public abstract Where addCondition(Where fromWhereCondition) throws SQLException;
}
