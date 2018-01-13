data class Party(private val numOfPeople: Int, val occasion: String, val location: String) {

    /**
     * Pointless function: print one dot per person
     */
    val peoplePrint: String get() {
        val s: StringBuilder = StringBuilder()
        for (i in 0..numOfPeople) {s.append(".")}
        return s.toString()
    }
}