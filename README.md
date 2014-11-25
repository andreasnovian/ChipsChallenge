ChipsChallenge
==============

Project game Chips Challenge untuk tugas akhir ADBO

Project ini memiliki 3 komponen utama yang dipisahkan dalam 3 package berbeda: GUI, Game, dan Tile.
Project ini didesain menggunakan skema MVC (Model, View, Controller).

Package GUI berisi kelas-kelas yang berfungsi sebagai view dalam project ini.
  Kelas-kelas ini berfungsi untuk menerima masukan dan perubahan dari kelas-kelas controller dalam package Game
  
Package Game berisi kelas-kelas yang berfungsi sebagai controller dalam project ini.
  Kelas-kelas ini berfungsi untuk memberikan masukan dan perubahan kepada kelas-kelas view dalam package GUI 
  dan mendapatkan elemen penyusun permainan dari kelas-kelas model dalam package Tile
  
Package Tile berisi kelas-kelas yang berfungsi sebagai model dalam project ini.
  Kelas-kelas ini berfungsi untuk menyediakan elemen penyusun papan permainan kepada kelas-kelas controller dalam package Game
  
Urutan jalannya permainan kurang lebih adalah sebagai berikut :
- 
