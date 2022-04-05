package com.example.patiskull.data

import com.example.patiskull.constants.ItemType
import com.example.patiskull.model.SchoolMenu
import java.util.jar.Attributes

object Datasource {
    val schoolMenus = mapOf(
        "SD Negeri Gelur" to
                SchoolMenu(
                    name = "SD Negeri Gelur",
                    address = "Dukuh Gelur, Tompegunung Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20317109,
                    type = ItemType.Sukolilo
                ),

        "SD Negeri Pakem 1" to
                SchoolMenu(
                    name = "SD Negeri Pakem 1",
                    address = "Ds. Pakem Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20316125,
                    type = ItemType.Sukolilo
                ),

        "SD Negeri Pakem 2" to
                SchoolMenu(
                    name = "SD Negeri Pakem 2",
                    address = "Dukuh Ngrombo, Pakem   Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 2031633,
                    type = ItemType.Sukolilo
                ),

        "SMP Negeri 1 Sukolilo" to
                SchoolMenu(
                    name = "SMP Negeri 1 Sukolilo",

                    address = "Jl. Sunan Prawoto No.933, Kedungwinong Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20338990,
                    type = ItemType.Sukolilo
                ),

        "SMP Negeri 2 Sukolilo" to
                SchoolMenu(
                    name = "SMP Negeri 2 Sukolilo",
                    address = "Jalan Sunan Prawoto Km. 06, Wegil Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20338990,
                    type = ItemType.Sukolilo
                ),

        "SMP PGRI 15 Sukolilo" to
                SchoolMenu(
                    name = "SMP PGRI 15 Sukolilo",
                    address = "Jalan Sunan Prawoto No.09, Prawoto Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20338966,
                    type = ItemType.Sukolilo
                ),

        "SMK Sultan Agung" to
                SchoolMenu(
                    name = "SMK Sultan Agung",
                    address = "Jalan Cengkalsewu - Kudus Km. 1, Kasiyan Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 69896442,
                    type = ItemType.Sukolilo
                ),

        "SMK Muhammadiyah 3 Sukolilo" to
                SchoolMenu(
                    name = "SMK Muhammadiyah 3 Sukolilo",
                    address = "Jalan KH. Ahmad Dahlan No.05 Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20338966,
                    type = ItemType.Sukolilo
                ),

        "SD Negeri Kayen 1" to
                SchoolMenu(
                    name = "SD Negeri Gelur",
                    address = "Ds. Kayen RT 03 RW 01 Kec. Kayen Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20316257,
                    type = ItemType.Kayen
                ),

        "SD Negeri Kayen 2" to
                SchoolMenu(
                    name = "SD Negeri Gelur",
                    address = "Jalan Perhutani Kayen Kec. Kayen Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20316256,
                    type = ItemType.Kayen
                ),

        "SD Negeri Pasuruhan" to
                SchoolMenu(
                    name = "SD Negeri Pasuruhan",
                    address = "Pasuruhan Kec. Kayen Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20316102,
                    type = ItemType.Kayen
                ),

        "SMP Negeri 1 Kayen" to
                SchoolMenu(
                    name = "SMP Negeri 1 Kayen",
                    address = "Jalan Kayen Kec. Kayen Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20338859,
                    type = ItemType.Kayen
                ),

        "SMP Negeri 2 Kayen" to
                SchoolMenu(
                    name = "SMP Negeri 2 Kayen",
                    address = "Rogomulyo Kec. Kayen Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20338987,
                    type = ItemType.Kayen
                ),

        "SMP PGRI 6 Kayen" to
                SchoolMenu(
                    name = "SMP Negeri Kayen",
                    address = "Jalan Perhutani Kayen Kec. Kayen Kab. Pati",
                    Akreditasi = "B",
                    NPSN = 20338968,
                    type = ItemType.Kayen
                ),

        "SMA Joyo Kusumo Kayen" to
                SchoolMenu(
                    name = "SMA Joyo Kusumo Kayen",
                    address = "Ds. Pasuruhan Kec. Kayen Kab. Pati",
                    Akreditasi = "B",
                    NPSN = 20339005,
                    type = ItemType.Kayen
                ),

        "SMA Negeri 1 Kayen" to
                SchoolMenu(
                    name = "SMP Negeri Kayen",
                    address = "Jalan Raya Kayen Kec. Kayen Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20339020,
                    type = ItemType.Kayen
                ),

        "SD Negeri Pakis" to
                SchoolMenu(
                    name = "SD Negeri Gelur",
                    address = "Dukuh Gelur, Tompegunung Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20317109,
                    type = ItemType.Tambakromo
                ),

        "SD Negeri Keben" to
                SchoolMenu(
                    name = "SD Negeri Pakem 1",
                    address = "Ds. Pakem Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20316125,
                    type = ItemType.Tambakromo
                ),

        "SD Negeri Sitirejo" to
                SchoolMenu(
                    name = "SD Negeri Pakem 2",
                    address = "Dukuh Ngrombo, Pakem   Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 2031633,
                    type = ItemType.Tambakromo
                ),

        "SMP Negeri 1 Tambakromo" to
                SchoolMenu(
                    name = "SMP Negeri 1 Sukolilo",
                    address = "Jl. Sunan Prawoto No.933, Kedungwinong Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20338990,
                    type = ItemType.Tambakromo
                ),

        "SMP Negeri 2 Tambakromo" to
                SchoolMenu(
                    name = "SMP Negeri 2 Sukolilo",
                    address = "Jalan Sunan Prawoto Km. 06, Wegil Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20338990,
                    type = ItemType.Tambakromo
                ),

        "SMP Negeri 3 Tambakromo" to
                SchoolMenu(
                    name = "SMP PGRI 15 Sukolilo",
                    address = "Jalan Sunan Prawoto No.09, Prawoto Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20338966,
                    type = ItemType.Tambakromo
                ),

        "SD Negeri Lumbungmas 1" to
                SchoolMenu(
                    name = "SMK Sultan Agung",
                    address = "Jalan Cengkalsewu - Kudus Km. 1, Kasiyan Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 69896442,
                    type = ItemType.Winong
                ),

        "SD Negeri Lumbungmas 2" to
                SchoolMenu(
                    name = "SMK Muhammadiyah 3 Sukolilo",
                    address = "Jalan KH. Ahmad Dahlan No.05 Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20338966,
                    type = ItemType.Winong
                ),

        "SD Negeri Gelur" to
                SchoolMenu(
                    name = "SD Negeri Gelur",
                    address = "Dukuh Gelur, Tompegunung Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20317109,
                    type = ItemType.Winong
                ),

        "SD Negeri Pakem 1" to
                SchoolMenu(
                    name = "SD Negeri Pakem 1",

                    address = "Ds. Pakem Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20316125,
                    type = ItemType.Winong
                ),

        "SD Negeri Pakem 2" to
                SchoolMenu(
                    name = "SD Negeri Pakem 2",
                    address = "Dukuh Ngrombo, Pakem   Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 2031633,
                    type = ItemType.Winong
                ),

        "SMP Negeri 1 Sukolilo" to
                SchoolMenu(
                    name = "SMP Negeri 1 Sukolilo",
                    address = "Jl. Sunan Prawoto No.933, Kedungwinong Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20338990,
                    type = ItemType.Winong
                ),

        "SMP Negeri 2 Sukolilo" to
                SchoolMenu(
                    name = "SMP Negeri 2 Sukolilo",
                    address = "Jalan Sunan Prawoto Km. 06, Wegil Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20338990,
                    type = ItemType.Pucakwangi
                ),

        "SMP PGRI 15 Sukolilo" to
                SchoolMenu(
                    name = "SMP PGRI 15 Sukolilo",
                    address = "Jalan Sunan Prawoto No.09, Prawoto Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20338966,
                    type = ItemType.Pucakwangi
                ),

        "SMK Sultan Agung" to
                SchoolMenu(
                    name = "SMK Sultan Agung",
                    address = "Jalan Cengkalsewu - Kudus Km. 1, Kasiyan Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 69896442,
                    type = ItemType.Pucakwangi
                ),

        "SMK Muhammadiyah 3 Sukolilo" to
                SchoolMenu(
                    name = "SMK Muhammadiyah 3 Sukolilo",
                    address = "Jalan KH. Ahmad Dahlan No.05 Kec. Sukolilo Kab. Pati",
                    Akreditasi = "A",
                    NPSN = 20338966,
                    type = ItemType.Pucakwangi
                ),
    )
}