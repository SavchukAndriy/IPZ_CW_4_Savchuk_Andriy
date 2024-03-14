package com.example.ipz_cw_4_savchuk_andriy

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.ipz_cw_4_savchuk_andriy.ui.theme.IPZ_CW_4_Savchuk_AndriyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CW_4_Savchuk_AndriyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

enum class TaskStatus {
    ACTIVE, DONE
}

data class Task(val title: String, val status: TaskStatus, val description: String, val date: String)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskListScreen(tasks: List<Task>, onItemClick: (Task) -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Список завдань") }
            )
        }
    )
}