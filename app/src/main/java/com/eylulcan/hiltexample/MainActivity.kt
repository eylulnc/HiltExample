package com.eylulcan.hiltexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject //field Injection
    lateinit var lars : Musician

    @Inject
    lateinit var classExample: ExampleClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val instrument = Instrument()
        val band = Band()
        val james = Musician(instrument, band)
        james.sing()
        */

        lars.sing()
        println("encenc " + classExample.exampleClassFunction())
        println("encenc " + classExample.exampleClassFunForAnother())
    }
}

@AndroidEntryPoint
class FragmentExample() : Fragment(){
    @Inject
    lateinit var kirk: Musician
}