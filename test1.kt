package com.hilman.gdsc.gits_test

fun main() {
    println("Input: ")
    val input = readLine()?.toInt()   // store user's input

    if (input != null) { // jika input tidak null
        if (input > 0) { // jika input lebih besar dari nol, hitung rumus A000124 of Sloane’s OEIS
            val output = calculate(input)   // hitung dan simpan hasilnya ke variable output
            println("Output : $output")     // tampilkan outputnya
        }
    }
}

fun calculate(n: Int): String {
    var result = ""
    for (i in 0..n) {
        // rumus A000124 of Sloane’s OEIS
        val current = (i * (i + 1) / 2) + 1

        // jika index bukan nol tambahkan '-' didepan angka, simpan hasil hitung variable current ke result
        result += if (i == 0) "$current" else "-$current"
    }
    return result
}
