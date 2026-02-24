package com.example.boxlayoutprofileheader_individualassignment3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Scaffold
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.boxlayoutprofileheader_individualassignment3.ui.theme.BoxLayoutProfileHeaderIndividualAssignment3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BoxLayoutProfileHeaderIndividualAssignment3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProfileScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ProfileScreen(modifier: Modifier = Modifier){
    Box(Modifier.fillMaxSize()){
        ScreenBackground()
        ProfileImage(Modifier.padding(start = 15.dp, bottom = 35.dp).size(120.dp, 120.dp).align(Alignment.TopStart).offset(y = 215.dp))

    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenBackground() {
    Column(Modifier.fillMaxSize()){
        TopAppBar(
            title = { Text("Profile") },
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Back"
                    )
                }
            }
        )
        ProfileHeader(Modifier.align(Alignment.CenterHorizontally))
        ProfileDetails(Modifier.fillMaxSize().padding(5.dp, 30.dp))
    }

}

@Composable
fun ProfileHeader(modifier : Modifier = Modifier){
    Box(Modifier.height(250.dp).fillMaxWidth().paint(painterResource(id = R.drawable.green_wavy_background), contentScale = ContentScale.FillBounds)){

    }
}
@Composable
fun ProfileImage(modifier: Modifier = Modifier) {

    ElevatedCard(
        modifier = modifier,
        shape = RoundedCornerShape(20),
        elevation = CardDefaults.elevatedCardElevation(20.dp),
        colors = CardDefaults.elevatedCardColors(
            containerColor = Color(0xFFB9B9DA)
        )
    ) {

        Box(Modifier.fillMaxSize()) {

            ProfileAvatarHead(
                Modifier
                    .fillMaxSize(.50f)
                    .clip(CircleShape)
                    .align(Alignment.Center)
                    .background(Color.White)
            )

            ProfileAvatarBody(
                Modifier
                    .fillMaxSize(.70f)
                    .offset(y = 50.dp)
                    .clip(CircleShape)
                    .align(Alignment.BottomCenter)
                    .background(Color.White)
            )
        }
    }
}

@Composable
fun ProfileAvatarHead(modifier: Modifier = Modifier) {
    Box(modifier)
}
@Composable
fun ProfileAvatarBody(modifier : Modifier = Modifier) {
    Box(modifier)
}

@Composable
fun ProfileDetails(modifier : Modifier = Modifier){
    Column(modifier){
        val generalModifier = Modifier.padding(15.dp, 5.dp)
        val centerAlignedModifier = Modifier.align(Alignment.CenterHorizontally)

        Text("SarahCadet", fontSize = 40.sp, modifier = generalModifier)
        Text("A Computer Science senior at Boston University", fontSize = 20.sp, modifier = generalModifier)

    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BoxLayoutProfileHeaderIndividualAssignment3Theme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            ProfileScreen(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}