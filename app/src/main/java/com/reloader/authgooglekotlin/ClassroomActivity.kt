package com.reloader.authgooglekotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.reloader.classroomdeveloper.adapters.RecyclerAdapterCursos
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ClassroomActivity : AppCompatActivity() {

    private lateinit var tema: String


    private lateinit var KeyApi: String
    private lateinit var Token: String
    private lateinit var coursesStates: String
    private lateinit var studentId: String
    private lateinit var teacherId: String
    private lateinit var Refresh_Token: String
    private var mCursosList: MutableList<MCursos>? = null
    private lateinit var recyclerAdapterCursos: RecyclerAdapterCursos
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classroom)


        val message = intent?.getStringExtra("tokenID")
        Log.v("TOKEN_DATA", message)


        KeyApi = Constantes.API_KEY
        Token = Constantes.TOKEN_CLASSROOM
        Refresh_Token = Constantes.TOKEN_REFRESH
        coursesStates = "ACTIVE"
        studentId = "ad22000006@sacooliveros.edu.pe"

      //  studentId = txt_titulo.getText().toString()
//                teacherId = "103900861770560048977"; //5to catolica
        teacherId = "112956248399671464321" //5to sm

        val endPoint = getConfiguration(this).create(APIService::class.java)
        val responseBodyCall = endPoint.getCursosMail(coursesStates, studentId, teacherId, Token)
        responseBodyCall.enqueue(object : Callback<ResponseBody> {

            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {

                val informacion: ResponseBody? = response.body()
                Log.v("response", informacion.toString())

                if (response.isSuccessful) {
                    try {


                    } catch (e: Exception) {
                        e.printStackTrace()
                    }

                }
            }

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                Log.e("infoResponseErrorPost", t.message)
            }
        })


    }
}
