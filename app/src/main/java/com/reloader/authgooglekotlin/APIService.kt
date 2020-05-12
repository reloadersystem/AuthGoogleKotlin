package com.reloader.authgooglekotlin

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {

    //    @FormUrlEncoded
    @GET("courses?")
    fun getCursosMail(
        @Query("courseStates") courseStates: String,
        @Query("studentId") studentId: String,
        @Query("teacherId") teacherId: String,
        @Query("access_token") access_token: String
    ): Call<ResponseBody>

}