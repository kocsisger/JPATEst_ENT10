package hu.unideb.inf;

public class Animal {
    private int id;
    private String name;
    private int age;
    private GenderType gender;

    public enum GenderType{
        MALE,FEMALE,UNKNOWN;
    }

}
