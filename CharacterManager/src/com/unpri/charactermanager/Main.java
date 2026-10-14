
package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        // BAGIAN A: Data karakter
        System.out.println("=== CHARACTER MANAGER ===");
        System.out.println("\n--- DATA KARAKTER ---");

        Character odette = new Character(
                "Odette", CharacterType.MAGE, 4);

        Character angela = new Character(
                "Angela", CharacterType.HEALER, 5);

        Character layla = new Character(
                "Layla", CharacterType.ARCHER, 10);

        System.out.println(odette);
        System.out.println(angela);
        System.out.println(layla);

        // BAGIAN A: Demo level up
        System.out.println("\n--- DEMO LEVEL UP ---");

        System.out.println("Sebelum: " + odette);

        odette.setLevel(odette.getLevel() + 1);
        odette.setHitPoints(odette.getHitPoints() + 10);
        odette.setAttackPower(odette.getAttackPower() + 5);

        System.out.println("Sesudah: " + odette);

        // BAGIAN B: Mini-challenge
        System.out.println("\n--- MINI-CHALLENGE ---");

        Character newHero = new Character(
                "Knight", CharacterType.WARRIOR, 3);

        newHero.setMana(80);

        System.out.println("Karakter baru: " + newHero);
        System.out.println("Mana Knight: " + newHero.getMana());
        System.out.println(
                "Knight masih hidup? " + newHero.isAlive());

        System.out.println("\n=== PROGRAM SELESAI ===");
    }
}
