package com.soywiz.korge.component

import com.soywiz.korge.view.View
import com.soywiz.korge.view.Views

open class Component(val view: View) {
    val views: Views get() = view.views
    fun attach() = view.addComponent(this)
    fun dettach() = view.removeComponent(this)
    open fun update(dtMs: Int): Unit = Unit
}