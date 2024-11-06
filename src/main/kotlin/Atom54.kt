private tailrec fun sum(
    n: Long,
    accumulator: Long
): Long =
    if (n == 0L) accumulator
    else sum(n - 1, accumulator + n)


fun sum(n: Long) = sum(n, 0)

fun main() {
    sum(2)
    sum(100000)
}
