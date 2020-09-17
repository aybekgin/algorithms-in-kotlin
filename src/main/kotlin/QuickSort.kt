import kotlin.random.Random

/**
 * @author aibek.kokanbekov
 */

var recursionCount = 0

fun quicksort(arr: List<Int>): List<Int> {
    recursionCount++
    return when {
        arr.size < 2 -> arr
        else -> {
            val randomIndex = Random.nextInt(arr.size - 1)
            val pivot = arr[randomIndex]
            val less = mutableListOf<Int>()
            val greater = mutableListOf<Int>()

            arr.forEachIndexed { index, element ->
                if (index != randomIndex) {
                    if (element <= pivot) {
                        less.add(element)
                    } else {
                        greater.add(element)
                    }
                }
            }
            println("$less <$pivot> $greater")

            val sortedLess = if (less.size < 2) less else quicksort(less)
            val sortedGreater = if (greater.size < 2) greater else quicksort(greater)

            sortedLess + pivot + sortedGreater
        }
    }
}

fun main() {
    printSorted(::quicksort)
    println("recursion count $recursionCount")
}
