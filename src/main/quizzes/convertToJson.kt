package quizzes

import com.fasterxml.jackson.databind.ObjectMapper
import java.io.File
import java.io.OutputStream

fun main(args: Array<String>) {
    writeJson(readSample("_1week/sumAsExtension.kt"), System.`out`)
}

data class Sample(val head: String, val code: String, val task: String, val platform: String = "java")

fun readSample(fileName: String): Sample {
    val text = File("src/main/quizzes/$fileName").readText()
    val head = text.substringAfter("/* HEAD */").substringBefore("/* TASK */").trim().removeComments()
    val task = text.substringAfter("/* TASK */").substringBefore("/* CODE */").trim().removeComments()
    val code = text.substringAfter("/* CODE */").substringBefore("/* SOLUTION */").trim().replacePlaceholders()
    return Sample(head, code, task)
}

fun String.replacePlaceholders() = replace("/*[mark]*/", "[mark]")
        .replace("/*[/mark]*/", "[/mark]")

fun String.removeComments() = lines().map { it.substringAfter("// ") }.joinToString("\n")

fun writeJson(any: Any, outputStream: OutputStream) {
    val mapper = ObjectMapper()
    mapper.writerWithDefaultPrettyPrinter().writeValue(outputStream, any)
}