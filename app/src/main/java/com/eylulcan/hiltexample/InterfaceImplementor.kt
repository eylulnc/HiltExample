package com.eylulcan.hiltexample

import javax.inject.Inject

class InterfaceImplementor @Inject constructor() : PrintInterface{
    override fun onPrint(): String {
        return "Interface Implemented"
    }
}