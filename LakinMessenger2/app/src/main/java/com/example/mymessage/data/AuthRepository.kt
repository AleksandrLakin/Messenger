package com.example.mymessage.data

import com.example.mymessage.domain.RegisterData

interface AuthRepository {

    suspend fun login(login: String, password: String): Boolean

    suspend fun register(registerData: RegisterData): Boolean

}