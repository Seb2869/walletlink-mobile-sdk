package com.coinbase.walletlink.exceptions

sealed class WebSocketException(msg: String) : RuntimeException(msg) {
    object UnableToSendData : WebSocketException("Unable to send data/text on live websocket")
}
