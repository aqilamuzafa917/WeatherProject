
<!-- Improved compatibility of back to top link -->
<a name="readme-top"></a>

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/aqilamuzafa917/WeatherProject">
 
  </a>

<h3 align="center">WeatherProject</h3>

  <p align="center">
    WeatherProject adalah aplikasi Android berbasis Kotlin yang mengambil data cuaca dari OpenWeatherMap API dan menampilkan informasi cuaca global.
    <br />
    <br />
  </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#tentang-proyek">Tentang Proyek</a>
      <ul>
        <li><a href="#fitur">Fitur</a></li>
        <li><a href="#teknologi-yang-digunakan">Teknologi yang Digunakan</a></li>
        <li><a href="#gambar">Gambar</a></li>
      </ul>
    </li>
    <li>
      <a href="#memulai">Memulai</a>
      <ul>
        <li><a href="#prasyarat">Prasyarat</a></li>
        <li><a href="#instalasi">Instalasi</a></li>
      </ul>
    </li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#desain">Desain</a></li>
    <li><a href="#lisensi">Lisensi</a></li>
    <li><a href="#kontak">Kontak</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## Tentang Proyek

### Fitur

* Data cuaca real-time
* Prakiraan cuaca 4 hari ke depan
* Pencarian lokasi global
* Pilihan satuan pengukuran: Metrik/Celsius, Imperial/Fahrenheit, dan Standar/Kelvin
* Integrasi GPS untuk mendeteksi cuaca di lokasi Anda
* Menyimpan hingga 3 lokasi favorit untuk akses cepat

<p align="right">(<a href="#readme-top">Kembali ke atas</a>)</p>

### Teknologi yang Digunakan

* **Kotlin**
* **Android SDK**
* **MVVM architecture**
* **ViewModel dan LiveData**
* **Shared Preferences**
* **ViewBinding**
* **Coroutines & Flows**
* **Retrofit**
* **MPAndroidChart**
* **Glide**
* **Firebase Crashlytics**
* **Dagger Hilt**

<p align="right">(<a href="#readme-top">Kembali ke atas</a>)</p>


<!-- GETTING STARTED -->
## Memulai

### Prasyarat
* Gunakan OpenJDK 17  [OpenJDK 17](https://aka.ms/download-jdk/microsoft-jdk-17.0.13-windows-x64.msi)
* Android Studio
* API key dari OpenWeatherMap dan Algolia

### Instalasi

1. Clone repositori ini
   ```sh
   git clone https://github.com/aqilamuzafa917/WeatherProject.git
   ```
2. Tambahkan file `local.properties` di root proyek jika belum ada.
3. Dapatkan API Key OpenWeatherMap di [OpenWeatherMap](https://home.openweathermap.org/users/sign_in).
4. Tambahkan API Key Anda ke file `local.properties`:
   ```properties
   OPENWEATHER_KEY=your_openweather_key
   ```
5. Buat akun gratis di [Algolia](https://www.algolia.com/)
6. Generate a search API key, save the ID of the app you have created, and then create an index under that app. You will need to save the index name to set up the search functionality in this app

7. Selanjutnya, populate the index with the following <a href="https://drive.google.com/file/d/1ImLwmPhV83evkeQs1zu2iR8N6k7bQ-Je/view?usp=sharing">records</a>
8. dan dapatkan API Key, App ID, serta nama index. Tambahkan ke file `local.properties`:
   ```properties
   ALGOLIA_KEY=your_algolia_key (Write API Key)
   ALGOLIA_APP_ID=your_app_id
   ALGOLIA_INDEX_NAME=your_index_name
   ```

<p align="right">(<a href="#readme-top">Kembali ke atas</a>)</p>

<!-- LICENSE -->
## Lisensi

Proyek ini didistribusikan di bawah lisensi GPL-3.0. Lihat file `LICENSE` untuk detail lebih lanjut.

<p align="right">(<a href="#readme-top">Kembali ke atas</a>)</p>

