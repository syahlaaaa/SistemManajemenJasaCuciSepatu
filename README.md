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

**Sistem Manajemen Jasa Cuci Sepatu** adalah aplikasi berbasis **Java CLI (Command Line Interface)** yang dibuat untuk mengelola data pelanggan, sepatu, layanan cuci, dan booking.

Aplikasi ini dibuat dengan menerapkan konsep **Object-Oriented Programming (OOP)**, seperti:

- 🧩 Class dan Object
- 🔐 Encapsulation
- 🏗️ Constructor
- 📚 ArrayList
- 🔄 Inheritance
- 🔍 Method
- 🛡️ Input Validation

  ## 🎯 Fitur Aplikasi

Aplikasi menyediakan beberapa menu utama:

1. 👤 **Tambah Pelanggan**
2. 📋 **Lihat Data Pelanggan**
3. 👟 **Tambah Sepatu**
4. 📋 **Lihat Data Sepatu**
5. 🧼 **Lihat Daftar Layanan**
6. 📝 **Buat Booking**
7. 📦 **Lihat Data Booking**
8. 🚪 **Keluar**

## 📊 Diagram Kelas / Hierarki Class

Berikut merupakan diagram kelas dari Sistem Manajemen Jasa Cuci Sepatu:

<img width="1002" height="667" alt="image" src="https://github.com/user-attachments/assets/a5d9590f-dfc2-4f9c-a216-7a9392a78a5d" />

## 🔗 Penerapan Inheritance

Inheritance diterapkan pada class `Layanan` sebagai **superclass**, 
sedangkan `CuciReguler` dan `CuciExpress` merupakan **subclass**.

Hubungan inheritance dapat dilihat dari kode berikut:
public class CuciReguler extends Layanan {

    public CuciReguler() {
        super("Cuci Reguler", 30000, 3);
    }
}
Pada kode tersebut, keyword extends menunjukkan bahwa CuciReguler
mewarisi atribut dan method dari class Layanan.

Inheritance juga diterapkan pada class CuciExpress:

public class CuciExpress extends Layanan {

    public CuciExpress() {
        super("Cuci Express", 50000, 1);
    }
}

Dengan inheritance, CuciReguler dan CuciExpress dapat menggunakan
struktur yang sudah tersedia pada class Layanan tanpa membuat ulang
class dasar layanan.
