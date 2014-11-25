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
- Membuat objek dari kelas Interface
- Objek Interface membuat WelcomePanel untuk menampilkan tampilan panel pembuka
- Pemain menekan tombol "New Game" lalu objek Interface membuat Panel untuk menampilkan tampilan permainan utama
- Panel mempunyai atribut board yang merupakan objek Board dan diinisialisasi pada constructor Panel
- Board memiliki atribut player yang merupakan objek dari kelas Player
- Board melakukan setMap yang akan menginisialisasi setiap elemen pada papan permainan menggunakan objek dari kelas-kelas model
- Pemain menekan tombol arah. Penekanan tombol arah akan memanggil method move() pada objek Board.
- Setelah memanggil method move(), Panel akan melakukan setImage() dan repaint() untuk merubah tampilan pada Panel
- Jika pemain menginjak tile yang berbahaya, Board akan merubah atribut isAlive pada Player menjadi false dan merubah tampilan Panel menjadi tampilan "Game Over"
- Jika pemain sudah berhasil mencapai finish, Board akan merubah atribut isWin pada Player menjadi true dan merubah tampilan Panel menjadi tampilan "Level Completed"
