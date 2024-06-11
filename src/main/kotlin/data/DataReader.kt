package data

object DataReader {
    fun readResourceFile(name: String = "template") =
        ClassLoader.getSystemResource("$name.txt").readText().split("\n")
}