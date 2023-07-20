# **GITS Mobile Developer Test**

MSIB 5 - Hilman Fauzi Herdiana - SE

**Jawaban Test 3 (Balanced Bracket). Berapa ukuran kompleksitas kodinganmu?**
> Kompleksitas kodingan ini dihitung berdasarkan dua aspek, yaitu ***Time Complexity*** dan ***Space Complexity***. Langkah-langkah operasi yang ada pada kodingan ini adalah sebagai berikut:
> 
> - Inisialisasi variabel `var i = -1`. Operasi ini memiliki kompleksitas waktu dan ruang **O(1)**, karena hanya melibatkan pengalokasian ruang untuk satu variabel.
> - Inisialisasi variabel `val stack = CharArray(s.length)` dengan panjang sesuai dengan panjang string `inputString`. Operasi ini memiliki kompleksitas waktu dan ruang **O(n)**, di mana `n` adalah panjang string `inputString`, karena memerlukan alokasi ruang untuk array dengan ukuran yang sesuai.
> - `for (ch in s)`, Looping  yang mengiterasi setiap karakter `ch` dalam string `inputString`. Jumlah iterasi dalam loop ini sama dengan panjang string `inputString`. Oleh karena itu, kompleksitas waktu dari loop ini adalah **O(n)**, di mana` n` adalah panjang string `inputString`.
> - `when (ch)`, memeriksa nilai karakter `ch`. Setiap pilihan disini melibatkan operasi sederhana yang memiliki kompleksitas waktu **O(1)**.
> - Pada saat karakter adalah tanda kurung buka, kita akan memasukkan karakter tersebut ke dalam `stack` dengan operasi `stack[++i] = ch`. Operasi ini memiliki kompleksitas waktu dan ruang **O(1)**, karena hanya melibatkan manipulasi pada array `stack` dan variabel `i`.
> - Pada saat karakter adalah tanda kurung tutup, kita akan membandingkannya dengan karakter teratas pada `stack` dan memutuskan apakah tanda kurung tersebut sama atau tidak. Pengecekan ini melibatkan beberapa operasi perbandingan dan Pengurangan nilai i saat menemukan tanda kurung penutup yang sesuai. Operasi ini memiliki kompleksitas waktu dan ruang **O(1)**.
> - `return i == -1`, pengecekan apakah tumpukan kosong atau tidak dengan membandingkan nilai `i` dengan -1. Operasi ini memiliki kompleksitas waktu dan ruang **O(1)**.
>
>   - Time Complexity: `O(1) + O(n) + O(1) + O(1) + O(1) + O(1) + O(1) = O(n)`
> 
>   - Space Complexity: `O(1) + O(n) + O(1) + O(1) + O(1) = O(n)`
>
> Jadi, ukuran kompleksitas kodingan ini adalah **O(n)** untuk ***Time Complexity*** dan **O(n)** untuk ***Space Complexity***, di mana `n` adalah panjang string `inputString`. Ini berarti kinerjanya efisien karena kompleksitasnya bergantung pada panjang string yang diuji.


## **Screenshot**
---
**Test 1 (A000124 of Sloane's OEIS)**


**Test 2 (Dense Ranking)**


**Test 3 (Balanced Bracket)**
