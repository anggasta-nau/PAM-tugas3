package edu.uksw.fti.pam.acitivityintent


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.acitivityintent.ui.screens.SignUpForm
import edu.uksw.fti.pam.acitivityintent.ui.theme.AcitivityIntentTheme

class SignUpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AcitivityIntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SignUpForm(::sendUsernameBackToLogin) // iki eror karena bagian signup screen ono 3 parameter ora gur siji tok
                }
            }
        }
    }
    
        private fun sendUsernameBackToLogin(username: String?){
            val result = Intent().putExtra("username", username)
            setResult(Activity.RESULT_OK, result)
            finish()
        }

}



