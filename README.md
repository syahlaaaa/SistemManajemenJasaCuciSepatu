# 👟 Sistem Manajemen Jasa Cuci Sepatu

 🧼 Aplikasi sederhana berbasis Java untuk membantu mengelola layanan jasa cuci sepatu.
 ## 👤 Identitas
 | Data | Keterangan |
|---|---|
| 👩 Nama | **Dliya Syahla Hariyanto** |
| 🆔 NIM | **2509116095** |
| 📚 Program Studi | **Sistem Informasi** |
| 📖 Mata Kuliah | **Pemrograman Berorientasi Objek (PBO)** |
| 💻 Bahasa Pemrograman | **Java** |
| 🛠️ IDE | **NetBeans** |

## 📌 Tentang Project

Studi kasus yang dipilih dalam project ini adalah **Sistem Manajemen Jasa Cuci Sepatu**.

Sistem ini dibuat untuk menggambarkan proses pengelolaan jasa cuci sepatu secara sederhana. Program dapat digunakan untuk mengelola data pelanggan, data sepatu, jenis layanan, serta proses booking jasa cuci sepatu.
Pada proses booking, pengguna dapat memilih pelanggan, sepatu, dan jenis layanan yang diinginkan. Setiap booking memiliki status yang menunjukkan proses pengerjaan, yaitu **Diproses, Selesai, dan Diambil**.
Selain itu, sistem menyediakan fitur untuk melihat data booking dan mengubah status booking sesuai dengan perkembangan proses pencucian. Booking yang sudah berstatus **Diambil** dapat dihapus dari sistem.

Studi kasus ini dipilih karena proses jasa cuci sepatu memiliki alur yang sederhana dan mudah diterapkan ke dalam konsep **Pemrograman Berorientasi Objek (PBO)**, seperti penggunaan class, object, constructor, encapsulation, ArrayList, method, dan inheritance.

Aplikasi ini dibuat dengan menerapkan konsep **Object-Oriented Programming (OOP)**, seperti:

- 🧩 Class dan Object
- 🔐 Encapsulation
- 🏗️ Constructor
- 📚 ArrayList
- 🔄 Inheritance
- 🔍 Method
- 🛡️ Input Validation

## ⚙️ Fitur Program

Program memiliki beberapa menu utama:

1. **Tambah Pelanggan**
2. **Lihat Data Pelanggan**
3. **Tambah Sepatu**
4. **Lihat Data Sepatu**
5. **Lihat Daftar Layanan**
6. **Buat Booking**
7. **Lihat Data Booking**
8. **Update Status Booking**
9. **Hapus Booking**
10. **Keluar**

## 📊 Diagram Kelas / Hierarki Class

Berikut merupakan diagram kelas dari Sistem Manajemen Jasa Cuci Sepatu:

<img width="1002" height="667" alt="Screenshot 2026-09-20 173920" src="https://github.com/user-attachments/assets/4be45d9b-d984-4d43-962e-14cbbd330d50" />

## 📝 Penjelasan Hierarki

Class Layanan merupakan superclass yang menjadi induk dari:

CuciReguler
CuciExpress

Sedangkan:

-Pelanggan digunakan untuk menyimpan data pelanggan.
-Sepatu digunakan untuk menyimpan data sepatu.
-Booking digunakan untuk mengelola proses booking.
-SistemManajemenJasaCuciSepatu digunakan sebagai class utama untuk menjalankan program dan menu.

## 🔗 Penerapan Inheritance

Inheritance diterapkan pada class `Layanan` sebagai **superclass**, 
sedangkan `CuciReguler` dan `CuciExpress` merupakan **subclass**.

Contoh penerapan inheritance pada CuciReguler:
```
public class CuciReguler extends Layanan {

    public CuciReguler() {
        super("Cuci Reguler", 30000, 3);
    }
}
```
Keyword extends menunjukkan bahwa CuciReguler mewarisi atribut dan method dari class Layanan.

Sedangkan super() digunakan untuk memanggil constructor dari superclass Layanan.

Inheritance juga diterapkan pada CuciExpress:
```
public class CuciExpress extends Layanan {

    public CuciExpress() {
        super("Cuci Express", 50000, 1);
    }
}
```
Dengan inheritance, CuciReguler dan CuciExpress dapat menggunakan struktur yang berasal dari class Layanan tanpa harus menuliskan kembali atribut yang sama.

### 🖥️ Screenshot Running Program
## 🏠 Tampilan Menu Utama

<img width="432" height="391" alt="image" src="https://github.com/user-attachments/assets/9be5133f-554f-4b75-8ba1-e4efdf8ce6a6" />

Berikut merupakan tampilan awal program saat dijalankan. Menu utama menyediakan fitur untuk mengelola data pelanggan, sepatu, layanan, dan booking.

## 👤 Tambah Data Pelanggan

<img width="423" height="518" alt="image" src="https://github.com/user-attachments/assets/da31b8e1-7af6-4db4-9a12-5bde28857d52" />

Menampilkan proses penambahan data pelanggan dengan memasukkan ID pelanggan, nama, dan nomor telepon. Setelah data berhasil disimpan, sistem menampilkan notifikasi bahwa data pelanggan berhasil ditambahkan.

## 📋 Lihat Data Pelanggan

<img width="441" height="657" alt="image" src="https://github.com/user-attachments/assets/625022e4-9a7a-4406-8d46-57624c616900" />

Menampilkan seluruh data pelanggan yang tersimpan dalam sistem, termasuk data dummy dan data pelanggan yang ditambahkan melalui menu program.

## 👟 Tambah Data Sepatu

<img width="457" height="507" alt="image" src="https://github.com/user-attachments/assets/d26e2b5a-2cdf-4c07-8449-44754b4875f3" />

Menampilkan proses penambahan data sepatu dengan memasukkan ID sepatu, nama sepatu, dan jenis sepatu. Setelah data berhasil disimpan, sistem menampilkan notifikasi bahwa data sepatu berhasil ditambahkan.

## 👟 Lihat Data Sepatu

<img width="457" height="662" alt="image" src="https://github.com/user-attachments/assets/7aec5fc3-5a21-4474-9a9c-2b25df2d47a2" />

Menampilkan seluruh data sepatu yang tersimpan dalam sistem, termasuk data dummy dan data sepatu yang baru ditambahkan.

## 🧼 Daftar Layanan

<img width="425" height="618" alt="image" src="https://github.com/user-attachments/assets/805d3d7a-afda-40d6-9c66-ca9fed8ad51c" />

Menampilkan jenis layanan yang tersedia beserta harga dan estimasi waktu pengerjaan, yaitu Cuci Reguler dan Cuci Express.

## 📝 Buat Booking

<img width="395" height="590" alt="image" src="https://github.com/user-attachments/assets/1db6e71d-d9ab-42d3-a76a-56782dde51b6" />

Menampilkan proses pembuatan booking, mulai dari pemilihan pelanggan, sepatu, layanan, hingga pengisian tanggal booking. Setelah berhasil dibuat, booking mendapatkan status awal **Diproses**.

## 📝 Detail Booking

<img width="420" height="313" alt="image" src="https://github.com/user-attachments/assets/ee574985-87e6-4990-a892-465656c270c1" />

Menampilkan detail booking yang telah dibuat, meliputi data pelanggan, sepatu, layanan, harga, estimasi pengerjaan, tanggal booking, dan status booking.

## 🔄 Update Status Booking

<img width="466" height="412" alt="image" src="https://github.com/user-attachments/assets/66b5d1e5-f229-4418-9e25-7b39bdd1ae52" />

Menampilkan proses perubahan status booking. Pengguna dapat mengubah status booking menjadi Diproses, Selesai, atau Diambil sesuai dengan perkembangan proses jasa cuci sepatu.

## 🗑️ Hapus Booking

<img width="415" height="238" alt="image" src="https://github.com/user-attachments/assets/8e43b837-eb9f-4c56-a215-74786f950017" />

Menampilkan proses penghapusan booking yang sudah berstatus **Diambil**. Sistem mengizinkan booking dihapus setelah sepatu telah diambil oleh pelanggan.

## 🚪 Keluar dari Program

<img width="472" height="423" alt="image" src="https://github.com/user-attachments/assets/0bc2e199-4b14-4beb-a648-b5f9724fe2de" />

Menampilkan pesan ketika pengguna memilih menu keluar dan mengakhiri program.











struktur yang sudah tersedia pada class Layanan tanpa membuat ulang
class dasar layanan.
