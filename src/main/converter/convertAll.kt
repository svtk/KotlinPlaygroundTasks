package converter

import java.io.ByteArrayOutputStream
import java.io.File

fun main(args: Array<String>) {
    val quizzesByWeeks = File("quizzes").listFiles()
    for (week in quizzesByWeeks) {
        for (file in week.listFiles()) {
            val outputStream = ByteArrayOutputStream()
            val sample = readSample(file)
            writeJson(sample, outputStream)
            val resultingJson = outputStream.toString()
            File("src/main/json/${week.name}/${file.nameWithoutExtension}.json").writeText(resultingJson)
         //   File("src/main/code/${week.name}/${file.name}").writeText(sample.convertCode())
        }
    }
}

fun Sample.convertCode() = code
        .replace("[mark]", "")
        .replace("[/mark]", "")
        .substringAfter("//sampleStart")
        .substringBefore("//sampleEnd")
        .trim()