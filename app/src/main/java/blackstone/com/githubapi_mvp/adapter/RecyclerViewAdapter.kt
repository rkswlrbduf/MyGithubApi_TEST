package blackstone.com.githubapi_mvp.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import blackstone.com.githubapi_mvp.R
import blackstone.com.githubapi_mvp.data.Repo
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.recycler_info_row.view.*
import kotlinx.android.synthetic.main.recycler_repo_row.view.*

class RecyclerViewAdapter(val context: Context, var repos: ArrayList<Repo>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, type: Int): RecyclerView.ViewHolder = if(type == 0) InfoViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_info_row, parent, false)) else RepoViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_repo_row, parent, false))

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is InfoViewHolder) {
            holder.tvInfoName.text = repos[0].owner?.name
            Glide.with(context)
                .load(repos[0].owner?.avatarUrl)
                .into(holder.ivInfoImg)
        } else if (holder is RepoViewHolder) {
            holder.tvRepoName.text = repos[position-1].name
            holder.tvRepoDes.text = repos[position-1].description
            holder.tvStarCount.text = repos[position-1].starCount
        }
    }

    override fun getItemViewType(position: Int): Int = position

    override fun getItemCount(): Int = repos.size + 1

    class InfoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var ivInfoImg: ImageView
        var tvInfoName: TextView

        init {
            ivInfoImg = itemView.mInfoImg
            tvInfoName = itemView.mInfoName
        }

    }

    class RepoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tvRepoName: TextView
        var tvRepoDes: TextView
        var tvStarCount: TextView

        init {
            tvRepoName = itemView.mRepoName
            tvRepoDes = itemView.mRepoDescription
            tvStarCount = itemView.mStarCount
        }
    }

}