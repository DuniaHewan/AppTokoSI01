package com.aplikasi.apptokosi01
import com.aplikasi.apptokosi01.response.cart.Cart

interface CallbackInterface {
    fun passResultCallback(total: String,cart:ArrayList<Cart>)
}