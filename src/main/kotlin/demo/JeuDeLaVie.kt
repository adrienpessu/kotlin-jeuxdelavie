package demo

fun main(args: Array<String>) {
    fun array2dOfInt(sizeOuter: Int, sizeInner: Int): Array<IntArray>
            = Array(sizeOuter) { IntArray(sizeInner) }

    fun printarrayContent(tbl: IntArray) = tbl.forEach { row -> print(row) }

    //init array
    var array = array2dOfInt(10, 10)

    array[0][1] = 1
    array[0][3] = 1
    array[0][5] = 1
    array[0][7] = 1
    array[0][8] = 1

    array[1][1] = 1
    array[1][3] = 1
    array[1][8] = 1

    array[2][1] = 1
    array[2][3] = 1
    array[2][5] = 1
    array[2][7] = 1
    array[2][8] = 1

    array[3][1] = 1
    array[3][3] = 1
    array[3][8] = 1

    array[4][1] = 1
    array[4][3] = 1
    array[4][5] = 1
    array[4][7] = 1
    array[4][8] = 1

    array[5][1] = 1
    array[5][3] = 1
    array[5][8] = 1

    array[6][1] = 1
    array[6][3] = 1
    array[6][5] = 1
    array[6][7] = 1
    array[6][8] = 1

    array[7][1] = 1
    array[7][3] = 1
    array[7][8] = 1

    array[8][1] = 1
    array[8][3] = 1
    array[8][5] = 1
    array[8][7] = 1
    array[8][8] = 1


    array[9][1] = 1
    array[9][3] = 1
    array[9][8] = 1

    //// display
    println("step : 0")
    array.forEach { row -> println();printarrayContent(row) }
    println()

    //loop
    for (i in 1..4){
        println("Jeux de la vie")
        var newArray = array;
        for(row in 0 until array.size-1){
            for(cols in 0 until array[row].size-1){
                var aliveCount = 0
                if(row > 0) {
                    aliveCount += if( cols > 0 ) array[row-1][cols-1] else 0
                    aliveCount += array[row-1][cols]
                    aliveCount += if(cols < array[row].size) array[row-1][cols+1] else 0
                }

                aliveCount += if( cols > 0 ) array[row][cols-1] else 0
                aliveCount += if(cols < array[row].size) array[row][cols+1] else 0


                if(row < array.size) {
                    aliveCount += if( cols > 0 ) array[row+1][cols-1] else 0
                    aliveCount += array[row+1][cols]
                    aliveCount += if(cols < array[row].size) array[row+1][cols+1] else 0
                }

                newArray[row][cols] = if(array[row][cols] == 0 && aliveCount == 3) { 1 } else { 0 }
                newArray[row][cols] = if(array[row][cols] == 1 && (aliveCount == 3 || aliveCount == 2)) { 1 } else { 0 }
            }
        }

        array = newArray

        //// display
        println("step :" + i)
        array.forEach { row -> println();printarrayContent(row) }
        println()
    }







}