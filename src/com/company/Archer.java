package com.company;

public class Archer extends Person{

    private int attackSkill;

    public Archer(String name, int hp, int damage, int attackSkill) {
        super(name, hp, damage);

        if (attackSkill > 10) {
            System.out.println("Превышен лимит уровня лучника! Задан уровень - 3");
            this.attackSkill = 3;
        } else {
            this.attackSkill = attackSkill;
        }
    }

    @Override
    void sayHello() {
        System.out.println("Ну здравствуй! Мой лук жаждит боя!");
    }

    @Override
    void attack() {
        System.out.println(this.getName() + " нанес " + (this.attackSkill * 6 + this.getDamage()) + " урона!");
    }

    public int getAttackSkill() {
        return attackSkill;
    }

    public void setAttackSkill(int attackSkill) {
        this.attackSkill = attackSkill;
    }
}
