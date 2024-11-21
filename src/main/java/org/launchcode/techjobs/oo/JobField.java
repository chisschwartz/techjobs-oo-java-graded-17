package org.launchcode.techjobs.oo;

// share IDS
// share
// share get ids and get/set values
// share hash methods, share to string

import java.util.Objects;

public abstract class JobField {

     int id;
     int nextId = 1;
     String value;

     public JobField() {
         id = nextId;
         nextId++;
     }

    public JobField(String value) {
        this();
        this.value = value;
    }

    //custom method

    public String toString(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id && nextId == jobField.nextId && Objects.equals(value, jobField.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nextId, value);
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
