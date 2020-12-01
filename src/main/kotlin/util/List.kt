package util

inline fun <T> List<T>.getAllPairs(pair: (T, T) -> Unit) {
    for (i in 0 until size) {
        for (j in (i + 1) until size) {
            pair(get(i), get(j))
        }
    }
}

inline fun <T> List<T>.getAllTriples(triple: (T, T, T) -> Unit) {
    for (i in 0 until size) {
        for (j in (i + 1) until size) {
            for (k in (j + 1) until size) {
                triple(get(i), get(j), get(k))
            }
        }
    }
}