
# Pipit Pengen Nonton Anime

**Pipit Pengen Nonton Anime** merupakan aplikasi mobile yang digunakan untuk mencari dan melihat informasi mengenai anime. Aplikasi ini memungkinkan pengguna untuk mencari anime berdasarkan judul, melakukan filter berdasarkan genre, serta melihat informasi detail dari anime yang dipilih.

Aplikasi dikembangkan menggunakan Kotlin dan Jetpack Compose dengan penerapan Material Design 3, Navigation, serta arsitektur MVVM. Data anime yang ditampilkan pada aplikasi diperoleh secara dinamis dari Jikan API.

## Screenshot Aplikasi

| Home Screen | Hasil Pencarian |
|:---:|:---:|
| <img src="https://github.com/user-attachments/assets/7f81a54b-9860-4a6b-9eb6-366698b21dde" alt="Home Screen" width="250"> | <img src="https://github.com/user-attachments/assets/7f9b106e-98f7-4c2b-aae0-e585627ea401" alt="Hasil Pencarian" width="250"> |

| Detail Anime | Hasil Tidak Ditemukan |
|:---:|:---:|
| <img src="https://github.com/user-attachments/assets/74f714c3-5a05-452d-84af-c7fff9a04ad3" alt="Detail Anime" width="250"> | <img src="https://github.com/user-attachments/assets/38e49bef-1c15-4184-bd03-ddda91b8ccb2" alt="Anime Tidak Ditemukan" width="250"> |

| Logo Aplikasi | Berdasarkan Genre |
|:---:|:---:|
| <img src="https://github.com/user-attachments/assets/7a2f4898-8da8-4884-a595-bd08223d892e" alt="Logo Aplikasi" width="250"> | <img src="https://github.com/user-attachments/assets/f12786c2-3644-488b-80e4-4073997debff" alt="Tampilan Berdasarkan Genre" width="250"> |

## GIF Aplikasi

![Demo Aplikasi](screenshots/demo.gif)

## Struktur MVVM

Aplikasi menerapkan arsitektur **Model-View-ViewModel (MVVM)** untuk memisahkan bagian data, proses pengolahan data, dan tampilan aplikasi.

Struktur project:

```text
com.pemmob.pipitanime
│
├── data
│   ├── model
│   │   ├── Anime.kt
│   │   └── AnimeResponse.kt
│   │
│   ├── remote
│   │   ├── JikanApi.kt
│   │   └── RetrofitInstance.kt
│   │
│   └── repository
│       └── AnimeRepository.kt
│
├── ui
│   ├── screen
│   │   ├── HomeScreen.kt
│   │   └── DetailScreen.kt
│   │
│   └── theme
│
└── viewmodel
    └── AnimeViewModel.kt
```
