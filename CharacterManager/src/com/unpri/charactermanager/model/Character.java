
package com.unpri.charactermanager.model;

public class Character {

    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;
    private int mana;

    // Constructor 1: nilai HP dan attack ditentukan otomatis
    public Character(String name, CharacterType type, int level) {
        this(name, type, level, 100 + (level * 10),
                10 + (level * 5));
    }

    // Constructor 2: nilai HP dan attack ditentukan sendiri
    public Character(String name, CharacterType type, int level,
                     int hitPoints, int attackPower) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.hitPoints = hitPoints;
        this.attackPower = attackPower;
        this.mana = 100;
    }

    // Getter dan setter name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter dan setter type
    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    // Getter dan setter level
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Getter dan setter hitPoints
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    // Getter dan setter attackPower
    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    // MINI-CHALLENGE: Getter dan setter mana
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException(
                    "Mana tidak boleh negatif");
        }

        this.mana = mana;
    }

    // MINI-CHALLENGE: Memeriksa apakah karakter masih hidup
    public boolean isAlive() {
        return hitPoints > 0;
    }

    // Menampilkan informasi karakter
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", level=" + level +
                ", hitPoints=" + hitPoints +
                ", attackPower=" + attackPower +
                ", mana=" + mana +
                '}';
    }
}
