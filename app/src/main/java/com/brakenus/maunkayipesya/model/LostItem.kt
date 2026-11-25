package com.brakenus.maunkayipesya.model

/**
 * Bir kayıp veya bulunan eşyanın durumunu temsil eder.
 */
enum class ItemStatus(val label: String) {
    LOST("Kayıp"),
    FOUND("Bulundu"),
    AT_SECURITY("Danışmada"),
    DELIVERED("Teslim Edildi")
}

/**
 * Eşyanın kampüs içi veya kampüs dışı bilgisini tutar.
 */
enum class LocationScope(val label: String) {
    ON_CAMPUS("Kampüs İçi"),
    OFF_CAMPUS("Kampüs Dışı")
}

/**
 * Uygulamadaki temel kayıp/bulunan eşya veri modeli.
 */
data class LostItem(
    val id: String,
    val title: String,
    val category: String,
    val locationScope: LocationScope,
    val locationDetail: String,
    val status: ItemStatus,
    val verificationQuestion: String,
    val createdAt: String
)
