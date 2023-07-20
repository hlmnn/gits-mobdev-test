package com.hilman.gdsc.gits_test

fun main() {
    println("Input: ")
    val input = readLine() ?: return

    // cek Balanced Bracket
    if (isBalancedBracket(input))
        println("YES")
    else
        println("NO")
}

fun isBalancedBracket(s: String): Boolean {
    var i = -1 // inisialisasi untuk index stack itu kosong
    val stack = CharArray(s.length) // ubah dari string menjadi array

    // loop untuk setiap karakter ch dalam string s.
    for (ch in s) {
        // cek kondisi jika ch ada karakter ({[ atau tidak
        when (ch) {
            // jika kurung terbuka "(, {, ["
            '(', '{', '[' -> stack[++i] = ch // char akan dimasukkan ke dalam stack
            // jika bukan kurung terbuka (kurung tutup)
                /* jika i tidak kosong, dan char ch sama dengan kurung
                    tutup dan yang sesuai dengan kurung terbuka stack[i] */
            else ->if (i >= 0 && (stack[i] == '(' && ch == ')' ||
                    stack[i] == '{' && ch == '}' ||
                    stack[i] == '[' && ch == ']')) i-- // maka tanda kurung teratas dihapus dari array dengan mengurangi nilai i
                else return false // Jika kondisi tidak terpenuhi, berarti tanda kurung tidak sama dan akan me-return false
        }
    }
    return i == -1 // cek i jika sudah kosong maka proses cek tanda kurung selesai (kosong) maka true atau tidak kosong false
}