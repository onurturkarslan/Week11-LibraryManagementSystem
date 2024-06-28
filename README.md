# Library Management System

Bu proje, bir kütüphane yönetim sistemi oluşturmayı amaçlamaktadır. Proje, kitapların, yazarların, kategorilerin, yayınevlerinin ve ödünç alma işlemlerinin yönetimini sağlar.

## Kurulum

### Gereksinimler

- Java 11 veya üstü
- Maven
- PostgreSQL

### Adımlar

1. Bu projeyi yerel bilgisayarınıza klonlayın.
2. PostgreSQL veritabanınızı başlatın ve `librarymanagementsystem` adında bir veritabanı oluşturun.
3. `src/main/resources` klasöründeki `persistence.xml` dosyasını açın ve PostgreSQL kullanıcı adı ve şifrenizi girin.
4. Proje kök dizininde `mvn clean install` komutunu çalıştırın.
5. Uygulamayı çalıştırmak için `App.java` dosyasını çalıştırın.

## Veri Tabanı Tabloları

### Author Tablosu
![Ekran görüntüsü 2024-06-28 194120](https://github.com/onurturkarslan/Week11-LibraryManagementSystem/assets/91497412/a4289af3-933f-420f-b2e2-5c7fc693cad2)

### Book Tablosu
![Ekran görüntüsü 2024-06-28 194619](https://github.com/onurturkarslan/Week11-LibraryManagementSystem/assets/91497412/29cd2db1-e468-4414-948b-9e15c1aa2d7a)

### Book_Category Tablosu
![Ekran görüntüsü 2024-06-28 194636](https://github.com/onurturkarslan/Week11-LibraryManagementSystem/assets/91497412/a3403cc1-d98f-4fe6-bd44-7bef82fe17ae)

### BookBorrowing Tablosu
![Ekran görüntüsü 2024-06-28 194648](https://github.com/onurturkarslan/Week11-LibraryManagementSystem/assets/91497412/e0c0aad9-6b13-419e-a1a8-c44195b5bff2)

### Category Tablosu
![Ekran görüntüsü 2024-06-28 194701](https://github.com/onurturkarslan/Week11-LibraryManagementSystem/assets/91497412/68f6490c-7f74-4153-b301-261cd7f95f43)

### Publisher Tablosu
![Ekran görüntüsü 2024-06-28 194715](https://github.com/onurturkarslan/Week11-LibraryManagementSystem/assets/91497412/16b608fe-b0bb-47a1-938f-3edb6815650e)


## Entity İlişkileri

Bu sistemde, aşağıdaki entity ilişkileri tanımlanmıştır:
- Bir kitabın bir yazarı olabilir, bir yazarın birden fazla kitabı olabilir (One-to-Many ilişkisi).
- Bir kategori birden fazla kitaba sahip olabilirken, bir kitap birden fazla kategoriye ait olabilir (Many-to-Many ilişkisi).
- Bir kitabın bir yayınevi olabilir, bir yayınevinin birden fazla kitabı olabilir (One-to-Many ilişkisi).
- Bir kitap birden fazla ödünç alma işlemine sahip olabilir, ancak her ödünç alma işlemi yalnızca bir kitaba ait olabilir (One-to-Many ilişkisi).

## Kullanılan Teknolojiler

- Java
- Hibernate
- PostgreSQL
- Maven
#
