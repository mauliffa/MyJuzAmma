package com.example.myjuzamma

object SurahData {
    private val surahNames = arrayOf("Surah An-Nas",
        "Surah Al-Falaq",
        "Surah Al-Ikhlas",
        "Surah Al-Lahab",
        "Surah Al-Nasr",
        "Surah Al-Kafirun",
        "Surah Al-Kautsar",
        "Surah Al-Maun",
        "Surah Al-Quraisy",
        "Surah Al-Fiil",
        "Surah Al-Humazah"
    )

    private val surahAyat = arrayOf("Makkiyah",
        "Makkiyah", "Makkiyah", "Makkiyah", "Madaniyah", "Makkiyah", "Makkiyah",
        "Makkiyah", "Makkiyah", "Makkiyah", "Makkiyah")

    private val surahPlaces = arrayOf("6 ayat",
        "5 ayat",
        "4 ayat",
        "5 ayat",
        "3 ayat",
        "6 ayat",
        "3 ayat",
        "7 ayat",
        "4 ayat",
        "5 ayat",
        "9 ayat"
    )

    private val surahMeanings = arrayOf("Manusia",
        "Waktu Subuh",
        "Keesaan Allah",
        "Gejolak Api",
        "Pertolongan",
        "Manusia Kafir",
        "Nikmat yang Banyak",
        "Barang-Barang yang Berguna",
        "Suku Quraisy",
        "Gajah",
        "Pengumpat"
    )

    private val surahPict = intArrayOf(R.drawable.an_nas,
        R.drawable.al_falaq,
        R.drawable.al_ikhlas,
        R.drawable.al_lahab,
        R.drawable.an_nasr,
        R.drawable.al_kafirun,
        R.drawable.al_kautsar,
        R.drawable.al_maun,
        R.drawable.al_quraisy,
        R.drawable.al_fiil,
        R.drawable.al_humazah
    )

    val listData: ArrayList<Surah>
        get() {
            val list = arrayListOf<Surah>()
            for (position in surahNames.indices) {
                val surah = Surah()
                surah.name = surahNames[position]
                surah.ayat = surahAyat[position]
                surah.place = surahPlaces[position]
                surah.meaning = surahMeanings[position]
                surah.pict = surahPict[position]
                list.add(surah)
            }
            return list
        }
}