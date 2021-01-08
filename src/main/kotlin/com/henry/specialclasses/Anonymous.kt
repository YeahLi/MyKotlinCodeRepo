package com.henry.specialclasses

interface OnClickListener{
    fun onClick()
}

class View(var onClickListener: OnClickListener)

open class Button

fun main() {
    val view = View(object:Button(), OnClickListener{
        override fun onClick() {
            println("click on the button")
        }
    })
    view.onClickListener.onClick()
}