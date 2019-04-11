package blackstone.com.githubapi_mvp.presenter

import blackstone.com.githubapi_mvp.callback.Callback
import blackstone.com.githubapi_mvp.data.Repo
import blackstone.com.githubapi_mvp.task.RepoTask
import java.util.*
import kotlin.Comparator

class MainPresenter : MainContract.Presenter {

    private lateinit var view: MainContract.View
    private lateinit var owner: String

    override fun setOwner(owner: String) {
        this.owner = owner
    }

    override fun setView(view: MainContract.View) {
        this.view = view
    }

    override fun loadRepo() {
        RepoTask.getRepo(object: Callback<ArrayList<Repo>>() {
            override fun returnResult(any: ArrayList<Repo>) {
                Collections.sort(any, object : Comparator<Repo> {
                    override fun compare(d1: Repo, d2: Repo): Int = Integer.compare(Integer.parseInt(d2.starCount), Integer.parseInt(d1.starCount))
                })
                view.loadReposInList(any)
            }

            override fun returnError(msg: String) {
                view.showError(msg)
            }
        }, owner)
    }
}