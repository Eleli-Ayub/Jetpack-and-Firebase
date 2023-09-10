import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.example.googleauth.components.buttons.SignUpBtn
import com.example.googleauth.components.inputs.BasicTextInput
import com.example.googleauth.utils.functions.MakeToast

@Preview("profile page")
@Composable
fun SignUp() {
    var context: Context = LocalContext.current
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ){

        var fullname = BasicTextInput(label = "Enter your full names", inputType = KeyboardType.Text, leadingIcon =
        {
            Icon(Icons.Outlined.Person, contentDescription = null)
        },
            visualType = VisualTransformation.None
        )
        var userEmail = BasicTextInput(label = "Enter your email", inputType = KeyboardType.Email,leadingIcon =
        {
            Icon(Icons.Outlined.Email, contentDescription = null)
        },      visualType = VisualTransformation.None )
        var phoneNumber = BasicTextInput(label = "Enter your phone number",inputType = KeyboardType.Number,leadingIcon =
        {
            Icon(Icons.Outlined.Phone, contentDescription = null)
        },      visualType = VisualTransformation.None )
        var userPassword = BasicTextInput(label = "Enter password", inputType = KeyboardType.Password,leadingIcon =
        {
            Icon(Icons.Outlined.Lock, contentDescription = null)
        },      visualType = PasswordVisualTransformation())
        var confirmPassword = BasicTextInput(label = "Confirm password",inputType = KeyboardType.Password,leadingIcon =
        {
            Icon(Icons.Outlined.Lock, contentDescription = null)
        },      visualType = PasswordVisualTransformation() )
        SignUpBtn(onClick = { MakeToast(context = context, fullname) }, btnText ="Register" )
    }

}