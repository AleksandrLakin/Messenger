package com.example.mymessage.data

import com.example.mymessage.domain.RegisterData

fun RegisterData.asRemote() = RegisterRemote(
    username = username,
    password = password,
    lastName = lastName,
    firstName = firstName
)