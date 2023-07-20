package com.hilman.gdsc.gits_test

fun main() {
    val inputTotalScores = arrayListOf<Int>()
    val inputGitsScores = arrayListOf<Int>()

    // input screen
    println("Jumlah pemain yang ikut serta: ")
    val inputTotalPlayers = readLine()?.toIntOrNull() ?: return
    println("Daftar skor: ")
    for (i in 1..inputTotalPlayers) {
        val score = readLine()?.toIntOrNull() ?: return
        inputTotalScores.add(score)
    }
    println("Jumlah pemain GITS:")
    val inputTotalGames = readLine()?.toIntOrNull() ?: return
    println("Daftar skor GITS:")
    for (i in 1..inputTotalGames) {
        val gitsScore = readLine()?.toIntOrNull() ?: return
        inputGitsScores.add(gitsScore)
    }

    // hitung ranking nya dan simpan hasil return pada variabel output
    val output = denseRanking(inputTotalScores, inputGitsScores)

    // output screen
    println("Input: $inputGitsScores")
    println("Output: ${output.joinToString(" ")}")
}

fun denseRanking(totalScores: ArrayList<Int>, totalGitsScores: ArrayList<Int>): ArrayList<Int> {
    val sortedTotalScores = totalScores.sortedDescending() // sort berdasarkan nilai terbesar
    val sortedGitsScore = totalGitsScores // sort berdasarkan nilai terkecil
    val rankings = ArrayList<Int>() // variabel untuk menyimpan hasil rank

    var rank = 1 // inisialisasi rank awal
    var j = sortedTotalScores.size - 1

    // looping untuk hitung rank dari skor sortedTotalScores
    for (i in 1 until sortedTotalScores.size) {
        // Jika nilai skor indeks i kurang dari nilai skor indeks i-1, maka rank akan ditambah dengan 1
        rank += if (sortedTotalScores[i] < sortedTotalScores[i - 1]) 1 else 0
    }

    for (gitsScore in sortedGitsScore) {
        /*  Jika gitsScore lebih besar dari atau sama dengan skor di posisi j dalam sortedTotalScores,
            maka iterasi j berkurang (j--) dan ganti nilai peringkat rank. */
        while (j >= 0 && gitsScore >= sortedTotalScores[j]) {
            j-- // iterator j berkurang

            /*  variable rank akan dikurangi selama j kurang dari nol atau
                score sebelumnya lebih besar selama while berlangsung */
            rank -= if (j < 0 || sortedTotalScores[j] > sortedTotalScores[j + 1]) 1 else 0
        }
        rankings.add(rank + 1) // tambahkan hasil dari rank
    }
    return rankings
}