package com.example.googleauth.components.inputs

import android.graphics.drawable.Icon
import android.text.InputType
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googleauth.ui.theme.CoolBlack
import com.example.googleauth.ui.theme.MainGreen
import com.example.googleauth.ui.theme.Transparent
import kotlin.math.round

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BasicTextInput(
    label: String = "Enter text",
    inputType: KeyboardType,
    visualType: VisualTransformation,
    leadingIcon: @Composable() (() -> Unit)?,
) : String {
    var userInput by remember { mutableStateOf("") }
    TextField(
        value = userInput,
        onValueChange = {userInput = it },
        textStyle = TextStyle(
            color = CoolBlack,
            fontWeight =  FontWeight.Normal,
            fontSize = 18.sp
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp, 10.dp)
            .shadow(
                shape = RoundedCornerShape(20.dp),
                elevation = 0.dp,
            )
            .border(1.dp, Color.LightGray, shape = RoundedCornerShape(15.dp)),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = Transparent,
            errorBorderColor = Transparent,
            focusedBorderColor = Transparent,
            unfocusedBorderColor = Transparent,

        ),
        singleLine = true,
        placeholder = { Text(text = label, color = Color.Gray, fontSize = 15.sp, fontWeight = FontWeight.Normal) },
        leadingIcon =  leadingIcon ,
        keyboardOptions = KeyboardOptions(
           keyboardType = inputType
       ),
        visualTransformation = visualType,
        shape = RoundedCornerShape(15.dp),

    )
    return userInput
}