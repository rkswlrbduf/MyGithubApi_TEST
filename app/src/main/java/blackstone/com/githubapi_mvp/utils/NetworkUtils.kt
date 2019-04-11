package blackstone.com.githubapi_mvp.utils

import blackstone.com.githubapi_mvp.service.GithubService
import blackstone.com.githubapi_mvp.adapter.RetrofitAdapter
import retrofit2.create

class NetworkUtils {

    companion object {
        fun getGithubRepoApiInstance(): GithubService = RetrofitAdapter.getInstance().create(
            GithubService::class.java)
    }

}