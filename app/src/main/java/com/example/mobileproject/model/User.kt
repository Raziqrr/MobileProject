/*
Copyright 2022 Google LLC

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package com.example.mobileproject.model

data class User(
    val id: String = "",
    val isAnonymous: Boolean = true,
    var currentWeight: Double,
    var currentHeight: Double,
    var gender: String,
    var ethnicity: String,
    var allergies: List<String>,
    var foodDislike: List<String>,
)
