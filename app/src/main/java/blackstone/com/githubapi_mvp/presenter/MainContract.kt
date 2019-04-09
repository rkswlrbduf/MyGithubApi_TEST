package blackstone.com.githubapi_mvp.presenter

import blackstone.com.githubapi_mvp.data.Repo

interface MainContract {

    interface View {
        fun loadReposInList(repos: ArrayList<Repo>)
        fun showError(msg: String)
    }

    interface  Presenter {
        fun loadRepo()
        fun setOwner(owner: String)
        fun setView(view: MainContract.View)
    }

}