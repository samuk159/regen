package br.inf.teorema.regen.model;

import javax.persistence.criteria.JoinType;

public class FieldJoin {

    private String sourceField;
    private String field;
    private JoinType type;
    private Condition on;

    public FieldJoin() {}

    public FieldJoin(String field, JoinType type) {
        this.field = field;
        this.type = type;
    }

    public FieldJoin(String field, JoinType type, Condition on) {
        this.field = field;
        this.type = type;
        this.on = on;
    }

    public FieldJoin(String sourceField, String field, JoinType type) {
        this.sourceField = sourceField;
        this.field = field;
        this.type = type;
    }

    public FieldJoin(String sourceField, String field, JoinType type, Condition on) {
        this.sourceField = sourceField;
        this.field = field;
        this.type = type;
        this.on = on;
    }

    public String getSourceField() {
        return sourceField;
    }

    public void setSourceField(String sourceField) {
        this.sourceField = sourceField;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public JoinType getType() {
        return type;
    }

    public void setType(JoinType type) {
        this.type = type;
    }

    public Condition getOn() {
        return on;
    }

    public void setOn(Condition on) {
        this.on = on;
    }
}
