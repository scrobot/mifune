package com.github.scrobot.mifune

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MifuneApplication

fun main(args: Array<String>) {
	runApplication<MifuneApplication>(*args)
}
