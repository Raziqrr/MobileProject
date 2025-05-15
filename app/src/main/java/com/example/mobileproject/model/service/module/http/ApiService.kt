/**
 * @Author: Raziqrr rzqrdzn03@gmail.com
 * @Date: 2025-04-28 23:50:05
 * @LastEditors: Raziqrr rzqrdzn03@gmail.com
 * @LastEditTime: 2025-04-29 00:18:51
 * @FilePath: app/src/main/java/com/example/a209182_lab4m/modules/ApiService.kt
 * @Description: 这是默认设置,可以在设置》工具》File Description中进行配置
 */
package com.example.a209182_lab4m.modules

import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {

    @POST("models/gemini-2.0-flash:generateContent")
    suspend fun generateContent(
        @Query("key") apiKey: String,
        @Body request: com.example.a209182_lab4m.modules.GenerateContentRequest
    ): GenerateContentResponse
}

data class ApiResponse(
    val message: String,
    val data: List<String>
)


data class GenerateContentRequest(
    val contents: List<Content>
)

data class Content(
    val parts: List<Part>
)

data class Part(
    val text: String
)

data class GenerateContentResponse(
    val candidates: List<Candidate>?
)

data class Candidate(
    val content: ContentCandidate?
)

data class ContentCandidate(
    val parts: List<PartCandidate>?
)

data class PartCandidate(
    val text: String?
)