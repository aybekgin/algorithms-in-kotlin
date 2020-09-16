import kotlin.random.Random

/**
 * @author aibek.kokanbekov
 */

fun quicksort(arr: Array<Int>): Array<Int> {
    return when {
        arr.size < 2 -> arr
        else -> {
            val randomIndex = Random.nextInt(arr.size - 1)
            val pivot = arr[randomIndex]
            val less = arr.filterIndexed { index, i ->
                index != randomIndex && i <= pivot
            }.toTypedArray()
            val greater = arr.filterIndexed { index, element ->
                index != randomIndex && element > pivot
            }.toTypedArray()
            quicksort(less) + pivot + quicksort(greater)
        }
    }
}

fun main() {
    printSorted(::quicksort)
}
