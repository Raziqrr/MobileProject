/**
 * @Author: Raziqrr rzqrdzn03@gmail.com
 * @Date: 2025-04-28 23:50:36
 * @LastEditors: Raziqrr rzqrdzn03@gmail.com
 * @LastEditTime: 2025-04-29 01:39:24
 * @FilePath: app/src/main/java/com/example/a209182_lab4m/modules/ApiClient.kt
 * @Description: 这是默认设置,可以在设置》工具》File Description中进行配置
 */
package com.example.a209182_lab4m.modules

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private const val BASE_URL = "https://generativelanguage.googleapis.com/v1beta/" // Gemini base URL

    private val client = OkHttpClient.Builder()
        .build()

    val apiService: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}

