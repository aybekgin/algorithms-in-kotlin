/**
 * @author aibek.kokanbekov
 */

fun mergeSort(arr: List<Int>): List<Int> {
    return when {
        arr.size < 2 -> {
            arr
        }
        arr.size == 2 -> {
            if (arr[0] < arr[1]) {
                arr
            } else {
                listOf(arr[1], arr[0])
            }
        }
        else -> {
            val mid = arr.size / 2
            val left = mergeSort(arr.take(mid))
            val right = mergeSort(arr.drop(mid))
            val (short, long) = getShortToLong(left, right)
            val shortMerged = short.mapIndexed { index, _ ->
                mergeSort(listOf(short[index], long[index]))
            }.flatten()
            shortMerged + long.drop(short.size)
        }
    }
}

fun getShortToLong(left: List<Int>, right: List<Int>): Pair<List<Int>, List<Int>> {
    return if (left.size < right.size) {
        left to right
    } else {
        right to left
    }
}

fun main() {
    val mergeSort = mergeSort(listOf(93, 36, 22, 33, 44, 66, 78, 10, 5, 23))
    println(mergeSort)
}