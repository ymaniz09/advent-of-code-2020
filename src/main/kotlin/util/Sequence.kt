package util

fun <T> Sequence<T>.asInfinite() = sequence { while (true) yieldAll(this@asInfinite) }