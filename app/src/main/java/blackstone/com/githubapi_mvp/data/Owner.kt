package blackstone.com.githubapi_mvp.data

import com.google.gson.annotations.SerializedName

data class Owner(
    @SerializedName("avatar_url") val avatarUrl: String,
    @SerializedName("login") val name: String
)