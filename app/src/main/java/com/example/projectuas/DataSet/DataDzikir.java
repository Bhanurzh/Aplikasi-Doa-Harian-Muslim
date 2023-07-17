package com.example.projectuas.DataSet;

import com.example.projectuas.VariableData.Dzikir;

import java.util.ArrayList;

public class DataDzikir {
    private static String[] dzikirSholat = {
            "1. Membaca Istighfar 3x",
            "2. Membaca Dzikir Laa Ilaahailallah Wahdahu 3x",
            "3. Memohon perlindungan dari siksa neraka 5x",
            "4. Membaca Pujian Allahumma Antassalam",
            "5. Membaca Surat Al-Fatihah",
            "6. Membaca Ayat Kursi",
            "7. Membaca Tasbih, Tahmid dan Takbir 33x",
            "8. Membaca Surat Al-ikhlas",
            "9. Membaca Surat Al-Falaq",
            "10. Membaca Surat An-Nas"
    };

    private static String[] niatArab = {
            "أَسْتَغْفِرُ اللهَ الْعَظِـيْمِ الَّذِيْ لَااِلَهَ اِلَّا هُوَ الْحَيُّ الْقَيُّوْمُ وَأَتُوْبُ إِلَيْهِ",
            "لَاإِلَهَ إِلَّا اللهُ وَحْدَهُ لَا شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ يُحْيِيْ وَيُمِيْتُ وَهُوَ عَلَى كُلِّ شَيْئٍ قَدِيْرٌ",
            "اَللَّهُمَّ أَجِرْنِـى مِنَ النَّارِ",
            "للَّهُمَّ أَنْتَ السَّلاَمُ، وَمِنْكَ السَّلَامُ، وَإِلَيْكَ يَعُوْدُ السَّلَامُ فَحَيِّنَارَبَّنَا بِالسَّلَامِ وَاَدْخِلْنَا الْـجَنَّةَ دَارَ السَّلَامِ تَبَارَكْتَ رَبَّنَا وَتَعَالَيْتَ يَا ذَاالْـجَلَالِ وَاْلإِكْرَام",
            "بِسْمِ اللَّـهِ الرَّحْمَـٰنِ الرَّحِيمِ ﴿١﴾الْحَمْدُ لِلَّـهِ رَبِّ الْعَالَمِينَ ﴿٢﴾ الرَّحْمَـٰنِ الرَّحِيمِ ﴿٣﴾ مَالِكِ يَوْمِ الدِّينِ ﴿٤﴾ إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ ﴿٥﴾ اهْدِنَا   الصِّرَاطَ الْمُسْتَقِيمَ ﴿٦﴾ صِرَاطَ الَّذِينَ أَنْعَمْتَ عَلَيْهِمْ غَيْرِ الْمَغْضُوبِ عَلَيْهِمْ وَلَا الضَّالِّينَ",
            "اَللّٰهُ لَآ اِلٰهَ اِلَّا هُوَۚ اَلْحَيُّ الْقَيُّوْمُ ەۚ لَا تَأْخُذُهٗ سِنَةٌ وَّلَا نَوْمٌۗ لَهٗ مَا فِى السَّمٰوٰتِ وَمَا فِى الْاَرْضِۗ مَنْ ذَا الَّذِيْ يَشْفَعُ عِنْدَهٗٓ اِلَّا بِاِذْنِهٖۗ يَعْلَمُ مَا بَيْنَ اَيْدِيْهِمْ وَمَا خَلْفَهُمْۚ وَلَا يُحِيْطُوْنَ بِشَيْءٍ مِّنْ عِلْمِهٖٓ اِلَّا بِمَا شَاۤءَۚ وَسِعَ كُرْسِيُّهُ السَّمٰوٰتِ وَالْاَرْضَۚ وَلَا يَـُٔوْدُهٗ حِفْظُهُمَاۚ وَهُوَ الْعَلِيُّ الْعَظِيْمُ",
            "سُبْحَانَ اللهِ ×٣٣\nاَلْحَمْدُلِلهِ ×٣٣\nاَللهُ اَكْبَرْ ×٣٣",
            "قُلْ هُوَ اللَّهُ أَحَدٌ، اللَّهُ الصَّمَدُ، لَمْ يَلِدْ وَلَمْ يُولَدْ، وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ",
            "قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ، مِن شَرِّ مَا خَلَقَ، وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ، وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ، وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ",
            "قُلْ أَعُوذُ بِرَبِّ النَّاسِ، مَلِكِ النَّاسِ، إِلَٰهِ النَّاسِ، مِن شَرِّ الْوَسْوَاسِ الْخَنَّاسِ، الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ، مِنَ الْجِنَّةِ وَالنَّاسِ"
    };

    private static String[] niatLatin = {
            "Astaghfirulloh al-adziim alladzii laa ilaha illaa huwal hayyul qayyuumu wa atuubu ilaih",
            "Laa ilaahailallooh wahdahu laa syariikalah, lahul mulku, walahul hamdu wa huwa alaa kullii syaiin qadiir",
            "Allahuma ajirni minan-naar",
            "Allahumma antassalaam wa minkassalaam wa ilaika ya’uudussalaam fahayyinaa rabbanaa bissalaam wa adkhilnaljannata daarassalaam tabarakta rabbanaa wa ta’aa laita yaa dzaljalaali walikraam",
            "1. Bismillahirrahmanirrahim\n2. Alhamdulillahi rabbil alamin\n3. Arrahmaanirrahiim\n4. Maaliki yaumiddiin\n5. Iyyaka nabudu waiyyaaka nastaiin\n6. Ihdinashirratal mustaqim\n7.shiratalladzina an amta alaihim ghairil maghduubi alaihim waladhaalin",
            "Alloohu laa ilaaha illaa huwal hayyul qoyyuum, laa ta’khudzuhuu sinatuw walaa naum. Lahuu maa fissamaawaati wa maa fil ardli man dzal ladzii yasyfa’u ‘indahuu illaa biidznih, ya’lamu maa baina aidiihim wamaa kholfahum wa laa yuhiithuuna bisyai’im min ‘ilmihii illaa bimaa syaa’ wasi’a kursiyyuhus samaawaati wal ardlo walaa ya’uuduhuu hifdhuhumaa wahuwal ‘aliyyul ‘adhiim",
            "Subhanallah 33x\nAlhamdulillah 33x\nAllahuakbar 33x",
            "Qul huwallaahu ahad, Allaahus shomad, lam yalid wa lam yuulad, wa lam yakul lahu kufuwan ahad",
            "Qul a’uudzu birob-bil falaq, min syarri ma khalaq, wa min syarri ghasiqin idza waqab, wa min syarri n-naffaasaati fil ‘uqad, wa min syarri haasidin idzaa hasad",
            "Qul a’uudzu birab-bin naas, malikin naas, ilaahin naas, min syarril waswaasil khannaas, alladzii yuwaswisu fii shuduurin naas, minal jinnati wan naas"
    };

    private static String[] terjemahan = {
            "Aku memohon ampun kepada-Mu ya Allah, Dzat yang tiada sesembahan kecuali Dia. Yang Maha Hidup lagi Maha Berdiri Sendiri. Dan aku bertobat kepada-Nya",
            "Tiada Tuhan Selain Allah, , Dia adalah satu, tiada sekutu bagi-Nya, milik-Nya adlah kekuasaan dan bagi-Nya adalah pujian. Dan dia memiliki kekuasaan atas segala sesuatu",
            "Ya Allah, semoga engkau melindungiku dari api neraka",
            "Ya Allah, Engkau adalah Zat yang mempunyai kesejahteraan dan dari-Mu kesejahteraan itu kepada-Mu akan kembali lagi segala kesejahteraan itu. Ya Tuhan kami, hidupkanlah kamu dengan sejahtera. Masukkanlah kami kedalam surga kampung kesejahteraan. Engkaulah yang berkuasa memberi berkah yang banyak dan Engkaulah Yang Maha Tinggi, wahai Zat yang memiliki keagungan dan kemuliaan",
            "1.Dengan menyebut nama Allah Yang Maha Pemurah lagi Maha Penyayang\n2.Segala puji bagi Allah, Tuhan semesta alam\n3.Maha Pemurah lagi Maha Penyayang\n4.Yang menguasai di Hari Pembalasan\n5.Hanya Engkaulah yang kami sembah, dan hanya kepada Engkaulah kami meminta pertolongan\n6.Tunjukilah kami jalan yang lurus\n7.(yaitu) Jalan orang-orang yang telah Engkau beri nikmat kepada mereka bukan (jalan) mereka yang dimurkai dan bukan (pula jalan) mereka yang sesat",
            "Allah, tiada tuhan selain Dia. Yang Maha Hidup, Yang terus menerus mengurus (makhluk-Nya), tiada mengantuk dan tiada tidur. Milik-Nya apa yang ada di langit dan apa yang ada di bumi. Tiada ada yang dapat memberi syafaat di sisi-Nya tanpa izin-Nya. Dia mengetahui apa yang di hadapan mereka dan apa yang di belakang mereka, dan mereka tiada mengetahui sesuatu apa pun tentang ilmu-Nya melainkan apa yang Dia kehendaki. Kursi-Nya meliputi langit dan bumi. Dan Dia tiada merasa berat memelihara keduanya, dan Dia Maha Tinggi, Maha Besar",
            "Maha Suci Allah\nsegala puji bagi Allah\nAllah Maha Besar",
            "Dia-lah Allah, Yang Maha Esa, Allah adalah Tuhan yang bergantung kepada-Nya segala sesuatu. Dia tidak beranak dan tidak pula diperanakkan, dan tidak ada sesuatu pun yang setara dengan Dia",
            "Aku berlindung kepada Tuhan yang menguasai subuh, dari kejahatan makhluk-Nya, dan dari kejahatan malam apabila telah gelap gulita, dari kejahatan penyihir-penyihir yang meniup pada buhul-buhul, dan dari kejahatan orang yang dengki apabila ia dengki",
            "Aku berlindung kepada Tuhan manusia, Raja manusia, Ilah manusia, dari kejahatan (bisikan) setan yang biasa bersembunyi, yang membisikkan (kejahatan) ke dalam dada manusia, dari jin dan manusia"
    };

    public static ArrayList<Dzikir> getListData(){
        ArrayList<Dzikir> list =new ArrayList<>();
        for (int position=0; position < dzikirSholat.length; position++){
            Dzikir dzikir = new Dzikir();
            dzikir.setDzikir(dzikirSholat[position]);
            dzikir.setHurufArab(niatArab[position]);
            dzikir.setHurufLatin(niatLatin[position]);
            dzikir.setTerjemahan(terjemahan[position]);
            list.add(dzikir);
        }
        return list;
    }
}
