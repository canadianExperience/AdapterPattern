package com.me.adapterpattern.adapter

interface ISocket {
    fun get120Volt(socket: Socket): Volt
    fun get12Volt(socket: Socket): Volt
    fun get3Volt(socket: Socket): Volt
}