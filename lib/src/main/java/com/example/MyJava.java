package com.example;

public class MyJava {
    public static void main(String[] args) {
        String result=RelationGroup.whereGt(Relation.Relatype.AND,"Key","value")
        .getRelation();
        System.out.println(result);
    }
}
