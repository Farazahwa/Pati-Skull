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
                     "SMP Negeri 1 Kayen",
                     "Jalan Raya Kayen Kec. Kayen Kab. Pati",
                     "A",
                    20339020,
                    "Kayen"
                ),

        "SD Negeri Pakis" to
                SchoolMenu(
                     "SD Negeri Pakis",
                     "Jalan Raya Kayen - Pakis KM 12 Kec. Tambakromo Kab. Pati",
                     "A",
                     20338718,
                    "Tambakromo"
                ),

        "SD Negeri Keben" to
                SchoolMenu(
                     "SD Negeri Keben",
                     "Ds. Pakem Kec. Tambakromo Kab. Pati",
                     "A",
                     20316252,
                    "Tambakromo"
                ),

        "SMP Negeri 1 Tambakromo" to
                SchoolMenu(
                     "SMP Negeri 1 Tambakromo",
                     "Jalan Raya Tambakromo Kec. Tambakromo Kab. Pati",
                     "A",
                     20338977,
                    "Tambakromo"
                ),

        "SMP Negeri 2 Tambakromo" to
                SchoolMenu(
                     "SMP Negeri 2 Tambakromo",
                     "Jl. Tambakromo-Maitan Km.12 Kec. Tambakromo Kab. Pati",
                     "A",
                    20338991,
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
                    "Pucakwangi"
                ),

        "SMP Negeri 1 Sukolilo" to
                SchoolMenu(
                     "SMP Negeri 1 Sukolilo",
                     "Jl. Sunan Prawoto No.933, Kedungwinong Kec. Sukolilo Kab. Pati",
                     "A",
                     20338990,
                    "Pucakwangi"
                ),


        "SMK Sultan Agung" to
                SchoolMenu(
                     "SMK Sultan Agung",
                     "Jalan Cengkalsewu - Kudus Km. 1, Kasiyan Kec. Sukolilo Kab. Pati",
                     "A",
                     69896442,
                    "Pucakwangi"
                ),
        "SMK Sultan Agung" to
                SchoolMenu(
                    "SMK Sultan Agung",
                    "Jalan Cengkalsewu - Kudus Km. 1, Kasiyan Kec. Sukolilo Kab. Pati",
                    "A",
                    69896442,
                    "Pucakwangi"
                ),
        "SD NEGERI KLAKAHKASIHAN 01" to
                SchoolMenu(
                    "SD NEGERI KLAKAHKASIHAN 01",
                    "Dk.Domo, Desa Klakahkasihan, Kec.Gembong, Kab.Pati",
                    "B",
                    20316366,
                    "Gembong"
                ),
        "SD NEGERI KLAKAHKASIHAN 02" to
                SchoolMenu(
                    "SD NEGERI KLAKAHKASIHAN 02",
                    "Dk.Geger, Ds.Klakahkasihan, Kec. Gembong Kab. Pati",
                    "A",
                    20331990,
                    "Gembong"
                ),
        "SD NEGERI KETANGGAN 02" to
                SchoolMenu(
                    "SD NEGERI KETANGGAN 02",
                    "Desa Ketanggan Kec. Gembong Kab. Pati",
                    "B",
                    20316243,
                    "Gembong"
                ),
        "SD NEGERI SITILUHUR 02" to
                SchoolMenu(
                    "SD NEGERI SITILUHUR 02",
                    "Desa Sitiluhur Kec. Gembong Kab. Pati",
                    "A",
                    20316605,
                    "Gembong"
                ),
        "SD NEGERI KETANGGAN 02" to
                SchoolMenu(
                    "SD NEGERI KETANGGAN 02",
                    "Desa Ketanggan Kec. Gembong Kab. Pati",
                    "B",
                    20316243,
                    "Gembong"
                ),
        "MTSN 3 PATI" to
                SchoolMenu(
                    "MTSN 3 PATI",
                    "JL. PATI GEMBONG KM 10, Desa Wonosekar Kec. Gembong Kab. Pati",
                    "A",
                    20364052,
                    "Gembong"
                ),
        "MTSS KHOIRIYAH SITILUHUR" to
                SchoolMenu(
                    "MTSS KHOIRIYAH SITILUHUR",
                    "JL. PATI GN. ROWO KM 14 SITILUHUR Kec. Gembong Kab. Pati",
                    "B",
                    20364056,
                    "Gembong"
                ),
        "SMP NEGERI 1 GEMBONG" to
                SchoolMenu(
                    "SMP NEGERI 1 GEMBONG",
                    "Jln Raya Pati Gembong Km 11 Kec. Gembong Kab. Pati",
                    "A",
                    20338983,
                    "Gembong"
                ),
        "SMK TIARA GEMBONG" to
                SchoolMenu(
                    "SMK TIARA GEMBONG",
                    "JL. RAYA PATI - GEMBONG KM 7 Desa Kedungbulus Kec. Gembong Kab. Pati",
                    "C",
                    20362560,
                    "Gembong"
                ),
        "SMA ISLAM RF GEMBONG" to
                SchoolMenu(
                    "SMA ISLAM RF GEMBONG",
                    "JL.RAYA BERMI - GEMBONG KM 1 PATI Desa Bermi Kec. Gembong Kab. Pati",
                    "B",
                    20339003,
                    "Gembong"
                ),
        "SD NEGERI GUWO 01" to
                SchoolMenu(
                    "SD NEGERI GUWO 01",
                    "Jalan Raya Pati-Gunungrowo Km 12 Desa Guwo Kec. Tlogowungu Kab. Pati",
                    "A",
                    20317258,
                    "Tlogowungu"
                ),
        "SD NEGERI GUWO 01" to
                SchoolMenu(
                    "SD NEGERI GUWO 01",
                    "Jalan Raya Pati-Gunungrowo Km 12 Desa Guwo Kec. Tlogowungu Kab. Pati",
                    "A",
                    20317258,
                    "Tlogowungu"
                ),
        "SD NEGERI GUWO 03" to
                SchoolMenu(
                    "SD NEGERI GUWO 03",
                    "Ds. Guwo RT. 02 RW. 02 Kec. Tlogowungu Kab. Pati",
                    "A",
                    20317227,
                    "Tlogowungu"
                ),
        "SD NEGERI LAHAR 01" to
                SchoolMenu(
                    "SD NEGERI LAHAR 01",
                    "Desa Lahar Kec. Tlogowungu Kab. Pati",
                    "A",
                    20316381,
                    "Tlogowungu"
                ),
        "SD NEGERI LAHAR 02" to
                SchoolMenu(
                    "SD NEGERI LAHAR 02",
                    "Desa Lahar Kec. Tlogowungu Kab. Pati",
                    "A",
                    20316380,
                    "Tlogowungu"
                ),
        "SD NEGERI PURWOSARI 01" to
                SchoolMenu(
                    "SD NEGERI PURWOSARI 01",
                    "Jl Tlogowungu Gunungrowo Km 1 Desa Purwosari Kec. Tlogowungu Kab. Pati",
                    "B",
                    20316182,
                    "Tlogowungu"
                ),
        "SMP NEGERI 1 TLOGOWUNGU" to
                SchoolMenu(
                    "SMP NEGERI 1 TLOGOWUNGU",
                    "Jl. Pati - Gunung Rowo KM.7 Desa Tlogorejo Kec. Tlogowungu Kab. Pati",
                    "A",
                    20338978,
                    "Tlogowungu"
                ),
        "SMP NEGERI 2 TLOGOWUNGU" to
                SchoolMenu(
                    "SMP NEGERI 2 TLOGOWUNGU",
                    "Jl. Pati - Gunung Rowo KM.7 Desa Tlogorejo Kec. Tlogowungu Kab. Pati",
                    "A",
                    20338978,
                    "Tlogowungu"
                ),
        "MTSS KHOIRIYAH GUWO" to
                SchoolMenu(
                    "MTSS KHOIRIYAH GUWO",
                    "JL. TLOGOWUNGU GUNUNGROWO Desa Guwo Kec. Tlogowungu Kab. Pati",
                    "B",
                    20364117,
                    "Tlogowungu"
                ),
        "SMK FARMING PATI" to
                SchoolMenu(
                    "SMK FARMING PATI",
                    "TLOGOWUNGU BAPOH KM. 1,5 Kec. Tlogowungu Kab. Pati",
                    "B",
                    20339030,
                    "Tlogowungu"
                ),
        "SD NEGERI JONTRO" to
                SchoolMenu(
                    "SD NEGERI JONTRO",
                    "Desa Jontro Kec. Wedarijaksa Kab. Pati",
                    "A",
                    20316314,
                    "Wedarijaksa"
                ),
        "SD NEGERI KEPOH" to
                SchoolMenu(
                    "SD NEGERI KEPOH",
                    "Desa Kepoh Kec. Wedarijaksa Kab. Pati",
                    "A",
                    20316265,
                    "Wedarijaksa"
                ),
        "SD NEGERI JETAK" to
                SchoolMenu(
                    "SD NEGERI JETAK",
                    "Desa Jetak Kec. Wedarijaksa Kab. Pati",
                    "A",
                    20317091,
                    "Wedarijaksa"
                ),
        "SMP NEGERI 1 WEDARIJAKSA" to
                SchoolMenu(
                    "SD NEGERI JONTRO",
                    "Jl. Raya Pati - Tayu Km 9 Desa Panggungroyom Kec. Wedarijaksa Kab. Pati",
                    "A",
                    20338979,
                    "Wedarijaksa"
                ),
        "SMP NEGERI 2 WEDARIJAKSA " to
                SchoolMenu(
                    "SMP NEGERI 2 WEDARIJAKSA",
                    "Desa KepojJontro Kec. Wedarijaksa Kab. Pati",
                    "A",
                    20338994,
                    "Wedarijaksa"
                ),
        "SMAQT YANBUUL QURAN 1" to
                SchoolMenu(
                    "SMAQT YANBUUL QURAN 1",
                    "JL. RAYA PATI - TAYU KM. 06 Desa Sukoharjo Jontro Kec. Wedarijaksa Kab. Pati",
                    "A",
                    70010053,
                    "Wedarijaksa"
                ),
        "MAS Mazro atul Ulum" to
                SchoolMenu(
                    "MAS Mazro atul Ulum",
                    "Desa Suwaduk  Kec. Wedarijaksa Kab. Pati",
                    "B",
                    69881431,
                    "Wedarijaksa"
                ),
        "MAS IHYAUL ULUM" to
                SchoolMenu(
                    "SD NEGERI JONTRO",
                    "JL RAA SOEWONDO 135 WEDARIJAKSA PATI",
                    "A",
                    20363147,
                    "Wedarijaksa"
                ),
        "SD NEGERI KAJAR 01" to
                SchoolMenu(
                    "SD NEGERI KAJAR 01",
                    "Desa Kajar Kec.Trangkil Kab. Pati",
                    "A",
                    20316292,
                    "Trangkil"
                ),
        "SD NEGERI TRANGKIL 01" to
                SchoolMenu(
                    "SD NEGERI TRANGKIL 01",
                    "Desa Trangkil Kec.Trangkil Kab. Pati",
                    "A",
                    20317283,
                    "Trangkil"
                ),
        "SD NEGERI TRANGKIL 03" to
                SchoolMenu(
                    "SD NEGERI TRANGKIL 03",
                    "Desa Trangkil Kec.Trangkil Kab. Pati",
                    "A",
                    20317224,
                    "Trangkil"
                ),
        "MTSS RAUDLATUL ULUM" to
                SchoolMenu(
                    "MTSS RAUDLATUL ULUM",
                    "Desa Guyangan Kec.Trangkil Kab. Pati",
                    "A",
                    20364122,
                    "Trangkil"
                ),
        "MTSS SHIRATHUL ULUM" to
                SchoolMenu(
                    "MTSS SHIRATHUL ULUM",
                    "Desa Kertomulyo Kec.Trangkil Kab. Pati",
                    "B",
                    20364121,
                    "Trangkil"
                ),
        "SMP TERPADU BINA BANGSA" to
                SchoolMenu(
                    "SMP TERPADU BINA BANGSA",
                    "Desa Ketanen Kec.Trangkil Kab. Pati",
                    "Belum Terakreditasi",
                    70011476,
                    "Trangkil"
                ),
        "MAS RAUDLATUL ULUM" to
                SchoolMenu(
                    "MAS RAUDLATUL ULUM",
                    "JL. JUWANA - TAYU KM 07 GUYANGAN - TRANGKIL Kec.Trangkil Kab. Pati",
                    "A",
                    20363144,
                    "Trangkil"
                ),
        "MAS SILAHUL ULUM" to
                SchoolMenu(
                    "MAS SILAHUL ULUM",
                    "Jl. Juana Tayu Km. 08 Asempapan Kec.Trangkil Kab. Pati",
                    "B",
                    20363145,
                    "Trangkil"
                ),
        "SMP TERPADU BINA BANGSA" to
                SchoolMenu(
                    "SMP TERPADU BINA BANGSA",
                    "Desa Ketanen Kec.Trangkil Kab. Pati",
                    "Belum Terakreditasi",
                    70011476,
                    "Trangkil"
                ),
    )
}