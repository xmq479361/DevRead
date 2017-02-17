package com.example.cache;

import com.j256.ormlite.stmt.Where;

/**
 * Created by 6396000623 on 2017/2/17.
 */
public interface Condition<T> {
    Condition gt(String columnName, Object value);

    Condition ge(String columnName, Object value);

    Condition lt(String columnName, Object value);

    Condition le(String columnName, Object value);

    Condition eq(String columnName, Object value);

    Condition ne(String columnName, Object value);

    Condition in(String columnName, Object value);

    Condition like(String columnName, Object value);

    Condition between(String columnName, Object value);

    void addCondition(T fromWhereCondition);
}
