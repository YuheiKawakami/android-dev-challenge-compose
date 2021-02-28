/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.view.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Puppy

@Composable
fun PuppyDetail(navController: NavController) {
    val puppy = navController.previousBackStackEntry?.arguments?.getParcelable<Puppy>("puppy")

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "${puppy?.name}") },
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 8.dp)
        ) {
            item {
                Image(
                    painter = painterResource(
                        id = puppy?.image ?: R.drawable.ic_launcher_foreground
                    ),
                    contentDescription = null,
                    modifier = Modifier
                        .height(300.dp)
                        .fillMaxWidth()
                )
            }
            item {
                Text(
                    text = "Name",
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )
                Text(
                    text = "${puppy?.name}",
                    modifier = Modifier.padding(8.dp, 0.dp, 0.dp, 0.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
            item {
                Text(
                    text = "Sex",
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )
                Text(
                    text = "${puppy?.sex}",
                    modifier = Modifier.padding(8.dp, 0.dp, 0.dp, 0.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
            item {
                Text(
                    text = "Breed",
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )
                Text(
                    text = "${puppy?.breed}",
                    modifier = Modifier.padding(8.dp, 0.dp, 0.dp, 0.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
            item {
                Text(
                    text = "Description",
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )
                Text(
                    text = "${puppy?.description}",
                    modifier = Modifier.padding(8.dp, 0.dp, 0.dp, 0.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
            item {
                Text(
                    text = "Publish Time",
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )
                Text(
                    text = "${puppy?.publishTime}",
                    modifier = Modifier.padding(8.dp, 0.dp, 0.dp, 0.dp)
                )
            }
        }
    }
}
