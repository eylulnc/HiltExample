package com.eylulcan.hiltexample

import javax.inject.Inject

class AnotherInterfaceImplementor @Inject constructor(): PrintInterface {
    override fun onPrint(): String {
        return "Another Interface Implementor"
    }
}