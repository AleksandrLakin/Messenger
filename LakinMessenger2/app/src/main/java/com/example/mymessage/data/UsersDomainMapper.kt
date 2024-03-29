package com.example.mymessage.data

import com.example.mymessage.domain.User

fun UserRemote.asDomain() = User(
    id = id,
    username = username,
    lastName = lastName,
    firstName = firstName
)

fun List<UserRemote>.asDomain() = this.map { it.asDomain() }