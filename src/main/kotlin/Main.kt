import java.util.*

fun main() {
    var fruit = arrayOf("Apple", "Bannana", "Orange", "Plum")
    var numOfFruits = intArrayOf(5, 4 , 3, 2, 1)
    var fruiNumStrings = arrayOf("5", "4", "3", "2", "1")
    var x = arrayListOf<String>() //<- strictest version


    var bothArrays = arrayOf<Array<String>>(fruit, fruiNumStrings)

    println("Both Arrays: $bothArrays")

    println(bothArrays[1][1])
    println(Arrays.toString(fruit))

    for (i in fruit){

        println(i)
    }

}