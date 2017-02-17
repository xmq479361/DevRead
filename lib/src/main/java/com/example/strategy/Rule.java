package com.example.strategy;

import com.example.cache.Condition;
import com.j256.ormlite.stmt.Where;

import java.sql.SQLException;
import java.util.LinkedList;

/**
 * Created by 6396000623 on 2017/2/17.
 */

public abstract class Rule<W> implements IStrategy{
    protected LinkedList<Condition<W>> conditions = new LinkedList<Condition<W>>();

    public Rule() {
    }


    public abstract W addCondition(W fromWhereCondition) throws SQLException;
}
