package blackstone.com.githubapi_mvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import blackstone.com.githubapi_mvp.adapter.RecyclerViewAdapter
import blackstone.com.githubapi_mvp.data.Repo
import blackstone.com.githubapi_mvp.presenter.MainContract
import blackstone.com.githubapi_mvp.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)

        presenter = MainPresenter()
        presenter.setView(this)
        presenter.setOwner("rkswlrbduf")
        presenter.loadRepo()

    }

    override fun loadReposInList(repos: ArrayList<Repo>) {
        recyclerView.adapter = RecyclerViewAdapter(repos)
    }

    override fun showError(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

}
