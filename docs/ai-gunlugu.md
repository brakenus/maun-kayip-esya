# AI Günlüğü – MAUN Kayıp Eşya

> **Kural:** Bu tablo 6 hafta boyunca büyüyen tek bir tablodur. Her hafta yeni satırlar eklenir; eski satırlar silinmez.

| Hafta | Aşama | AI'a verilen görev (özet) | AI çıktısı | Benim yaptığım | Neden? |
|---|---|---|---|---|---|
| 1 | Problem & Fikir | Kampüs yaşamı ve kayıp eşya odaklı 20 mobil uygulama fikri üretmesini istedim | Genel şehir bazlı ve kampüs bazlı 20 uygulama fikri listeledi | "Şehir geneli kayıp eşya" önerisini sadece MAUN kampüsü binalarına özel hale getirdim ve ilanlara gizli doğrulama sorusu ekledim | Genel uygulamalar kampüs dışından ilgisiz ilanlarla doluyor ve herkese açık telefon paylaşımı gizlilik riski oluşturuyordu |
| 1 | Persona | MAUN Kayıp Eşya için 3 kullanıcı personası oluşturmasını istedim | Öğrenci, güvenlik görevlisi ve akademisyen için 3 persona taslağı verdi | AI'ın "kullanıcılar her yerde kesintisiz internete sahip", "telefon numarasını ilana açık yazar" ve "her gün uygulamayı kontrol eder" varsayımlarını düzelttim | Kampüs bodrum katları ve bazı binalarda mobil internet zayıf; öğrenciler telefon numarasını herkese açık paylaşmak istemiyor |
| 1 | Problem Tanımı | Seçilen problem için en fazla 3 cümlelik problem cümlesi taslağı istedim | 5 cümlelik genel bir açıklama metni üretti | Metni 3 cümleye indirip MAUN kampüsündeki WhatsApp/itiraf sayfası dağınıklığı ve fakülte güvenlik birimleri gerçeğine göre yeniden yazdım | Kılavuz en fazla 3 cümle sınırı koyuyor ve genel ifadeler yerine gerçek kampüs problemini yansıtması gerekiyordu |
| 1 | Repo & Şablon | Kılavuza uygun `README.md`, `.gitignore` ve Hafta 1 rapor şablonu oluşturmasını istedim | Başlangıç dosyalarını ve şablonları üretti | Kişisel kısıt bölümü için eğitmenden onay bekleyen taslak ekledim ve `.gitignore` içine keystore/imza dosyalarının dahil olduğunu doğruladım | 3. haftada keystore dosyasının yanlışlıkla Git'e gönderilmesini en baştan engellemek için |
