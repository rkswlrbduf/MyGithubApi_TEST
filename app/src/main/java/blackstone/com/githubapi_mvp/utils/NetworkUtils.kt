package blackstone.com.githubapi_mvp.utils

import blackstone.com.githubapi_mvp.service.RepoService
import blackstone.com.githubapi_mvp.adapter.RetrofitAdapter

class NetworkUtils {

    companion object {
        fun getGithubApiInstance(): RepoService = RetrofitAdapter.getInstance().create(
            RepoService::class.java)
    }

}