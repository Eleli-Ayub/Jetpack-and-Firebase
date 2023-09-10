package com.example.googleauth.components.buttons

import android.content.Context
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.googleauth.ui.theme.Highlight
import com.example.googleauth.ui.theme.MainGreen


@Composable
fun SignUpBtn(onClick: ()-> Unit, btnText: String) {

    FilledTonalButton(
        onClick = {onClick()},
        shape = RoundedCornerShape(
           5.dp
        ),
        colors = ButtonDefaults.buttonColors(
            containerColor = MainGreen,
            contentColor = Color.Black,
            disabledContainerColor = Color.Gray,
            disabledContentColor = Color.LightGray
        ),
        enabled = true,
        elevation = ButtonDefaults.elevatedButtonElevation(
            defaultElevation = 10.dp
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp, 10.dp)
    ){
        Text(text = btnText)
    }
}