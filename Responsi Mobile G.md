## Pipit Pengen Nonton Anime

## Permasalahan

Setelah sekian lama tidak bertemu kamu akhirnya bertemu kembali dengan pipit,

kemudian kamu dan pipit pergi ke cafe ligma sebelah kampus ITB Later. Kamu dan pipit berbincang sangat lama karena sudah lama tidak bertemu. Lalu pipit tiba tiba mengajak mu untuk membuat proyek aplikasi pencarian anime, kamu pun setuju dan ikut pada proyek tersebut.

Dalam project ini, pipit membuat rancangan untuk mengembangkan aplikasi mobile yang

dapat mengambil dan menampilkan informasi anime dari REST API secara dinamis dan tugas mu adalah membuat aplikasi berdasarkan rancangan pipit. Aplikasi yang dikembangkan harus menerapkan konsep pengembangan aplikasi mobile menggunakan Kotlin, Jetpack Compose,

Material Design 3, Navigation, dan arsitektur MVVM.

## Persyaratan Teknis

Aplikasi yang dikembangkan harus memenuhi persyaratan berikut.

- 1. Bahasa Pemrograman

Aplikasi wajib menggunakan Kotlin.

Mahasiswa diharapkan memanfaatkan fitur Kotlin yang relevan, seperti:

- \- Data class

- \- Null safety

- \- Lambda

- \- Collection

- \- Coroutines

- 2. User Interface


User interface wajib menggunakan:

- \- Jetpack Compose

- \- Material Design 3

- \- Custom Theme

- \- Custom Typography

Tampilan harus dibuat dengan composable dan menerapkan konsep state-driven UI.

- 3. List dan Data

Aplikasi harus memiliki halaman utama yang menampilkan kumpulan anime. Data anime

ditampilkan menggunakan salah satu komponen berikut:

- \- LazyColumn

- \- LazyVerticalGrid

Setiap item anime minimal menampilkan:

- \- Judul anime

- \- Tipe anime

- \- Rating

Data yang ditampilkan harus berasal dari API.

- 4. Search Functionality

Aplikasi harus menyediakan fitur pencarian berdasarkan judul anime dan terdapat filter

berdasarkan genre.

Ketika pengguna melakukan pencarian, aplikasi mengambil data dari API dan

menampilkan hasil pencarian.

- 5. Networking

Untuk networking, mahasiswa wajib menggunakan Jikan API.

Dokumentasi dapat dilihat pada:


https://docs.jikan.moe/

Base URL pengambilan API: [URL 🔗](https://docs.jikan.moe/)

https://api.jikan.moe/v4/ [URL 🔗](https://docs.jikan.moe/)

Endpoint pencarian: GET /anime?q={query} [URL 🔗](https://api.jikan.moe/v4/)

Contoh:

https://api.jikan.moe/v4/anime?q=naruto

Jikan menyediakan pencarian anime berdasarkan judul dan data anime yang dapat

digunakan untuk menampilkan informasi seperti judul, tipe, rating, jumlah episode, dan status. [URL 🔗](https://api.jikan.moe/v4/anime?q=naruto)

- 6. Navigation

Aplikasi maksimal memiliki 2 screen: Home Screen

Home Screen minimal memiliki:

- \- Judul aplikasi

- \- Search bar

- \- Daftar hasil pencarian anime

Ketika pengguna memilih salah satu anime, aplikasi berpindah ke Detail Screen. Detail Screen

Detail Screen minimal menampilkan:

- \- Judul anime

- \- Genre

- \- Rating

- \- Jumlah episode

- \- Status

- \- Sinopsis


Data detail dapat diperoleh menggunakan endpoint berdasarkan mal_id anime yang

dipilih. Jikan menyediakan endpoint anime berdasarkan ID.

- 7. Architecture

Aplikasi wajib menerapkan arsitektur MVVM.

Struktur aplikasi minimal memisahkan:

- \- UI atau Composable

- \- ViewModel

- \- Repository

- \- Model atau Data Class

Pengambilan data dari API tidak dilakukan secara langsung di Composable.

- 8. State dan Recomposition

Aplikasi harus menerapkan state-driven UI.

Minimal terdapat state untuk:

- \- Query pencarian

- \- Data hasil pencarian

- \- Loading

- \- Error

- \- Data detail

Perubahan state harus menyebabkan UI diperbarui melalui mekanisme recomposition

Compose..

- 9. Icon Aplikasi


Ubah icon aplikasi default dengan menggunakan character/film/anime kesukaan

mu

- 10. Submission & Deadline

Mahasiswa mengumpulkan:

- 1. Github repository yang berisi source code aplikasi.

- 2. "README.md" yang berisi:

- \- Nama aplikasi

- \- Deskripsi singkat aplikasi

- \- Screenshot & GIF aplikasi

- \- Penjelasan struktur MVVM

- \- Penjelasan penggunaan API

- 3. Video penjelasan kode.

Video berisi penjelasan implementasi kode, bukan sekadar demonstrasi penggunaan

aplikasi. Contoh untuk demonstrasi singkat menjelaskan tentang aplikasi yang dibuat dan apa saja fiturnya misalkan 1-2 menit, kemudian dilanjut penjelasan code secara mendetail 8 menit+

Kumpulkan link Github dan video penjelasan melalui form dibawah:

https://forms.gle/QRFeEX5NC5WVxoaZA

Deadline pengumpulan: 24 jam setelah responsi dilaksanakan sesuai shift masing-masing.
