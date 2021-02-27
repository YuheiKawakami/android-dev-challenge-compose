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
package com.example.androiddevchallenge.ui.view.list

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.viewmodel.PuppyListViewModel

@Composable
fun PuppyList(viewModel: PuppyListViewModel, navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.app_name)) }
            )
        },
        content = {
            ListContent(viewModel.items) {
                navController.currentBackStackEntry?.arguments?.putParcelable("puppy", it)
                navController.navigate("detail")
            }
        }
    )
}

@Composable
fun ListContent(list: List<Puppy>, onClick: (Puppy) -> Unit) {
    LazyColumn {
        items(list) {
            PuppyListItem(it, onClick)
        }
    }
}
