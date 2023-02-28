package edu.uksw.fti.pam.acitivityintent.ui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.acitivityintent.R

@Composable
fun FollowingScreen() {

    TopAppBar(
        title = {
            Text(
                modifier = Modifier.padding(start = 100.dp, end = 30.dp),
                text = stringResource(id = R.string.Anime)
            )
        },
        backgroundColor = Color.LightGray,
        contentColor = Color.Black,
        navigationIcon = {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Toggle drawer"
            )
        },
        actions = {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Person")
        }
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {
       Column(
           modifier = Modifier
               .fillMaxWidth()
               .padding(50.dp),
       ) {
           Card(
               modifier = Modifier
                   .padding(16.dp),
               elevation = 5.dp,
               shape = RoundedCornerShape(corner = CornerSize(10.dp))
           ) {
                Row(
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        painterResource (id = R.drawable.bofuri) ,
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(4.dp)
                            .height(140.dp)
                            .width(100.dp)
                            .clip(RoundedCornerShape(corner = CornerSize(10.dp)))
                    )
                    Column(
                        modifier = Modifier,
                    ) {
                        Text(text = "PERSON", style = MaterialTheme.typography.h5)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = "testing", style = MaterialTheme.typography.body1)

                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "Follow")
                        }
                    }

                }
           }

           Card(
               modifier = Modifier
                   .padding(16.dp),
               elevation = 5.dp,
               shape = RoundedCornerShape(corner = CornerSize(10.dp))
           ) {
               Row(
                   modifier = Modifier
                       .padding(5.dp)
                       .fillMaxWidth(),
                   verticalAlignment = Alignment.CenterVertically,
               ) {
                   Image(
                       painterResource (id = R.drawable.bofuri) ,
                       contentDescription = null,
                       contentScale = ContentScale.Crop,
                       modifier = Modifier
                           .padding(4.dp)
                           .height(140.dp)
                           .width(100.dp)
                           .clip(RoundedCornerShape(corner = CornerSize(10.dp)))
                   )
                   Column(
                       modifier = Modifier,
                   ) {
                       Text(text = "PERSON", style = MaterialTheme.typography.h5)
                       Spacer(modifier = Modifier.height(4.dp))
                       Text(text = "testing", style = MaterialTheme.typography.body1)

                       Button(onClick = { /*TODO*/ }) {
                           Text(text = "Follow")
                       }
                   }

               }
           }

           Card(
               modifier = Modifier
                   .padding(16.dp),
               elevation = 5.dp,
               shape = RoundedCornerShape(corner = CornerSize(10.dp))
           ) {
               Row(
                   modifier = Modifier
                       .padding(5.dp)
                       .fillMaxWidth(),
                   verticalAlignment = Alignment.CenterVertically,
               ) {
                   Image(
                       painterResource (id = R.drawable.bofuri) ,
                       contentDescription = null,
                       contentScale = ContentScale.Crop,
                       modifier = Modifier
                           .padding(4.dp)
                           .height(140.dp)
                           .width(100.dp)
                           .clip(RoundedCornerShape(corner = CornerSize(10.dp)))
                   )
                   Column(
                       modifier = Modifier,
                   ) {
                       Text(text = "PERSON", style = MaterialTheme.typography.h5)
                       Spacer(modifier = Modifier.height(4.dp))
                       Text(text = "testing", style = MaterialTheme.typography.body1)

                       Button(onClick = { /*TODO*/ }) {
                           Text(text = "Follow")
                       }
                   }

               }
           }

       }
    }
}

@Composable
@Preview
fun FollowingScreenPreview() {
    FollowingScreen()
}