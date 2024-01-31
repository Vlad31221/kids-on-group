package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Kids implements GardenInfo  {

    private String name;
    private char male;
    private int age;




    public Kids(String name, char male, int age) {
        this.name = name;
        this.male = male;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getMale() {
        return male;
    }

    public void setMale(char male) {
        this.male = male;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void refactorKids(String newName,char newMale,int newAge){

        this.name = newName;
        this.male = newMale;
        this.age = newAge;

    }


    @Override
    public void showInfo() {

    }
}
