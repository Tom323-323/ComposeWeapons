package com.tomaslab.test1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tomaslab.test1.model.Weapons
import com.tomaslab.test1.model.weaponsList
import com.tomaslab.test1.ui.theme.Test1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   MainDisplay()
                }
            }
        }
    }
}

@Composable
fun MainDisplay() {
    Scaffold(topBar = {WeaponsToolBar()}) {
        WeaponsLazyColumn()
    }
}


@Composable
fun WeaponsLazyColumn(){
    LazyColumn(modifier = Modifier.background(MaterialTheme.colors.onSecondary)){
        items(weaponsList){
            WeaponsItem(weapons = it)
        }

    }
}


@Composable
fun WeaponsToolBar(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colors.background),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

    ){
        Image(
            modifier = Modifier
                .size(64.dp)
                .padding(8.dp),
            painter = painterResource(id = R.drawable.book),
            contentDescription = null
        )

        Text(text = stringResource(R.string.title_toolBar), modifier = Modifier.padding(3.dp))

        Image(
            modifier = Modifier
                .size(64.dp)
                .padding(8.dp),
            painter = painterResource(id = R.drawable.book),
            contentDescription = null
        )
    }
}


@Composable
fun WeaponsItem(weapons:Weapons){

}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Test1Theme {
        MainDisplay()
    }
}
