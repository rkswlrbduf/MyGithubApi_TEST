package blackstone.com.githubapi_mvp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_ready.*

class ReadyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ready)

        tvClick.setOnClickListener {
            Log.d("TAG", Uri.parse("testapp://repos/bumptech").toString())
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("testapp://repos/bumptech")))
        }

    }
}