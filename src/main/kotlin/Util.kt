/**
 * @author aibek.kokanbekov
 */

val UNSORTED = arrayOf(2, 4, 1, 5, 7, 3, 6, 9, 0, 8, 2, 3)

fun printSorted(alg: (Array<Int>) -> Array<Int>) {
    print("Unsorted -> ")
    UNSORTED.forEach { print("$it ") }
    val sorted = alg.invoke(UNSORTED)
    println()
    print("Sorted   -> ")
    sorted.forEach { print("$it ") }
}
