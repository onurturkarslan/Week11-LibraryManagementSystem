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



### Book Tablosu



### Book_Category Tablosu



### BookBorrowing Tablosu



### Category Tablosu




### Publisher Tablosu



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
#   W e e k 1 1 - L i b r a r y M a n a g e m e n t S y s t e m  
 