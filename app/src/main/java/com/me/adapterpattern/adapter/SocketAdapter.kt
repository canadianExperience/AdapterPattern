package com.me.adapterpattern.adapter

class SocketAdapter(): ISocket {

    override fun get120Volt(socket: Socket): Volt {
       return socket.volts
    }

    override fun get12Volt(socket: Socket): Volt {
        return convertVolt(socket.volts, 10)
    }

    override fun get3Volt(socket: Socket): Volt {
        return convertVolt(socket.volts, 40)
    }

    private fun convertVolt(v: Volt, i: Int): Volt{
        return Volt(v.volts/i)
    }
}