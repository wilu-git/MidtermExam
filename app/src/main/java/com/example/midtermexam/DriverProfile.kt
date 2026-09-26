package com.example.midtermexam

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DriverProfile(){
    Column(modifier = Modifier
        .background(Color.Black)
        .fillMaxSize()
        .padding(24.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(vertical = 12.dp),
            horizontalArrangement = Arrangement.Absolute.Left,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "Driver Profile",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            //TODO: Icon

        }
        HorizontalDivider(
            color = Color.White,
        )


        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(Color.Black)
                .fillMaxWidth()
        )
        {
            Spacer(modifier = Modifier.height(192.dp))
            Text("Jomari Reyes", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 32.sp)
            Text("Truck Driver -- Fleet 3", color = Color.White, fontWeight = FontWeight.Light)  //TODO: Add Vertical Divider

        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
        )
        {
            Card(colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
            ),
                modifier = Modifier
                    .height(96.dp)
                    .padding(4.dp)
                    .weight(1f)
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text("142", fontWeight = FontWeight.Bold, fontSize = 24.sp)
                    Text("deliveries", fontWeight = FontWeight.Light,)
                }
            }

            Card(
                colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,),
                modifier = Modifier
                    .height(96.dp)
                    .padding(4.dp)
                    .weight(1f)
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text("4.9", fontWeight = FontWeight.Bold, fontSize = 24.sp)
                    Text("rating", fontWeight = FontWeight.Light,)
                }
            }

            Card(colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
            ),
                modifier = Modifier
                    .height(96.dp)
                    .padding(4.dp)
                    .weight(1f)
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text("3 yrs", fontWeight = FontWeight.Bold, fontSize = 24.sp)
                    Text("tenure", fontWeight = FontWeight.Light,)
                }
            }
        }

        Card(modifier = Modifier.fillMaxWidth()){
            HorizontalDivider(color = Color.White)
            Column(modifier = Modifier.fillMaxWidth()) {
                Row(){
                    Text("Contact", fontWeight = FontWeight.SemiBold)
                }
            }

        }




    }
}