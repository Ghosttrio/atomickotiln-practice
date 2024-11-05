val String.indices: IntRange
    get() = 0 until length


val <T> List<T>.firstOrNull: T?
    get() = if (isEmpty()) null else this[0]


