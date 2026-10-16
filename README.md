# CharacterManager

Project ini merupakan implementasi program **CharacterManager** menggunakan bahasa Java. Project ini dibuat untuk memenuhi tugas TP5 dengan menerapkan konsep Object-Oriented Programming (OOP), method, manipulasi object, encapsulation, dan pengelolaan collection menggunakan `ArrayList`.

---

# TP5 — Method & Manipulasi Object

## Fitur yang Diimplementasikan

Pada TP5, program `CharacterManager` memiliki beberapa fitur untuk mengelola data karakter, yaitu:

1. Menambahkan karakter menggunakan method `addCharacter()`.
2. Menolak karakter dengan nama yang sama atau duplikat.
3. Mencari karakter berdasarkan nama menggunakan `findByName()`.
4. Menghapus karakter berdasarkan nama menggunakan `removeCharacter()`.
5. Menghitung jumlah karakter menggunakan `getTotalCharacters()`.
6. Menampilkan seluruh karakter menggunakan `getAllCharacters()`.
7. Menghitung jumlah karakter berdasarkan tipe menggunakan method analitik `countByType()`.

Class `Character` juga memiliki beberapa method seperti getter dan setter, `isAlive()`, `toString()`, `equals()`, dan `hashCode()`.

---

## Pengujian CRUD

Pengujian dilakukan dengan membuat tiga karakter:

- Arjuna dengan tipe `WARRIOR`
- Merlin dengan tipe `MAGE`
- Athena dengan tipe `WARRIOR`

Pengujian yang dilakukan meliputi:

- Menambahkan karakter Arjuna, Merlin, dan Athena.
- Mencoba menambahkan karakter Arjuna kembali sebagai karakter duplikat.
- Menghitung jumlah karakter.
- Mencari karakter Merlin.
- Mencari karakter Zeus yang tidak terdapat dalam daftar.
- Menghapus karakter Athena.
- Menghitung kembali jumlah karakter setelah penghapusan.
- Menampilkan karakter yang masih tersimpan.

Hasil pengujian menunjukkan bahwa fitur CRUD berjalan dengan baik dan karakter dengan nama duplikat berhasil ditolak.

### Screenshot Output CRUD

![Output CRUD](docs/02-output-crud.png)

---

## Eksperimen Reference Object

Eksperimen reference object dilakukan untuk memahami cara kerja reference pada object di Java.

Pada Java, variabel yang menyimpan object sebenarnya menyimpan reference yang menunjuk ke object tersebut. Jika dua variabel memiliki reference ke object yang sama, maka perubahan melalui salah satu reference akan memengaruhi object yang sama.

Eksperimen ini membantu memahami hubungan antara variabel reference dan object serta pentingnya menjaga data internal object melalui konsep encapsulation.

### Screenshot Eksperimen Reference Object

![Eksperimen Reference Object](docs/03-eksperimen-reference.png)

---

# Bagian C — Fitur Analitik Rancangan Sendiri

## `countByType(CharacterType type)`

Pada Bagian C, saya merancang dan mengimplementasikan satu method baru pada class `CharacterManager`, yaitu:
Alasan Memilih Fitur
Fitur countByType() dipilih karena dapat memberikan informasi mengenai jumlah karakter berdasarkan tipe.
Dengan adanya method ini, pengguna dapat mengetahui jumlah karakter dengan tipe tertentu tanpa perlu menampilkan seluruh data karakter.
Fitur ini juga sesuai dengan tujuan CharacterManager, yaitu mengelola dan menyediakan informasi dari kumpulan object Character.
Encapsulation
Method countByType() tetap menjaga prinsip encapsulation karena ArrayList<Character> yang digunakan untuk menyimpan karakter tetap bersifat private.
Deklarasi list pada CharacterManager adalah:
private ArrayList<Character> characterList;

Method countByType() tidak mengembalikan atau mengekspos ArrayList tersebut. Method hanya mengembalikan nilai bertipe int berupa jumlah karakter yang sesuai dengan tipe yang diberikan.
Selain itu, method getAllCharacters() juga tidak mengembalikan ArrayList asli. Method tersebut mengembalikan salinan dari list:
return new ArrayList<>(characterList);

Dengan demikian, object dari luar class tidak dapat memodifikasi ArrayList internal secara langsung.
Pengujian dilakukan menggunakan tiga karakter, yaitu Arjuna, Merlin, dan Athena.
Hasil pengujian:
--- Analitik ---
Jumlah WARRIOR: 2
Jumlah MAGE: 1

Hasil tersebut menunjukkan bahwa method countByType() berhasil menghitung jumlah karakter berdasarkan tipe dengan benar

```java
countByType(CharacterType type)
## Dokumentasi Google Docs

Dokumentasi lengkap mengenai implementasi dan pengujian TP5 dapat dilihat melalui Google Docs berikut:

**[Dokumentasi TP5 — CharacterManager](https://docs.google.com/document/d/1xs0x4kYOwM1PLqvYKu5NX8363OZEmkpKEZ5AvmxM_fQ/edit?tab=t.0)**