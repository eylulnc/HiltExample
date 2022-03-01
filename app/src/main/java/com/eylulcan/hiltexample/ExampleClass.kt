package com.eylulcan.hiltexample

import com.google.gson.Gson
import javax.inject.Inject

class ExampleClass @Inject constructor(
    @FirstImplementor private val interfaceImplementor: PrintInterface,
    private val gson: Gson,
    @SecondImplementor private val anotherInterfaceImplementor: PrintInterface
) {

    fun exampleClassFunction(): String {
        return "Working: ${interfaceImplementor.onPrint()}"
    }

    fun exampleClassFunForAnother() : String {
        return "Working: ${anotherInterfaceImplementor.onPrint()}"
    }
}