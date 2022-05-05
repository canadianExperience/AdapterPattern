package com.me.adapterpattern.adapter

class SocketAdapter(private val socket: Socket): ISocket {

    override fun get120Volt(): Volt {
       return socket.volts
    }

    override fun get12Volt(): Volt {
        return convertVolt(socket.volts, 10)
    }

    override fun get3Volt(): Volt {
        return convertVolt(socket.volts, 40)
    }

    private fun convertVolt(v: Volt, i: Int): Volt{
        return Volt(v.volts/i)
    }
}