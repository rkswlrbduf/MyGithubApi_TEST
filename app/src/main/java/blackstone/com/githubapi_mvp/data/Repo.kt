package blackstone.com.githubapi_mvp.data

import com.google.gson.annotations.SerializedName

class Repo {

    @SerializedName("name") var name: String? = null
    @SerializedName("description") var description: String? = null
    @SerializedName("stargazers_count") var starCount: String? = null
    @SerializedName("owner") var owner: Owner? = null

}