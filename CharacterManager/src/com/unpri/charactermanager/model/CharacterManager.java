
package com.unpri.charactermanager.model;

import java.util.ArrayList;

/**
 * Mengelola koleksi Character: tambah, cari, hapus, dan statistik dasar.
 * Menerapkan Composition: CharacterManager memiliki ArrayList<Character>.
 */
public class CharacterManager {

    private ArrayList<Character> characterList;

    // Constructor
    public CharacterManager() {
        this.characterList = new ArrayList<>();
    }

    // Menambahkan karakter baru dan menolak nama duplikat
    public boolean addCharacter(Character character) {
        if (findByName(character.getName()) != null) {
            System.out.println("Gagal: karakter dengan nama '"
                    + character.getName() + "' sudah ada!");
            return false;
        }

        characterList.add(character);
        System.out.println("Karakter '" + character.getName()
                + "' berhasil ditambahkan.");
        return true;
    }

    // Mencari karakter berdasarkan nama
    public Character findByName(String name) {
        for (Character c : characterList) {
            if (c.getName().equals(name)) {
                return c;
            }
        }

        return null;
    }

    // Menghapus karakter berdasarkan nama
    public boolean removeCharacter(String name) {
        Character target = findByName(name);

        if (target == null) {
            System.out.println("Karakter '" + name
                    + "' tidak ditemukan.");
            return false;
        }

        characterList.remove(target);
        System.out.println("Karakter '" + name
                + "' berhasil dihapus.");
        return true;
    }

    // Menghitung jumlah karakter
    public int getTotalCharacters() {
        return characterList.size();
    }

    // Mengembalikan salinan daftar karakter
    public ArrayList<Character> getAllCharacters() {
        return new ArrayList<>(characterList);
    }
}
