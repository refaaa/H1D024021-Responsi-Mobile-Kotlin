
# Pipit Pengen Nonton Anime

**AnimeKu** merupakan aplikasi mobile yang digunakan untuk mencari dan melihat informasi mengenai anime. Aplikasi ini memungkinkan pengguna untuk mencari anime berdasarkan judul, melakukan filter berdasarkan genre, serta melihat informasi detail dari anime yang dipilih.

Aplikasi dikembangkan menggunakan Kotlin dan Jetpack Compose dengan penerapan Material Design 3, Navigation, serta arsitektur MVVM. Data anime yang ditampilkan pada aplikasi diperoleh secara dinamis dari Jikan API.

## Identitas

**Nama:** Refa Hasanah  
**NIM:** H1D024021  
**Shift Awal:** H  
**Shift Baru:** G

## Screenshot Aplikasi

| Home Screen | Hasil Pencarian |
|:---:|:---:|
| <img width="250" alt="Home Screen" src="https://github.com/user-attachments/assets/83d77341-2a75-46e7-8063-1c290b3ee125"> | <img width="250" alt="Hasil Pencarian" src="https://github.com/user-attachments/assets/2c3279c1-4710-47aa-a757-ddd1595cc77c"> |

| Detail Anime | Hasil Tidak Ditemukan |
|:---:|:---:|
| <img width="250" alt="Detail Anime" src="https://github.com/user-attachments/assets/054558f8-a075-4016-9e4a-ba5b3f97c8b2"> | <img width="250" alt="Hasil Tidak Ditemukan" src="https://github.com/user-attachments/assets/c017de3d-d2a0-4c71-9cfb-411936414143"> |

| Logo Aplikasi | Berdasarkan Genre |
|:---:|:---:|
| <img width="250" alt="Logo Aplikasi" src="https://github.com/user-attachments/assets/7a2f4898-8da8-4884-a595-bd08223d892e"> | <img width="250" alt="Berdasarkan Genre" src="https://github.com/user-attachments/assets/9d655dad-7aef-4c75-80cd-66358e0de756"> |

## GIF Aplikasi

[Demo Aplikasi](https://youtu.be/JqKSSkhGGj4?si=5vVj0KGLgQJkBVG4)

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
