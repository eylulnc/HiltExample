package com.eylulcan.hiltexample

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

//Constructor Injection
@ActivityScoped
class Musician @Inject constructor(instrument: Instrument, band: Band) {
    fun sing(){
        println("encenc working")
    }
}