package blackstone.com.githubapi_mvp.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import blackstone.com.githubapi_mvp.R
import blackstone.com.githubapi_mvp.data.Repo
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerViewAdapter(var repos: ArrayList<Repo>) : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, type: Int): MyViewHolder = MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_row, parent, false))

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvId.text = repos[position].id
        holder.tvName.text = repos[position].name
        holder.tvUrl.text = repos[position].url
        holder.tvDate.text = repos[position].date
    }

    override fun getItemCount(): Int = repos.size

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tvId: TextView
        var tvName: TextView
        var tvUrl: TextView
        var tvDate: TextView

        init {
            tvId = itemView.mID
            tvName = itemView.mName
            tvUrl = itemView.mUrl
            tvDate = itemView.mDate
        }
    }

}