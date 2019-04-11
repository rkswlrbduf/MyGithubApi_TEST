package blackstone.com.githubapi_mvp.task

import blackstone.com.githubapi_mvp.callback.Callback
import blackstone.com.githubapi_mvp.data.Repo
import blackstone.com.githubapi_mvp.utils.NetworkUtils
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class RepoTask {

    companion object {
        fun getRepo(callback: Callback<ArrayList<Repo>>, owner: String) {

            NetworkUtils.getGithubRepoApiInstance()
                .getRepo(owner)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<ArrayList<Repo>> {
                    override fun onComplete() {

                    }

                    override fun onSubscribe(d: Disposable) {

                    }

                    override fun onNext(repos: ArrayList<Repo>) {
                        callback.returnResult(repos)
                    }

                    override fun onError(e: Throwable) {
                        callback.returnError(e.message.toString())
                    }
                })

        }
    }

}