package com.example.cep.Api

import com.example.cep.model.Endereco
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface API {

    @GET("ws/{cep}/json/")
    fun setEndereco(@Path("cep") cep: String): Call<Endereco>

}
