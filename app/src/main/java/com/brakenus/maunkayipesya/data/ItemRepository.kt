package com.brakenus.maunkayipesya.data

import com.brakenus.maunkayipesya.model.ItemStatus
import com.brakenus.maunkayipesya.model.LocationScope
import com.brakenus.maunkayipesya.model.LostItem

/**
 * Veri kaynağı sözleşmesi.
 * Hafta 2'de yerel örnek veri sunar; Hafta 3'te Firebase + yerel önbellek bağlanacaktır.
 */
interface ItemRepository {
    fun getRecentItems(): List<LostItem>
}

class InMemoryItemRepository : ItemRepository {
    override fun getRecentItems(): List<LostItem> = listOf(
        LostItem(
            id = "1",
            title = "MAUN Öğrenci Kimlik Kartı",
            category = "Kimlik / Kart",
            locationScope = LocationScope.ON_CAMPUS,
            locationDetail = "Merkezi Kütüphane 2. Kat",
            status = ItemStatus.AT_SECURITY,
            verificationQuestion = "Kart üzerindeki bölüm adı nedir?",
            createdAt = "Bugün, 14:20"
        ),
        LostItem(
            id = "2",
            title = "Beyaz Kablosuz Kulaklık",
            category = "Elektronik",
            locationScope = LocationScope.ON_CAMPUS,
            locationDetail = "Öğrenci Yemekhanesi",
            status = ItemStatus.FOUND,
            verificationQuestion = "Kulaklık kutusunun kapağındaki etiket nedir?",
            createdAt = "Bugün, 12:05"
        ),
        LostItem(
            id = "3",
            title = "Siyah Deri Cüzdan",
            category = "Cüzdan / Çanta",
            locationScope = LocationScope.OFF_CAMPUS,
            locationDetail = "Kampüs Yolu Dolmuş Durağı",
            status = ItemStatus.LOST,
            verificationQuestion = "Cüzdanın içindeki ulaşım kartının rengi nedir?",
            createdAt = "Dün, 18:40"
        )
    )
}
