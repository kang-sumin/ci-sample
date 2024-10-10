package nbc.docker.sampleapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SampleappApplication

fun main(args: Array<String>) {
    runApplication<SampleappApplication>(*args)
}
