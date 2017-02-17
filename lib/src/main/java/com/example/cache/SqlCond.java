//package com.example.cache;
//
//import com.j256.ormlite.stmt.Where;
//
//import java.sql.SQLException;
//
///**
// * 条件
// */
//public  class SqlCondition implements Condition {
//    public String columnName;
//    public Object value;
//
////    public abstract Where append(Where whereCause) throws SQLException;
//
////    @Override
//    public Condition condition(String columnName, Object value) {
//        this.columnName = columnName;
//        this.value = value;
//        return this;
//    }
//
//    @Override
//    public Condition gt(String columnName, Object value) {
//        return new Equal().condition(columnName,value);
//    }
//    @Override
//    public Condition ge(String columnName, Object value) {
//        return new Equal().condition(columnName,value);
//    }
//    @Override
//    public Condition lt(String columnName, Object value) {
//        return new Equal().condition(columnName,value);
//    }
//    @Override
//    public Condition le(String columnName, Object value) {
//        return new Equal().condition(columnName,value);
//    }
//    @Override
//    public Condition eq(String columnName, Object value) {
//        return new Equal().condition(columnName,value);
//    }
//    @Override
//    public Condition ne(String columnName, Object value) {
//        return new Equal().condition(columnName,value);
//    }
//    @Override
//    public Condition in(String columnName, Object value) {
//        return new Equal().condition(columnName,value);
//    }
//    @Override
//    public Condition like(String columnName, Object value) {
//        return new Equal().condition(columnName,value);
//    }
//    @Override
//    public Condition between(String columnName, Object value) {
//        return new Equal().condition(columnName,value);
//    }
////    public  SqlCondition equal(String columnName, Object value) {
////        return new Equal().condition(columnName,value);
////    }
//
//    public static class Equal extends SqlCondition {
//        @Override
//        public Where append(Where whereCause) throws SQLException {
//            return whereCause.eq(columnName, value);
//        }
//    }
//
//    public static class NotEqual extends SqlCondition {
//        @Override
//        public Where append(Where whereCause) throws SQLException {
//            return whereCause.ne(columnName, value);
//        }
//    }
//
//    public static class GreaterOrEqual extends SqlCondition {
//        @Override
//        public Where append(Where whereCause) throws SQLException {
//            return whereCause.ge(columnName, value);
//        }
//    }
//
//    public static class GreaterThan extends SqlCondition {
//        @Override
//        public Where append(Where whereCause) throws SQLException {
//            return whereCause.gt(columnName, value);
//        }
//    }
//
//    public static class LessOrEqual extends SqlCondition {
//        @Override
//        public Where append(Where whereCause) throws SQLException {
//            return whereCause.le(columnName, value);
//        }
//    }
//
//    public static class LessThan extends SqlCondition {
//        @Override
//        public Where append(Where whereCause) throws SQLException {
//            return whereCause.lt(columnName, value);
//        }
//    }
//
//    public static class In extends SqlCondition {
//        @Override
//        public Where append(Where whereCause) throws SQLException {
//            return whereCause.in(columnName, value);
//        }
//    }
//
//    public static class Like extends SqlCondition {
//        @Override
//        public Where append(Where whereCause) throws SQLException {
//            return whereCause.like(columnName, value);
//        }
//    }
//
//    public static class And extends SqlCondition {
//        @Override
//        public Where append(Where whereCause) throws SQLException {
//            return whereCause.and();
//        }
//    }
//
//    public static class Or extends SqlCondition {
//        @Override
//        public Where append(Where whereCause) throws SQLException {
//            return whereCause.or();
//        }
//    }
//
//    public static class Between extends SqlCondition {
//        public Object highValue;
//
//        public Condition condition(String columnName, Object lowValue) {
//            throw new RuntimeException("You must condition With Three parameter When you Used Between SqlCondition!");
//        }
//        public Between condition(String columnName, Object lowValue, Object highValue) {
//            this.columnName = columnName;
//            this.value = lowValue;
//            this.highValue = highValue;
//            return this;
//        }
//
//        @Override
//        public Where append(Where whereCause) throws SQLException {
//            return whereCause.between(columnName, value, highValue);
//        }
//    }
//}
