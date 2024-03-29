package com.example.mymessage.data

import com.example.mymessage.domain.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class UsersRepositoryImpl @Inject constructor(
    private val api: Api
) : UsersRepository {
    override suspend fun getUsers(): List<User> {
        val model = SearchRequest("")
        return withContext(Dispatchers.IO) {
            api.search(model).users.asDomain()
        }
    }
}