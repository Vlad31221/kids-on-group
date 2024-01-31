package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Group implements GardenInfo {
    private String name;
    private int number;

    private List<Kids> groupKids;



    public Group(String name, int number) {
        this.name = name;
        this.number = number;
        this.groupKids = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void addKids(Kids kids) {

        groupKids.add(kids);


    }

    public void removeKids(Kids kids) {

        groupKids.remove(kids);


    }



    public void showKids() {

        System.out.println("Дети из группы: ");
        for (Kids kids: groupKids) {

            System.out.println("Имя:" + kids.getName() + ", Пол:" + kids.getMale() + ", Возраст:" + kids.getAge());
        }
    }


    @Override
    public void showInfo() {
        System.out.println("----------------------------------------------");
        System.out.println("Информация о группе: ");
        System.out.println("Название группы: " + getName());
        System.out.println("Номер группы: " + getNumber());
        showKids();

    }

}
