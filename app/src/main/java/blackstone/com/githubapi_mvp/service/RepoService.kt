package blackstone.com.githubapi_mvp.service

import blackstone.com.githubapi_mvp.data.Repo
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface RepoService {

    @GET("users/{owner}/repos")
    fun getRepo(@Path("owner") owner: String) : Observable<ArrayList<Repo>>

}