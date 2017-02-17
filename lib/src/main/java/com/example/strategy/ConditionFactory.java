package com.example.strategy;

import com.example.cache.Condition;
import com.j256.ormlite.stmt.Where;

/**
 * Created by 6396000623 on 2017/2/17.
 */

public class ConditionFactory {
    public static Condition getCondition(){
        return new Condition<Where>() {
            @Override
            public Condition gt(String columnName, Object value) {
                return null;
            }

            @Override
            public Condition ge(String columnName, Object value) {
                return null;
            }

            @Override
            public Condition lt(String columnName, Object value) {
                return null;
            }

            @Override
            public Condition le(String columnName, Object value) {
                return null;
            }

            @Override
            public Condition eq(String columnName, Object value) {
                return null;
            }

            @Override
            public Condition ne(String columnName, Object value) {
                return null;
            }

            @Override
            public Condition in(String columnName, Object value) {
                return null;
            }

            @Override
            public Condition like(String columnName, Object value) {
                return null;
            }

            @Override
            public Condition between(String columnName, Object value) {
                return null;
            }

            @Override
            public void addCondition(Where fromWhereCondition) {

            }
        };
    }
}
