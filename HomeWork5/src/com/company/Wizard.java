package com.company;

public class Wizard extends Person {

    private int magicMana;

    public Wizard(String name, int hp, int damage, int magicMana) {
        super(name, hp, damage);
        this.magicMana = magicMana;
    }

    @Override
    void sayHello() {
        System.out.println("Мои силы ждут встречи с нечестью!");
    }

    @Override
    void attack() {
        System.out.println(this.getName() + " нанес " + (this.magicMana / 10 * this.getDamage()) + " урона!");
    }

    public int getMagicMana() {
        return magicMana;
    }

    public void setMagicMana(int magicMana) {
        this.magicMana = magicMana;
    }
}
