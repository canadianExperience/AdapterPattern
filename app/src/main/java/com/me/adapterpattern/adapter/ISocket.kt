package com.me.adapterpattern.adapter

interface ISocket {
    fun get120Volt(): Volt
    fun get12Volt(): Volt
    fun get3Volt(): Volt
}