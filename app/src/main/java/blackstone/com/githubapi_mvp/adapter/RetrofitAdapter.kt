package blackstone.com.githubapi_mvp.adapter

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://api.github.com"

class RetrofitAdapter {

    companion object {
        private val retrofit: Retrofit by lazy {
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        }
        private val gson : Gson by lazy {
            GsonBuilder().setLenient().create()
        }

        @Synchronized fun getInstance() : Retrofit = retrofit

    }

}