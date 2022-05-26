package ir.ariyana.vg_market.utils

sealed class Resource<T>(val data: T ?= null, val message: String ?= null) {
    class Success<T>(data: T): Resource<T>(data)
    class Error<T>(message: String): Resource<T>(message = message, data = null)
    class Loading<T>: Resource<T>()
}
