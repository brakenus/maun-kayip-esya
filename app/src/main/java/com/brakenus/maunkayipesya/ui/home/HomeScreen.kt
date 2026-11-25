package com.brakenus.maunkayipesya.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.brakenus.maunkayipesya.data.InMemoryItemRepository
import com.brakenus.maunkayipesya.model.ItemStatus
import com.brakenus.maunkayipesya.model.LostItem
import com.brakenus.maunkayipesya.ui.theme.MaunBackground
import com.brakenus.maunkayipesya.ui.theme.MaunBlue
import com.brakenus.maunkayipesya.ui.theme.MaunKayipEsyaTheme
import com.brakenus.maunkayipesya.ui.theme.MaunNavy
import com.brakenus.maunkayipesya.ui.theme.MaunTeal
import com.brakenus.maunkayipesya.ui.theme.MaunTextDark
import com.brakenus.maunkayipesya.ui.theme.MaunTextMuted

/**
 * Hafta 2 iskelet ana ekranı.
 * Açılış ekranı tamamlandıktan sonra örnek ilan listesini gösterir.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(items: List<LostItem>) {
    Scaffold(
        containerColor = MaunBackground,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "MAUN Kayıp Eşya",
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = MaunNavy)
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            item {
                Text(
                    text = "Son Bildirimler",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaunNavy
                )
            }

            items(items, key = { it.id }) { item ->
                LostItemCard(item = item)
            }
        }
    }
}

@Composable
private fun LostItemCard(item: LostItem) {
    val badgeColor = when (item.status) {
        ItemStatus.LOST -> Color(0xFFD97706)
        ItemStatus.FOUND -> MaunBlue
        ItemStatus.AT_SECURITY -> MaunTeal
        ItemStatus.DELIVERED -> Color(0xFF16A34A)
    }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = item.title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaunTextDark
                )
                Surface(
                    shape = RoundedCornerShape(20.dp),
                    color = badgeColor.copy(alpha = 0.14f)
                ) {
                    Text(
                        text = item.status.label,
                        color = badgeColor,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "${item.locationScope.label} • ${item.locationDetail}",
                fontSize = 13.sp,
                color = MaunTextMuted
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "${item.category} • ${item.createdAt}",
                fontSize = 12.sp,
                color = MaunTextMuted
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    MaunKayipEsyaTheme {
        HomeScreen(items = InMemoryItemRepository().getRecentItems())
    }
}
