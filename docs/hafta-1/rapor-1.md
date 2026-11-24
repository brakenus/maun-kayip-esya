# Haftalık Rapor – Hafta 1

**Öğrenci:** `[Ad Soyad]` | **No:** `[Öğrenci No]` | **Proje:** MAUN Kayıp Eşya | **Tarih:** 26.11.2026

---

## 1. Bu hafta hedefim neydi?
Muş Alparslan Üniversitesi (MAUN) kampüsündeki gerçek bir günlük problemi netleştirmek, hedef kullanıcı personalarını oluşturmak, AI ile üretilen fikirleri kampüs gerçeklerine göre dönüştürmek ve projenin Git deposu ile temel dokümantasyonunu başlatmak.

## 2. Ne tamamladım?
- Problem cümlesi (3 cümle) ve hedef kullanıcı grubu belirlendi.
- 3 kullanıcı personası oluşturuldu; AI'ın gerçek dışı 3 varsayımı tespit edilip düzeltildi.
- 20 fikir üretildi, seçilen fikir üzerinde yapılan somut değişiklikler 3 sütunlu tablo ile belgelendi.
- Git deposu başlatıldı, `README.md` (problem tanımı ile), `.gitignore` ve büyüyen `AI Günlüğü` oluşturuldu.
- **Git Deposu:** `[GitHub Repo Linkini Buraya Ekleyin]`
- **İlk Commit'ler:** `[Push sonrası commit linklerini buraya ekleyin]`

## 3. Bu haftanın zorunlu kanıtları
- [ ] Kağıt tasarımının fotoğrafı (AI'siz) *(Aşağıdaki alana fotoğraf eklenecek)*
- [x] Problem cümlesi (en fazla 3 cümle) ve hedef kullanıcı grubu
- [x] 3 persona + AI'ın gerçek dışı varsayımları ve düzeltmeler
- [x] AI önerisi / benim değişikliğim / neden tablosu
- [ ] Kişisel kısıt ve uygulamadaki kullanım planı *(Eğitmenden kısıt ataması bekleniyor; hazır taslaklar aşağıda yer almaktadır)*
- [x] Git deposu bağlantısı ve ilk commit
- [x] AI günlüğü: en az 3 satır *(4 satır eklendi — bkz. `docs/ai-gunlugu.md`)*

---

### Kanıt A: AI'siz Kağıt Tasarımı Fotoğrafı
> **[YAPILACAK]** Telefonu ve AI araçlarını kapatıp kağıda şu 5 öğeyi çizin:
> 1. Problem, 2. Kullanıcı, 3. Çözüm, 4. 3 Ana Ekran (Ana Akış/Liste, İlan Ekle, Eşya Detay & Doğrulama), 5. Ekranlar arası temel akış okları.
> Fotoğrafını `docs/hafta-1/kagit-tasarim.jpg` olarak kaydedip buraya ekleyin:
>
> `![AI'siz Kağıt Tasarımı](kagit-tasarim.jpg)`

---

### Kanıt B: Problem Cümlesi ve Hedef Kullanıcı Grubu

**Problem Cümlesi (3 cümle):**
Muş Alparslan Üniversitesi (MAUN) kampüsünde öğrenciler ve personel; öğrenci kartı, kulaklık, cüzdan veya ders notu gibi eşyalarını kaybettiğinde, mevcut WhatsApp grupları ve sosyal medya sayfalarında paylaşılan ilanlar saatler içinde akışta kaybolmakta ve farklı fakültelerdeki güvenlik birimlerine tek tek ulaşmak gerekmektedir. Bu dağınık süreç yüzünden bulunan eşyalar sahipleriyle zamanında eşleşememekte, sahiplik doğrulaması rastgele yürütüldüğü için gizlilik ve güvenlik sorunları ortaya çıkmaktadır. **MAUN Kayıp Eşya**, kampüs içi kayıp ve bulunan eşyaları fakülte/bina ve kategori bazında düzenleyip gizli doğrulama sorusuyla sahiplerine hızlı ve güvenli şekilde ulaştıran merkezi bir mobil uygulamadır.

**Hedef Kullanıcı Grubu:**
1. MAUN lisans/önlisans ve lisansüstü öğrencileri
2. Kampüs içi fakülte, kütüphane ve yemekhane güvenlik / danışma personeli
3. MAUN akademik ve idari personeli

---

### Kanıt C: 3 Persona + AI'ın Gerçek Dışı Varsayımları ve Düzeltmeler

#### Persona 1 – Elif (20, Bilgisayar Mühendisliği 2. Sınıf Öğrencisi)
- **Profil:** Gün içinde derslik, kütüphane ve yemekhane arasında sürekli hareket halinde. Öğrenci kimlik kartını ve kablosuz kulaklığını daha önce iki kez kampüste unuttu.
- **Bu kişi uygulamayı neden kullanır?** Onlarca WhatsApp grubuna tek tek mesaj atmak veya itiraf sayfalarında saatlerce eski gönderi aramak yerine, "Kütüphane + Elektronik" filtresiyle eşyasının bulunup bulunmadığını 10 saniyede kontrol etmek ve kendi numarasını herkese açmadan güvenle teslim almak için kullanır.

#### Persona 2 – Mehmet Bey (42, Merkezi Kütüphane ve Fakülte Güvenlik/Danışma Görevlisi)
- **Profil:** Her hafta öğrencilerin bulup masasına bıraktığı 5–10 eşyayı çekmecede biriktiriyor. Çoğu eşya sahibi gelmediği için dönem sonuna kadar bekliyor.
- **Bu kişi uygulamayı neden kullanır?** Kendisine bırakılan eşyaları 30 saniyede "Bulunan Eşya – Kütüphane Danışma" olarak sisteme girip masadaki yığılmayı azaltmak ve eşyayı gerçekten sahibine teslim ettiğini doğrulama sorusuyla kayıt altına almak için kullanır.

#### Persona 3 – Arda (18, Eğitim Fakültesi 1. Sınıf Öğrencisi)
- **Profil:** Üniversiteye yeni başlamış, kampüs binalarını ve hangi güvenlik biriminin nerede olduğunu henüz bilmiyor.
- **Bu kişi uygulamayı neden kullanır?** Yemekhanede bulduğu bir cüzdanı kime teslim edeceğini bilmediği için uygulamada hızlıca "Bulunan İlanı" açmak ya da eşyanın bırakılabileceği en yakın danışma noktasını görmek için kullanır.

#### AI'ın Gerçek Dışı Varsayımları ve Düzeltmelerim
1. **Gerçek Dışı Varsayım 1 (AI):** *"Kullanıcılar ilan açarken doğrudan telefon numaralarını veya Instagram hesaplarını herkese açık paylaşır."*
   - **Düzeltmem:** Kampüste özellikle öğrenciler telefon numaralarının herkese açık görünmesini istemiyor (istenmeyen mesaj/gizlilik riski). Bunun yerine, eşyayı talep edenin önce **gizli doğrulama sorusunu** (örn. *"Kartlığın rengi nedir?"*) yanıtladığı, yalnızca doğru eşleşme sonrası iletişim/teslim noktası bilgisinin açıldığı bir akış tasarladım.
2. **Gerçek Dışı Varsayım 2 (AI):** *"Öğrenciler kampüsün her noktasında kesintisiz ve hızlı mobil internete sahiptir."*
   - **Düzeltmem:** Kütüphane alt katları, bazı amfiler ve yemekhane çevresinde mobil veri zayıf olabiliyor. İlan listesinin yerel önbellekte tutulması ve ağ yokken uygulamanın çökmeden anlaşılır uyarı vermesi (offline dayanıklılık) gereksinimini ekledim.
3. **Gerçek Dışı Varsayım 3 (AI):** *"Kullanıcılar uygulamayı her gün düzenli olarak açıp tüm ilanları tek tek inceler."*
   - **Düzeltmem:** Kayıp eşya uygulaması günlük sosyal medya gibi kullanılmaz; yalnızca ihtiyaç anında açılır. Bu yüzden girişte uzun kayıt formları yerine **hızlı kategori/bina filtresi** ve tek ekranda arama deneyimini öne aldım.

---

### Kanıt D: AI ile Üretilen 20 Fikir, Seçilen Fikir ve Değişiklik Tablosu

**AI ile üretilen 20 kampüs/günlük yaşam uygulama fikri:**
1. Kampüs yemekhane yoğunluk tahmini
2. **Şehir geneli kayıp eşya ilan platformu *(Seçilen ve dönüştürülen fikir)***
3. İkinci el ders kitabı ve not takas uygulaması
4. Kampüs içi ring/otobüs saat takipçisi
5. Öğrenci kulübü etkinlik duyuru takvimi
6. Kütüphane boş masa doluluk bildirici
7. Kampüs içi ortak çalışma grubu bulucu
8. Sınav takvimi ve vize/final not hesaplayıcı
9. Öğrenci ev arkadaşı bulma uygulaması
10. Kampüs içi bisiklet/scooter paylaşım takibi
11. Staj başvuru ve son tarih takipçisi
12. Bölüm içi soru-cevap ve ders yardımlaşma forumu
13. Kampüs kafe/kantin menü ve fiyat karşılaştırıcı
14. Yurt çamaşırhane sıra ve randevu takibi
15. Kampüs acil durum ve güvenlik bildirim butonu
16. Mezun-öğrenci mentorluk eşleştirici
17. Kampüs içi gönüllülük ve sosyal sorumluluk takibi
18. Ders devam/devamsızlık takip asistanı
19. Öğrenci indirimli esnaf haritası
20. Kampüs içi eşya ödünç alma (şarj aleti, hesap makinesi) ağı

**Seçilen Fikir Üzerinde Yapılan Değişiklikler:**

| AI Önerisi | Benim Değişikliğim | Neden Değiştirdim? |
|---|---|---|
| Tüm şehri kapsayan genel bir "Kayıp Eşya Platformu" yapın | Kapsamı yalnızca **Muş Alparslan Üniversitesi (MAUN) kampüsü** ile sınırlandırıp fakülte, kütüphane, yemekhane ve yurt bazlı bina etiketleri ekledim | Genel şehir uygulamalarında ilan kirliliği oluşuyor; kampüs ölçeğinde bina bazlı arama yapmak eşyanın bulunma süresini ciddi şekilde kısaltır |
| İlan detayında bulan kişinin telefon numarasını doğrudan gösterin | Telefon numarasını gizleyip **sahiplik doğrulama sorusu** (örn. *"Çantanın içindeki defterin kapağı ne renk?"*) ve **"Güvenliğe Bırakıldı"** seçeneği ekledim | Herkese açık telefon paylaşımı öğrencilerin gizliliğini riske atıyor ve eşyayı sahte taleplerle başkasının almasını engellemek gerekiyor |
| Sadece "Kayıp" ve "Bulundu" şeklinde iki durum kullanın | Durum akışına **"Güvenlikte / Danışmada"** ve **"Teslim Edildi (Arşiv)"** aşamalarını ekledim | Kampüste bulunan eşyaların çoğu doğrudan güvenlik görevlisine bırakılıyor; eşyanın hangi danışmada olduğunu göstermek teslimi hızlandırır |
| İlan açmak için zorunlu uzun kullanıcı profili ve e-posta doğrulaması isteyin | İlanları görmek için giriş zorunluluğunu kaldırdım; yalnızca ilan ekleme ve talep gönderme adımında hızlı giriş istedim | Eşyasını yeni kaybetmiş panik halindeki bir öğrencinin önce 5 adımlık kayıt formu doldurması uygulamayı terk etmesine yol açar |

---

### Kanıt E: Kişisel Kısıt ve Uygulamadaki Kullanım Planı
> **[EĞİTMENDEN ALINACAK]** Kişisel teknik kısıt henüz atanmamıştır. Eğitmen kısıtı bildirdiğinde aşağıdaki ilgili paragraf (veya yeni kısıta uygun plan) kesinleştirilerek buraya yerleştirilecektir:
>
> - *Eğer kısıt **Kamera** olursa:* Bulunan veya kayıp eşya ilanı oluşturulurken cihaz kamerasıyla doğrudan fotoğraf çekilip sıkıştırılarak ilana eklenmesi ve güvenlik tesliminde QR/fotoğraflı kanıt alınması sağlanacaktır.
> - *Eğer kısıt **Offline Çalışma** olursa:* İlan listesi yerel veritabanında (SQLite/Hive) önbelleklenecek; internet kesildiğinde kullanıcı mevcut ilanları görüntülemeye devam edebilecek ve çevrimdışı taslak ilan oluşturup bağlantı geldiğinde senkronize edebilecektir.
> - *Eğer kısıt **Konum / Sensör** olursa:* Eşyanın kaybedildiği veya bulunduğu kampüs noktası GPS/konum servisiyle otomatik olarak en yakın fakülte/bina ile eşleştirilecektir.

---

## 4. AI'dan ne istedim, ne aldım, ben ne yaptım?
Problem tanımı, 20 fikir üretimi, 3 persona taslağı ve dokümantasyon şablonları için AI'dan yardım aldım. AI'ın genel ve kampüs gerçekleriyle uyuşmayan varsayımlarını (açık telefon paylaşımı, kesintisiz internet, şehir geneli kapsam) MAUN kampüsüne özel kurallarla değiştirdim. *(AI günlüğüne eklenen satır sayısı: **4**)*

## 5. AI'ın yanlış ya da zayıf çıktısı ve düzeltmem
AI, persona ve fikir aşamasında *"kullanıcıların telefon numaralarını ilanda herkese açık paylaşması"* ve *"şehir geneli tek bir kayıp eşya akışı"* önerisini sundu. Bu öneri hem öğrenci gizliliği açısından riskli hem de kampüs içinde gereksiz ilan kalabalığı oluşturacağı için reddedilip **MAUN bina etiketli + gizli doğrulama sorulu** yapıya dönüştürüldü.

## 6. Engel ve çözümüm / çözemediğim nokta
- **Çözemediğim nokta:** Kişisel teknik kısıtım henüz eğitmen tarafından atanmadı. Mimari kararı (Hafta 2) kısıta göre netleştirmek için eğitmenle iletişime geçeceğim.

## 7. Gelecek hafta planım (Hafta 2)
1. En az 5 ekranlı wireframe ve ekran akış diyagramını çizmek.
2. Play Store'daki 2 rakip uygulamayı inceleyip farkımızı tek cümleyle yazmak; 3 mimariyi (Firebase / REST API / Yerel SQLite) karşılaştırıp veri modelini oluşturmak.
3. Çalışan uygulama proje iskeletini ve açılış ekranını kodlayıp en az 3 commit ile Git'e yüklemek.

## 8. Hocadan beklentim / karar vermem gereken nokta
- **Kişisel teknik kısıtımın** atanmasını talep ediyorum; böylece Hafta 2 mimari kararında ve Hafta 3 prototipinde bu kısıtı doğrudan çekirdek yapıya entegre edebileceğim.

## 9. Mağaza/pazarlama adımı (varsa)
Hafta 1 için mağaza/pazarlama adımı bulunmamaktadır (`—`).
