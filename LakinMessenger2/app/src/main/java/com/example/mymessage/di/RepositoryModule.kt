package com.example.mymessage.di

import com.example.mymessage.data.AuthRepository
import com.example.mymessage.data.AuthRepositoryImpl
import com.example.mymessage.data.UsersRepository
import com.example.mymessage.data.UsersRepositoryImpl
import dagger.Module
import dagger.Provides

@Module
object RepositoryModule {

    @Provides
    fun provideRepositoryModule(impl: AuthRepositoryImpl): AuthRepository = impl

    @Provides
    fun provideUsersRepository(impl: UsersRepositoryImpl): UsersRepository = impl

}