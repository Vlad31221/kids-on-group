package HomeWork;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Kids> kids = new ArrayList<>();
        ArrayList<Group> group = new ArrayList<>();


        Kids kids1 = new Kids("Тугбаев Тимофей", 'м',5);
        Kids kids2 = new Kids("Овсянников Александр", 'м',7);
        Kids kids3 = new Kids("Воищева Мария", 'ж',7);
        Kids kids4 = new Kids("Костенко Анастасия", 'ж',5);

        //Редактирование ребенка.
       // kids4.refactorKids("Скороходова Анастасия", 'ж',4);

        kids.add(kids1);
        kids.add(kids2);
        kids.add(kids3);
        kids.add(kids4);

        //Удаление ребенка.
       // kids.remove(kids3);



        Group group1 = new Group("Младшая", 1);
        Group group2 = new Group("Старшая", 2);

        group.add(group1);
        group.add(group2);

        group1.addKids(kids1);
        group1.addKids(kids4);
        group2.addKids(kids2);
        group2.addKids(kids3);

        group1.showInfo();
        group2.showInfo();






        }
    }
