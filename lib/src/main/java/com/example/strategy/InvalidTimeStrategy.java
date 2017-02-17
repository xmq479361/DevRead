package com.example.strategy;

import com.example.cache.Condition;
import com.j256.ormlite.stmt.Where;

import java.sql.SQLException;

import cn.com.zte.android.common.util.StringUtil;
/**
 * 查询时间过期策略<br/>
 * 自动增加时间过期条件判断
 */
public class InvalidTimeStrategy extends Rule<Where> {
    public String fieldKeyName;//有效数据时间字段名
    public String validateTime;//有效数据截止时间 . 早于这个时间的数据都需要清理
    public String mailType;//有效数据截止时间 . 早于这个时间的数据都需要清理

    @Override
    public Where addCondition(Where fromWhereCondition) throws SQLException {
        for (Condition cond : conditions) {
            cond.addCondition(fromWhereCondition);
        }
        return fromWhereCondition.lt(fieldKeyName, validateTime);
    }
    public InvalidTimeStrategy() {
        super();
        conditions.add(ConditionFactory.getCondition().le(fieldKeyName, validateTime));
        if (StringUtil.isEmpty(mailType)) {
            conditions.add(ConditionFactory.getCondition().eq("MailType", mailType));
        }
    }

}
