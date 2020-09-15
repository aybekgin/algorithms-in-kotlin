/**
 * @author aibek.kokanbekov
 */

fun quicksort(arr: Array<Int>): Array<Int> {
    return when {
        arr.size < 2 -> arr
        else -> {
            val pivot = arr[0]
            val less = arr.takeLast(arr.size - 1).filter { it <= pivot }.toTypedArray()
            val greater = arr.takeLast(arr.size - 1).filter { it > pivot }.toTypedArray()
            quicksort(less) + pivot + quicksort(greater)
        }
    }
}

fun main() {
    printSorted(::quicksort)
}
