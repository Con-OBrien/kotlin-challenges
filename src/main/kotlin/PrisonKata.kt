fun getNumberOfFreedPrisoners(cells: Array<Boolean>) : Int {
    var freedPrisoners: Long = 0
    var isInverted = false

    for(cell in cells.indices) {
        if(cell == 0 && !cells[cell]) { return 0 }
        val effectiveValue = if(isInverted) { !cells[cell] } else { cells[cell] }
        if(effectiveValue) {
            freedPrisoners += 1
            isInverted = !isInverted
        }
    }
    return freedPrisoners.toInt()
}

fun main() {
    println("Answer should be: 4" + ", Answer is: " + getNumberOfFreedPrisoners(arrayOf(true, true, false, false, false, true, false)))
}
