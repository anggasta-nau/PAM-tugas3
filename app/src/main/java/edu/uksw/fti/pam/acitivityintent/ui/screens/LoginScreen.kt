package edu.uksw.fti.pam.acitivityintent.ui.screens
import android.content.Intent
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
//import androidx.compose.runtime.R
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.acitivityintent.HomeActivity
import edu.uksw.fti.pam.acitivityintent.ui.theme.AcitivityIntentTheme
import edu.uksw.fti.pam.acitivityintent.R
import edu.uksw.fti.pam.acitivityintent.contracts.SignUpContract


internal fun doAuth(
    username: String,
    password: String,
): Boolean {
    return (password.equals("admin"))
}

@Composable
fun LoginForm() {
    val lContext = LocalContext.current

    val savedUsername = rememberSaveable { mutableStateOf("") }
    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }

    val getUsernameFromSignUpForm = rememberLauncherForActivityResult(
        contract = SignUpContract(),
        onResult = { usernameInput = it!! }
    )

    Image(
        painter = painterResource(id = R.drawable.naruto),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = stringResource(id = R.string.label_username),
                style = MaterialTheme.typography.h6
            )
            TextField(
                value = usernameInput,
                onValueChange = { usernameInput = it },
                label = { Text(text = "") },
                placeholder = { Text(text = "Enter your username") },
                modifier = Modifier.fillMaxWidth(),
            )
            Text(
                text = stringResource(id = R.string.label_password),
                style = MaterialTheme.typography.h6
            )
            TextField(
                value = passwordInput,
                onValueChange = { passwordInput = it },
                label = { Text(text = "") },
                placeholder = { Text(text = "Enter your password") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth(),
            )
            Button(
                modifier = Modifier
                    .padding(top = 16.dp)
                    .fillMaxWidth(),
                onClick = {
                    val isAuthenticated = doAuth(savedUsername.value, passwordInput)
                    if (isAuthenticated) {
                        lContext.startActivity(
                            Intent(lContext, HomeActivity::class.java)
                                .apply {
                                    putExtra("username", savedUsername.value)
                                }
                        )
                    }
                }
            ) {
                Text(text = stringResource(R.string.button_login))
            }
            Button(
                modifier = Modifier
                    .padding(top = 8.dp)
                    .fillMaxWidth(),
                onClick = {
                    getUsernameFromSignUpForm.launch("")
                }
            ) {
                Text(text = stringResource(R.string.button_sign_up))
            }
        }
    }
}






@Preview(showBackground = true)
@Composable
fun LoginFormPreview() {
    AcitivityIntentTheme {
        LoginForm()
    }
}