package com.reloader.authgooglekotlin


import android.content.Context

/**
 * Created by Reloader on 16/03/2020.
 */

class Constantes(var context: Context) {

    companion object {

        val URL_BASE = "/v1/"

        val API_KEY = "AIzaSyBYjx-3kPnVG8hN18jAAixdPnw98jz1o8o"

        // public static final String TOKEN_CLASSROOM = "eyJhbGciOiJSUzI1NiIsImtpZCI6ImMxNzcxODE0YmE2YTcwNjkzZmI5NDEyZGEzYzZlOTBjMmJmNWI5MjciLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJhenAiOiI2MTE3MzM0MTA5NzAtYTIwNGlzZjE1OGRwMWQzamJpN2E0bGViMzExaWZsNDQuYXBwcy5nb29nbGV1c2VyY29udGVudC5jb20iLCJhdWQiOiI2MTE3MzM0MTA5NzAtZWVoYjhuNTc1MWw3MW8xdG9mcTc3cWFlbTZocDVraTUuYXBwcy5nb29nbGV1c2VyY29udGVudC5jb20iLCJzdWIiOiIxMTc2MTkyODc5MTE2MTEzODIxOTUiLCJoZCI6InNhY29vbGl2ZXJvcy5lZHUucGUiLCJlbWFpbCI6InJjb3JyZWEudGlAc2Fjb29saXZlcm9zLmVkdS5wZSIsImVtYWlsX3ZlcmlmaWVkIjp0cnVlLCJuYW1lIjoiUmVzZW1icmluayBFZHNvbiBDb3JyZWEgRWdvYXZpbCIsInBpY3R1cmUiOiJodHRwczovL2xoMy5nb29nbGV1c2VyY29udGVudC5jb20vYS0vQU9oMTRHaFhXdmdfS2RlZkx3bXk2NHBsZ0xlU0ZRX1hfVG5rMko1cGZuMGg9czk2LWMiLCJnaXZlbl9uYW1lIjoiUmVzZW1icmluayBFZHNvbiIsImZhbWlseV9uYW1lIjoiQ29ycmVhIEVnb2F2aWwiLCJsb2NhbGUiOiJlcyIsImlhdCI6MTU4OTMxMzg4NiwiZXhwIjoxNTg5MzE3NDg2fQ.Fzgn9jLdlmEIXPcaTVLFmLJfDbuOZgs3xUOixWcc7V8WqiHtc9QoDRl_Ubmv2hlltZ0anGDPvxxNJFTanriPgDhHCcDLylnhP2a3kHOEJBoQDLqeQCQrve1LW5-9BZqyf6qq_gQdKLOP2NSSInD3VbzSHoSKWf4CHAi2gmNLmDl7eNdNcG0gttJ4qcNelEj3t3EoyZ97hhLhWzcxN3nsARbZZc2fP3vY5AsRoj9d00ByCRAPSpdXgoeAG_muPeWEnszTNNgkMHjk3F1FO1RsC0RwHfDw1PXmLtZOYHa64U0Hj9NQBXSbySwNzFS55fysaTLs5Veyt5NGAMOC91CufQ";
        val TOKEN_CLASSROOM =
            "ya29.a0Ae4lvC12U2FEqnwS2aWZ__hM0ffvFokosWmK9tPYzbObV7ou_yubKaT4St4eqXI92302P2vSWt4rhrGqzyxhBhnahNgeDETEmnuf2GnrFDk0fMXjkCYV-Rc5NChsxI2CPnexWssA6aD81-BLqvazfuh6qUwQR53S5hQ"
        val TOKEN_REFRESH =
            "1//04p0C4eW6aSUbCgYIARAAGAQSNwF-L9Ir-fKGX4xAqOb6iNXv7PhuK8PI10jdijdTSEuy0Rg3rr7bKWv3Gi0t1RI2sI3TEG5XATg"
    }
    //https://classroom.googleapis.com/v1/courses
    //https://classroom.googleapis.com/v1/courses/53511911464/teachers/
    //https://classroom.googleapis.com/v1/courses/53511911464
    //https://classroom.googleapis.com/v1/courses?courseStates=ACTIVE&studentId=jgrandez.ti@sacooliveros.edu.pe&teacherId=106561750177077134995
    //https://classroom.googleapis.com/v1/courses?courseStates=ACTIVE&studentId=rcorrea.ti%40sacooliveros.edu.pe&teacherId=106561750177077134995&access_token=ya29.a0Adw1xeVKBdi1vy1uw6-HTBM1bP4XBMfxxNeGJlZ2FoWCBlC4kjpdaGNMnmJdmWZS72YMub1-6x5DeByLlGVznnNWbL4PPGa5MA9FzN56TRYIXi_jtUONEa9nXBEzK1PdIceFqotlCUlHEXRdW059mxixjP0paRna5FU&key=[YOUR_API_KEY]' \

}
