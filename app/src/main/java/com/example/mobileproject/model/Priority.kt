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

enum class Priority {
  None,
  Low,
  Medium,
  High;

  companion object {
    fun getByName(name: String?): Priority {
      values().forEach { priority -> if (name == priority.name) return priority }

      return None
    }

    fun getOptions(): List<String> {
      val options = mutableListOf<String>()
      values().forEach { priority -> options.add(priority.name) }
      return options
    }
  }
}
