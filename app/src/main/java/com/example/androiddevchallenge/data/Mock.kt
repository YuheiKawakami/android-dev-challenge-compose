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
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object Mock {
    val list = mutableListOf<Puppy>().apply {
        add(
            Puppy(
                id = "1",
                name = "Kotaro",
                image = R.drawable.toypoodle,
                breed = "Toy Puddle",
                description = "The Toy Poodle has a square configuration, almost equal in length and height, and is covered in a coat with distinctive curls. Toy Poodles are very intelligent, athletic, curious, and are sometimes said to be the smartest of the Poodle variety.They have an honorable disposition with few faults, are affectionate to their families, and treat strangers and other dogs well.",
                publishTime = SimpleDateFormat(
                    "yyyy/MM/dd HH:mm:ss",
                    Locale.JAPAN
                ).format(Date())
            )
        )
        add(
            Puppy(
                id = "2",
                name = "Koume",
                image = R.drawable.toypoodle,
                breed = "Toy Puddle",
                description = "The Toy Poodle has a square configuration, almost equal in length and height, and is covered in a coat with distinctive curls. Toy Poodles are very intelligent, athletic, curious, and are sometimes said to be the smartest of the Poodle variety.They have an honorable disposition with few faults, are affectionate to their families, and treat strangers and other dogs well.",
                publishTime = SimpleDateFormat(
                    "yyyy/MM/dd HH:mm:ss",
                    Locale.JAPANESE
                ).format(Date())
            )
        )
        add(
            Puppy(
                id = "3",
                name = "Sora",
                image = R.drawable.toypoodle,
                breed = "Toy Puddle",
                description = "The Toy Poodle has a square configuration, almost equal in length and height, and is covered in a coat with distinctive curls. Toy Poodles are very intelligent, athletic, curious, and are sometimes said to be the smartest of the Poodle variety.They have an honorable disposition with few faults, are affectionate to their families, and treat strangers and other dogs well.",
                publishTime = SimpleDateFormat(
                    "yyyy/MM/dd HH:mm:ss",
                    Locale.JAPANESE
                ).format(Date())
            )
        )
        add(
            Puppy(
                id = "4",
                name = "Hana",
                image = R.drawable.toypoodle,
                breed = "Toy Puddle",
                description = "The Toy Poodle has a square configuration, almost equal in length and height, and is covered in a coat with distinctive curls. Toy Poodles are very intelligent, athletic, curious, and are sometimes said to be the smartest of the Poodle variety.They have an honorable disposition with few faults, are affectionate to their families, and treat strangers and other dogs well.",
                publishTime = SimpleDateFormat(
                    "yyyy/MM/dd HH:mm:ss",
                    Locale.JAPANESE
                ).format(Date())
            )
        )
        add(
            Puppy(
                id = "5",
                name = "Momo",
                image = R.drawable.toypoodle,
                breed = "Toy Puddle",
                description = "The Toy Poodle has a square configuration, almost equal in length and height, and is covered in a coat with distinctive curls. Toy Poodles are very intelligent, athletic, curious, and are sometimes said to be the smartest of the Poodle variety.They have an honorable disposition with few faults, are affectionate to their families, and treat strangers and other dogs well.",
                publishTime = SimpleDateFormat(
                    "yyyy/MM/dd HH:mm:ss",
                    Locale.JAPANESE
                ).format(Date())
            )
        )
        add(
            Puppy(
                id = "6",
                name = "Chachamaru",
                image = R.drawable.toypoodle,
                breed = "Toy Puddle",
                description = "The Toy Poodle has a square configuration, almost equal in length and height, and is covered in a coat with distinctive curls. Toy Poodles are very intelligent, athletic, curious, and are sometimes said to be the smartest of the Poodle variety.They have an honorable disposition with few faults, are affectionate to their families, and treat strangers and other dogs well.",
                publishTime = SimpleDateFormat(
                    "yyyy/MM/dd HH:mm:ss",
                    Locale.JAPANESE
                ).format(Date())
            )
        )
    }
}
