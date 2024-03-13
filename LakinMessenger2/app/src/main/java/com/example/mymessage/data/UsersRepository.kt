package com.example.mymessage.data

import com.example.mymessage.domain.User

interface UsersRepository {

    suspend fun getUsers(): List<User>

}