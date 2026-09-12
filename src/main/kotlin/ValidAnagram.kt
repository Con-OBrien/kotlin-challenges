fun validAnagram(text1: String, text2: String): Boolean {
    // Char count needed for 2 strings
    // 2 Maps perhaps char, int,
    // How do we do O(n) but have two strings?
    // Loop through text1, build map counter
    // what info about text1 do we need - for the e.g. of listen, its going to be 1 of each
    // How do we check text2 with this info?
    // map add, map taketh away
    val mapChars = mutableMapOf<Char, Int>()

    if (text1.length != text2.length) return false

    for(char in text1) { mapChars[char] = (mapChars[char] ?: 0) + 1 }

   for(char in text2) {
       if(mapChars.contains(char)) {
            mapChars[char] = mapChars.getValue(char) - 1
           if(mapChars[char] == 0) { mapChars.remove(char) }
       }
       else { return false }
   }
    return mapChars.isEmpty()
}


fun main() {
    println(validAnagram("listen", "silent"))
}