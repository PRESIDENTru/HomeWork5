package com.company;

public class Person {

    private String name;
    private int damage;
    private int hp;

    public Person(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;

        if (damage > 100) {
            System.out.println("Превышен лимит 'чистого урона'. Задан - 25");
            this.damage = 25;
        } else {
            this.damage = damage;
        }
    }

    void attack() {
        System.out.println(name + " нанес " + damage + " урона!");
    }

    void hpInfo() {
        System.out.println("У " + name + " " + hp + " HP");
    }

    void sing() {
        System.out.println("*насвистывает песню");
    }

    void sayHello() {
        System.out.println("Держи стандартную пятюню");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
