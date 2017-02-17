package com.example;

import java.util.LinkedList;


/**
 * Created by 6396000623 on 2017/2/17.
 */

public class RelationGroup {
    private LinkedList<RelationGroup> childGroup;
    private LinkedList<Relation> childRelation;
    private Relation.Relatype relatype;

    public RelationGroup(Relation.Relatype relatype) {
        this.relatype = relatype;
        childGroup = new LinkedList<RelationGroup>();
        childRelation = new LinkedList<Relation>();
    }

    public RelationGroup addRelation(Relation relation) {
        childRelation.add(relation);
        return this;
    }

    public RelationGroup addRelation(RelationGroup relation) {
        childGroup.add(relation);
        return this;
    }

    private static RelationGroup _eachForResult(Relation.Relatype relationType, Object key,
                                                Object... values) {
        RelationGroup group = new RelationGroup(relationType);
        for (Object value : values) {
            group.addRelation(new Relation(key, value, relationType));
        }
        return group;
    }


    private static RelationGroup init(Relation.Relatype groupRelatype,
                                      Relation.Relatype relationType,
                                      Object key, Object... value) {
        if (key == null || value == null)//StringUtil.isEmpty(key) || StringUtil.isEmpty(value)
            return new RelationGroup(relationType);
        return new RelationGroup(groupRelatype).addRelation(
                _eachForResult(relationType, key, value)
        );
    }

    public static RelationGroup whereGt(Relation.Relatype relationType, Object key, Object... value) {
        return init(relationType, Relation.Relatype.GREAT_OR_EQUAL, key, value);
    }

    public RelationGroup whereEq(String key, Object value, Relation.Relatype relationType) {
        return init(relationType, Relation.Relatype.EQUAL, key, value);
    }

    public RelationGroup whereLike(String key, Object value, Relation.Relatype relationType) {
        return init(relationType, Relation.Relatype.LIKE, key, value);


    }

    public RelationGroup whereIn(String key, Object value, Relation.Relatype relationType) {
        return init(relationType, Relation.Relatype.IN, key, value);

    }

    public String toString() {
        return getRelation();
    }

    public String getRelation() {
        StringBuilder builder = new StringBuilder();
        boolean hasChildRela = childRelation.isEmpty();
        if (!hasChildRela) {
            builder.append("(");
            for (Relation rela : childRelation) {
                builder.append(rela.getRelation());
            }
            builder.append(")");
//            builder.append(relatype);
        }
        for (int i = 0; i < childGroup.size(); i++) {
            if (hasChildRela) {
                hasChildRela = false;
            }else{
                builder.append(relatype);
            }
            builder.append(childGroup.get(i).getRelation());
        }
        return builder.toString();
    }

}
