package nbc.docker.sampleapp

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
class SampleController {

    val items = listOf<String>("item1", "item2", "item3")


    @GetMapping("/")
    fun home() = "hello"

    @GetMapping("/items")
    fun findItems() = items
}