/**
 * @author aibek.kokanbekov
 */

val UNSORTED = listOf(2, 4, 1, 5, 7, 3, 6, 9, 0, 8, 2, 3)

fun printSorted(alg: (List<Int>) -> List<Int>) {
    print("Unsorted -> ")
    UNSORTED.forEach { print("$it ") }
    println()
    val sorted = alg.invoke(UNSORTED)
    print("Sorted   -> ")
    sorted.forEach { print("$it ") }
    println()
}
