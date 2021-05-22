# Spotify-Clone

# Özet
Bu projedeki amaç nesneye yönelik programlama
ve veri tabanı yönetimin sistemi kullanarak
kullanıcıların (Premium ve normal kullanıcı olmak
üzere) şarkı dinleyeceği, Premium kullanıcıların
çalma listelerinin takip edilebileceği ve tüm
kullanıcıların kendi çalma listelerini
oluşturabileceği bir müzik uygulaması için veri
tabanı geliştirilmesi ve masaüstü uygulama
yapılmasıdır.
# I. Giriş
 Projede Java programlama dili ve Netbeans
geliştirme ortamı kullanıldı. Arayüz tasarımı için
Java Swing paketinden yararlanılmıştır. Veri tabanı
yönetim sistemi için MySQL kullanılmıştır.
XAMPP ve phpMyAdmin’den yararlanılmıştır.
Admin, AdminEkrani, Baglanti, Database, Kaydol,
Kullanici, KullaniciEkrani, girisEkran ve Main
sınıfları oluşturuldu ve proje bu sınıflar üzerinden
yürütüldü. Veritabanı kısmında abonelikturu,
admin, album, calmalistesi, kullanici, sanatci, sarki,
takiplistesi, tur ve ulke tabloları oluşturuldu.
# II. Yöntem
 İlk olarak kullanıcının giriş yapacağı girisEkran
sınıfı oluşturuldu. Kullanıcı kayıtlı ise kullanıcı adı
ve şifresini girerek giriş yap butonuna basar. Butona
basıldığında program veri tabanındaki kayıtlı
kullanıcı adı ve şifrelerle girilenleri karşılaştırır.
Eğer uyuşan kullanıcı adı ve şifre varsa giriş yapar
ve girişte admin veya kullanıcı panellerinden
hangisi seçilmişse ona yönlendirilir. Kullanıcı
sistemde bulunmuyorsa veya girilen şifre var olan
kullanıcı adının şifresiyle uyuşmuyorsa giriş
yapılamaz ve uyarı paneli gösterilir. Kullanıcı
sistemde kayıtlı değilse kaydol butonuna basarak
kayıt sayfasına yönlendirilir. Kullanıcı kaydolurken
Premium seçeneğini seçtiyse kaydolma işlemi
tamamlanmadan önce ödeme paneli açılır. Kullanıcı
ödeme yaparsa kaydı gerçekleşir, yapmaz ise
sisteme kaydolmaz.
 Kullanıcı admin olarak sisteme giriş yaptıysa
admin ekranı açılır. Admin ekranında tüm albümler,
sanatçılar ve şarkılar görüntülenebilir. Ayrıca bu
tablolara ekleme, silme, güncelleme işlemleri
yapılabilir. Şarkı eklenirken eğer ekleneceği
albümle aynı türde değilse şarkının türü ekleme
işlemi gerçekleşmez ve uyarı döner. Admin
ekranında güncelleme yapılırken java swing
mousePressed metodu kullanılarak tıklanılan albüm,
şarkı ve sanatçının bilgileri güncelleme tablosuna
getirilir ve oradan değerler değiştirilerek
güncelleme işlemi yapılır. Bunun gibi ekleme,
güncelleme, silme işlemlerde sql sorgularının
çalıştırıldığı metotların bulunduğu Baglanti ve
Database sınıfları yürütülen sınıfta çağırılarak
kullanıldı.
 Kullanıcı, kullanıcı olarak sisteme giriş yaptıysa
kullanıcı ekranı açılır. Kullanıcı ekranında giriş
yapan kullanıcının kendi pop, jazz ve klasik müzik
türlerindeki ayrı ayrı çalma listeleri bulunur.
 Arama çubuğunda kullanıcı arayarak takip
edilebilir. Takip edilen kullanıcılar bir tablo halinde
ekranda görülebilir ve tıklanılarak ekrana çalma
listeleri getirilebilir. Premium olmayan kullanıcılar
diğer kullanıcılar tarafından takip edilemez ve
dolayısıyla çalma listeleri görüntülenemez.
Kullanıcı arama çubuğuna Premium olmayan bir
kullanıcıyı aratır ve takip etmek isterse kullanıcı
takip edilemez uyarısı döndürülür ve seçilen
kullanıcı takip edilen listesine eklenmez.
 Takip edilen kullanıcının çalma listelerindeki
şarkılara tıklanılarak giriş yapan kullanıcın çalma 
listelerine eklenebilir. Tek tek ekleme yapılabileceği
gibi, tümünü ekle butonu kullanılarak gösterilen
çalma listesindeki tüm şarkılar giriş yapan
kullanıcının ilgili çalma listesine eklenir.
 Kullanıcı ekranında albüm bul, sanatçı bul ve şarkı
bul tabloları bulunur bu tablolarda arama yapılarak
istenilen sonuçlar gösterilir. Tablolarda bulunan
şarkılar üstlerine tıklanılarak giriş yapan
kullanıcının çalma listesine eklenir. Seçilen her
şarkı kendi türü olan çalma listesine eklenir. Albüm
bul ve sanatçı bul tablolarında aranan albüm ve
sanatçılar takip edilebilir.
 Kullanıcı ekranında türlere göre pop, jazz ve klasik
şarkılar için ayrı ayrı top 10 listeleri, genel bir top
10 listesi ve ülkelere göre top 10 listeleri ile en çok
dinlenilen şarkılar gösterilir. Ülkelere göre top 10
tablosunda istenilen ülke seçilip ara butonuna
basılarak top 10 listesi görüntülenebilir. Kullanıcı
kendi çalma listesindeki şarkılara tıklayarak
şarkıları dinleyebilir. Şarkıya tıklanıldığında veri
tabanında ilgili şarkının dinlenme sayısı değeri
güncellenir. Tıklanılan şarkı şu anda çalınan olarak
ekranda gösterilir ve dinleme işleminden sonra
ekranda dinlenme sayıları ve top 10 listeleri
güncellenir. 
 
