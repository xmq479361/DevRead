package com.example;


/**
 * Created by 6396000623 on 2017/2/17.
 */
public class Relation {
    public enum Relatype{
        AND,
        OR,
        IN,
        NOT_IN,
        LIKE,
        NOT_LIKE,
        EQUAL,
        NOT_EQUAL,
        BETWEEN,
        GREAT_THAN,
        GREAT_OR_EQUAL,
        LESS_THAN,
        LESS_OR_EQUAL;

        public String getRelation(Object key, Object value, Relatype relatype) {
            return String.format("%s %s %s",key.toString(),relatype.name(),value.toString());
        }
    }
    public Object key;
    public Object value;
    public Relatype relatype;
    
    public Relation(Object key,Object value,Relatype relatype){
        this.key=key;
        this.value=value;
        this.relatype=relatype;
    }

    public String getRelation(){
        return  this.relatype.getRelation(key,value,relatype);

    }
    public static class EqualRelation extends Relation {
        public EqualRelation(Object key,Object value){
            super(key,value,Relatype.EQUAL);
        }
    }

    public static class NotEqualRelation extends Relation {
        public NotEqualRelation(Object key,Object value){
            super(key,value,Relatype.NOT_EQUAL);
        }
    }

    public static class GreaterOrEqualRelation extends Relation {
        public GreaterOrEqualRelation(Object key,Object value){
            super(key,value,Relatype.GREAT_OR_EQUAL);
        }
    }

    public static class GreaterThanRelation extends Relation {
        public GreaterThanRelation(Object key,Object value){
            super(key,value,Relatype.GREAT_THAN);
        }
    }

    public static class LessOrEqualRelation extends Relation {
        public LessOrEqualRelation(Object key,Object value){
            super(key,value,Relatype.LESS_OR_EQUAL);
        }
    }

    public static class LessThanRelation extends Relation {
        public LessThanRelation(Object key,Object value){
            super(key,value,Relatype.LESS_THAN);
        }
    }

    public static class InRelation extends Relation {
        public InRelation(Object key,Object value){
            super(key,value,Relatype.IN);
        }
    }
    public static class NotInRelation extends Relation {
        public NotInRelation(Object key,Object value){
            super(key,value,Relatype.NOT_IN);
        }
    }

    public static class LikeRelation extends Relation {
        public LikeRelation(Object key,Object value){
            super(key,value,Relatype.LIKE);
        }
    }


    public static class NotLikeRelation extends Relation {
        public NotLikeRelation(Object key,Object value){
            super(key,value,Relatype.NOT_LIKE);
        }
    }
    public static class AndRelation extends Relation {
        public AndRelation(Object key,Object value){
            super(key,value,Relatype.AND);
        }
    }

    public static class OrRelation extends Relation {
        public OrRelation(Object key,Object value){
            super(key,value,Relatype.OR);
        }
    }

    public static class BetweenRelation extends Relation {
        public Object highValue;
        public BetweenRelation(Object key,Object lowValue,Object highValue){
            super(key,lowValue,Relatype.BETWEEN);
            this.highValue=highValue;
        }

//        public Condition condition(Object key, Object lowValue) {
//            throw new RuntimeException("You must condition With Three parameter When you Used Between Relation!");
//        }
//        public Between condition(Object key, Object lowValue, Object highValue) {
//            this.key = key;
//            this.value = lowValue;
//            this.highValue = highValue;
//            return this;
//        }
//
//        @Override
//        public Where append(Where whereCause) throws SQLException {
//            return whereCause.between(key, value, highValue);
//        }
    }
}
