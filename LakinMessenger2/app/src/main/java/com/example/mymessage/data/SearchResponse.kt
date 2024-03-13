package com.example.mymessage.data

import com.google.gson.annotations.SerializedName

data class SearchResponse (
    @SerializedName("search_users") val users: List<UserRemote>
)