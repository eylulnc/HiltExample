package com.eylulcan.hiltexample

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import javax.inject.Singleton
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier

interface PrintInterface {

    fun onPrint(): String
}

/*@InstallIn(ActivityComponent::class)
@Module
abstract class MyModule(){

    @ActivityScoped
    @Binds
    abstract fun bindingFunction(myImplementor: InterfaceImplementor) : PrintInterface
}*/

@InstallIn(SingletonComponent::class)
@Module
class MyModule(){

    @FirstImplementor
    @Singleton
    @Provides
    fun providerFunction() : PrintInterface{
        return InterfaceImplementor()
    }

    @Singleton
    @Provides
    fun gsonProviderFunction() : Gson {
        return Gson()
    }

    @SecondImplementor
    @Singleton
    @Provides
    fun anotherProviderFunction() : PrintInterface {
        return AnotherInterfaceImplementor()
    }
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class  FirstImplementor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor
