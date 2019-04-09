package blackstone.com.githubapi_mvp.data

import com.google.gson.annotations.SerializedName

data class Repo(@SerializedName("name") val name: String,
           @SerializedName("id") val id: String,
           @SerializedName("created_at") val date: String,
           @SerializedName("html_url") val url: String)