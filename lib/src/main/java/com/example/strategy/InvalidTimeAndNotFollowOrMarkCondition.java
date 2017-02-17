package com.example.strategy;

import com.example.cache.Condition;

/**
 * 查询时间过期策略<br/>
 * 自动增加时间过期条件判断<br/>
 * 扩展< 增加不查询出已关注和已标星邮件>
 */
public class InvalidTimeAndNotFollowOrMarkCondition
        extends InvalidTimeStrategy {
    public InvalidTimeAndNotFollowOrMarkCondition() {
        super();
        conditions.add(ConditionFactory.getCondition().ne("IsFollow", "1")); // 关注邮件不清理
        conditions.add(ConditionFactory.getCondition().ne("IsMarkStar", "1")); // 标星邮件不清理
    }
}
