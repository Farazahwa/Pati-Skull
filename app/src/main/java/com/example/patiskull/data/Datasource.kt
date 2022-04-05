package com.example.patiskull.data

import com.example.patiskull.R
import com.example.patiskull.constants.ItemType
import com.example.patiskull.model.SchoolMenu
import java.util.jar.Attributes

object Datasource {
    val schoolMenus = listOf(
        "SD Negeri Gelur" to
                SchoolMenu(
                    "SD Negeri Gelur",
                    "Dukuh Gelur, Tompegunung Kec. Sukolilo Kab. Pati",
                    "A",
                    20317109,
                    "Sukolilo"
                ),

        "SD Negeri Pakem 1" to
                SchoolMenu(
                    "SD Negeri Pakem 1",
                    "Ds. Pakem Kec. Sukolilo Kab. Pati",
                    "A",
                    20316125,
                    "Sukolilo"
                ),

        "SD Negeri Pakem 2" to
                SchoolMenu(
                    "SD Negeri Pakem 2",
                    "Dukuh Ngrombo, Pakem   Kec. Sukolilo Kab. Pati",
                    "A",
                    2031633,
                    "Sukolilo"
                ),

        "SMP Negeri 1 Sukolilo" to
                SchoolMenu(
                    "SMP Negeri 1 Sukolilo",
                    "Jl. Sunan Prawoto No.933, Kedungwinong Kec. Sukolilo Kab. Pati",
                    "A",
                    20338990,
                    "Sukolilo"
                ),

        "SMP Negeri 2 Sukolilo" to
                SchoolMenu(
                    "SMP Negeri 2 Sukolilo",
                    "Jalan Sunan Prawoto Km. 06, Wegil Kec. Sukolilo Kab. Pati",
                    "A",
                    20338990,
                    "Sukolilo"
                ),

        "SMP PGRI 15 Sukolilo" to
                SchoolMenu(
                    "SMP PGRI 15 Sukolilo",
                    "Jalan Sunan Prawoto No.09, Prawoto Kec. Sukolilo Kab. Pati",
                    "A",
                    20338966,
                    "Sukolilo"
                ),

        "SMK Sultan Agung" to
                SchoolMenu(
                    "SMK Sultan Agung",
                    "Jalan Cengkalsewu - Kudus Km. 1, Kasiyan Kec. Sukolilo Kab. Pati",
                    "A",
                    69896442,
                    "Sukolilo"
                ),

        "SMK Muhammadiyah 3 Sukolilo" to
                SchoolMenu(
                    "SMK Muhammadiyah 3 Sukolilo",
                    "Jalan KH. Ahmad Dahlan No.05 Kec. Sukolilo Kab. Pati",
                    "A",
                    20338966,
                    "Sukolilo"
                ),

        "SD Negeri Kayen 1" to
                SchoolMenu(
                    "SD Negeri Gelur",
                    "Ds. Kayen RT 03 RW 01 Kec. Kayen Kab. Pati",
                    "A",
                    20316257,
                    "Kayen"
                ),

        "SD Negeri Kayen 2" to
                SchoolMenu(
                     "SD Negeri Gelur",
                     "Jalan Perhutani Kayen Kec. Kayen Kab. Pati",
                     "A",
                     20316256,
                    "Kayen"
                ),

        "SD Negeri Pasuruhan" to
                SchoolMenu(
                     "SD Negeri Pasuruhan",
                     "Pasuruhan Kec. Kayen Kab. Pati",
                     "A",
                     20316102,
                    "Kayen"
                ),

        "SMP Negeri 1 Kayen" to
                SchoolMenu(
                     "SMP Negeri 1 Kayen",
                     "Jalan Kayen Kec. Kayen Kab. Pati",
                     "A",
                     20338859,
                    "Kayen"
                ),

        "SMP Negeri 2 Kayen" to
                SchoolMenu(
                     "SMP Negeri 2 Kayen",
                     "Rogomulyo Kec. Kayen Kab. Pati",
                     "A",
                     20338987,
                    "Kayen"
                ),

        "SMP PGRI 6 Kayen" to
                SchoolMenu(
                     "SMP Negeri Kayen",
                     "Jalan Perhutani Kayen Kec. Kayen Kab. Pati",
                     "B",
                    20338968,
                    "Kayen"
                ),

        "SMA Joyo Kusumo Kayen" to
                SchoolMenu(
                     "SMA Joyo Kusumo Kayen",
                     "Ds. Pasuruhan Kec. Kayen Kab. Pati",
                     "B",
                     20339005,
                    "Kayen"
                ),

        "SMA Negeri 1 Kayen" to
                SchoolMenu(
                     "SMP Negeri Kayen",
                     "Jalan Raya Kayen Kec. Kayen Kab. Pati",
                     "A",
                    20339020,
                    "Kayen"
                ),

        "SD Negeri Pakis" to
                SchoolMenu(
                     "SD Negeri Gelur",
                     "Dukuh Gelur, Tompegunung Kec. Sukolilo Kab. Pati",
                     "A",
                     20317109,
                    "Tambakromo"
                ),

        "SD Negeri Keben" to
                SchoolMenu(
                     "SD Negeri Pakem 1",
                     "Ds. Pakem Kec. Sukolilo Kab. Pati",
                     "A",
                     20316125,
                    "Tambakromo"
                ),

        "SD Negeri Sitirejo" to
                SchoolMenu(
                    "SD Negeri Pakem 2",
                     "Dukuh Ngrombo, Pakem   Kec. Sukolilo Kab. Pati",
                     "A",
                     2031633,
                    "Tambakromo"
                ),

        "SMP Negeri 1 Tambakromo" to
                SchoolMenu(
                     "SMP Negeri 1 Sukolilo",
                     "Jl. Sunan Prawoto No.933, Kedungwinong Kec. Sukolilo Kab. Pati",
                     "A",
                     20338990,
                    "Tambakromo"
                ),

        "SMP Negeri 2 Tambakromo" to
                SchoolMenu(
                     "SMP Negeri 2 Sukolilo",
                     "Jalan Sunan Prawoto Km. 06, Wegil Kec. Sukolilo Kab. Pati",
                     "A",
                     20338990,
                    "Tambakromo"
                ),

        "SMP Negeri 3 Tambakromo" to
                SchoolMenu(
                     "SMP PGRI 15 Sukolilo",
                     "Jalan Sunan Prawoto No.09, Prawoto Kec. Sukolilo Kab. Pati",
                     "A",
                     20338966,
                    "Tambakromo"
                ),

        "SD Negeri Lumbungmas 1" to
                SchoolMenu(
                     "SMK Sultan Agung",
                     "Jalan Cengkalsewu - Kudus Km. 1, Kasiyan Kec. Sukolilo Kab. Pati",
                     "A",
                     69896442,
                    "Winong"
                ),

        "SD Negeri Lumbungmas 2" to
                SchoolMenu(
                    "SMK Muhammadiyah 3 Sukolilo",
                     "Jalan KH. Ahmad Dahlan No.05 Kec. Sukolilo Kab. Pati",
                     "A",
                     20338966,
                    "Winong"
                ),

        "SD Negeri Gelur" to
                SchoolMenu(
                    "SD Negeri Gelur",
                     "Dukuh Gelur, Tompegunung Kec. Sukolilo Kab. Pati",
                     "A",
                     20317109,
                    "Winong"
                ),

        "SD Negeri Pakem 1" to
                SchoolMenu(
<<<<<<< HEAD
                     "SD Negeri Pakem 1",
                     "Ds. Pakem Kec. Sukolilo Kab. Pati",
                     "A",
                     20316125,
                    "Winong"
=======
                    name = "SD Negeri Pakem 1",
                    address = "Ds. Pakem Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20316125,
                    type = ItemType.Winong
>>>>>>> 6cb2f9453525fe284e7df22cf555955ee10ce6e4
                ),

        "SD Negeri Pakem 2" to
                SchoolMenu(
                     "SD Negeri Pakem 2",
                     "Dukuh Ngrombo, Pakem   Kec. Sukolilo Kab. Pati",
                     "A",
                     2031633,
                    "Winong"
                ),

        "SMP Negeri 1 Sukolilo" to
                SchoolMenu(
                     "SMP Negeri 1 Sukolilo",
                     "Jl. Sunan Prawoto No.933, Kedungwinong Kec. Sukolilo Kab. Pati",
                     "A",
                     20338990,
                    "Winong"
                ),

        "SMP Negeri 2 Sukolilo" to
                SchoolMenu(
                    "SMP Negeri 2 Sukolilo",
                     "Jalan Sunan Prawoto Km. 06, Wegil Kec. Sukolilo Kab. Pati",
                     "A",
                     20338990,
                    "Puncakwangi"
                ),

        "SMP PGRI 15 Sukolilo" to
                SchoolMenu(
                    "SMP PGRI 15 Sukolilo",
                     "Jalan Sunan Prawoto No.09, Prawoto Kec. Sukolilo Kab. Pati",
                     "A",
                     20338966,
                    "Puncakwangi"
                ),

        "SMK Sultan Agung" to
                SchoolMenu(
                     "SMK Sultan Agung",
                     "Jalan Cengkalsewu - Kudus Km. 1, Kasiyan Kec. Sukolilo Kab. Pati",
                     "A",
                     69896442,
                    "Puncakwangi"
                ),

        "SMK Muhammadiyah 3 Sukolilo" to
                SchoolMenu(
                     "SMK Muhammadiyah 3 Sukolilo",
                     "Jalan KH. Ahmad Dahlan No.05 Kec. Sukolilo Kab. Pati",
                     "A",
                     20338966,
                    "Puncakwangi"
                ),
    )
}