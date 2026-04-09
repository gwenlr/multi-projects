package org.sample.myapp

import org.sample.numberutils.Numbers
import org.sample.stringutils.Strings.concat

object Main {
    fun printAnswer() {
        val output = concat(" The answer is    ", Numbers.add(19, 23))
        println(output)
    }
}


fun main(args: Array<String>) {
    println("Arguments : " + args.joinToString(" "))
    Main.printAnswer()
}
