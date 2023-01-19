package com.collections;

import java.util.Objects;

public class Student {
    private int age;
    private String fullName;
    private int telNumber;

    public Student(int age, String fullName, int telNumber, faculty HISTORY) {
        this.age = age;
        this.fullName = fullName;
        this.telNumber = telNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(int telNumber) {
        this.telNumber = telNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, fullName, telNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return Objects.equals(age, other.age) && Objects.equals(fullName, other.fullName) && Objects.equals(telNumber, other.telNumber);
    }

    public enum faculty {
        HISTORY
    }
}
