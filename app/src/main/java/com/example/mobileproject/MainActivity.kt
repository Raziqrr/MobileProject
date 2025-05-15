/**
 * @Author: Raziqrr rzqrdzn03@gmail.com
 * @Date: 2025-05-06 21:09:03
 * @LastEditors: Raziqrr rzqrdzn03@gmail.com
 * @LastEditTime: 2025-05-08 21:23:42
 * @FilePath: app/src/main/java/com/example/mobileproject/MainActivity.kt
 * @Description: 这是默认设置,可以在设置》工具》File Description中进行配置
 */
package com.example.mobileproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobileproject.screens.ai_assisstant.AIAssisstantScreen
import com.example.mobileproject.ui.theme.MobileProjectTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MobileProjectTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(
                            scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(),
                            navigationIcon = {
                                IconButton(onClick = {}) {
                                    Icon(
                                        imageVector = Icons.Filled.ArrowBackIosNew,
                                        contentDescription = "Back",
                                        tint = MaterialTheme.colorScheme.primaryContainer
                                    )
                                }
                            },
                            title = {
                                Text("Chat with Broco", style = MaterialTheme.typography.titleLarge)
                            }
                        )
                    }
                ) { innerPadding ->
                    AIAssisstantScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
