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
                description = "The Toy Poodle has a square configuration with approximately the same length and height, and is covered with a unique curly coat.\n\nThey are very intelligent, athletic, and curious, and are sometimes said to be the smartest of the poodle variety.\nThey have an honorable disposition with few faults, are affectionate to their families, and treat strangers and other dogs well.",
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
                image = R.drawable.chihuahua,
                breed = "Chihuahua",
                description = "The Chihuahua has thin limbs but a stocky torso and skull. The Chihuahua is a very small dog with standing ears that is slightly longer than it is tall.\nThe ideal weight for a Chihuahua is between 1.5 and 3 kilograms.\n\nThey are bright and cheerful, but brave. They are very conservative and make a clear distinction between family members and non-family members.\nAs a result, they are very sensitive to intruders and make excellent watchdogs, but they also have a tendency to bark due to fear.",
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
                image = R.drawable.shibainu,
                breed = "Shiba Inu",
                description = "The Shiba Inu is slightly longer than it is tall, with small, erect ears, a curly tail, short hair, and a double coat.\nAt first glance, their tails look the same, but they have different morphologies, such as left-handed, right-handed, and tucked tails.\n\nThey have existed for a long time as excellent hunting dogs, not as pet dogs. They are a breed of dogs that can act on their own judgment when the hunter is not present in front of the prey, or when the hunter is present but does not give sufficient orders.\nThis kind of independence is one of the most difficult aspects of the Shiba Inu, and one that is not suitable for first-time dog owners.\nThe Shiba Inu does not tend to be overly affectionate with family members.\nHowever, they are obedient and loyal, and are conservative and defensive, so they will be strict with strangers or other dogs that violate their territory unnecessarily.",
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
                image = R.drawable.frenchbulldog,
                breed = "French Bulldog",
                description = "The French Bulldog has a large head and ears, a short tail, and muscular, stocky limbs and torso.\nThey have short hair that covers their entire body.\n\nThey have an affectionate nature that differs from their rugged appearance, and prefer to spend time with their families.\nThey like to spend time with their families. They also have unique behaviors that belie their goofy appearance.\nThey are gentle and thoughtful, with little nervousness, and most of them are not prone to barking.\nThey are peaceful and friendly to other dogs, but may not be immediately friendly to people outside the family.",
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
                image = R.drawable.pomeranian,
                breed = "Pomeranian",
                description = "The Pomeranian has a small head, large round eyes, small arms and legs, a tail that curls toward the back, and a unique, luxurious coat blowing.\nThe coat is double-coated, with long hair around the face and on the chest, and decorative hair on the tail that spreads out like a fan.\n\nThey love people and are friendly to other dogs.\nThey are active and playful.\nSome Pomeranians have inherited the temperament of their sled dog ancestors, and are sometimes strong-minded.\nBecause of their sensitive nature, they may be overly dependent on humans and may bark.",
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
                image = R.drawable.miniaturedachshund,
                breed = "Miniature Dachshund",
                description = "The Miniature Dachshund is a small dog with a short-legged, long-bodied body that is twice as long as it is tall, with droopy ears and a medium-length muzzle.\nTheir coats come in three types: smooth (short), long (soft and long), and wiry (hard and long).\n\nThey are cheerful, curious, and very active. They can be a bit stubborn, but they are smart and adaptable, and are easily accepted for training and discipline. The Miniature Dachshund is an independent hound and can be difficult to handle if overly pampered.",
                publishTime = SimpleDateFormat(
                    "yyyy/MM/dd HH:mm:ss",
                    Locale.JAPANESE
                ).format(Date())
            )
        )
    }
}
