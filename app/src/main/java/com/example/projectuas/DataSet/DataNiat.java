package com.example.projectuas.DataSet;

import com.example.projectuas.VariableData.Niat;

import java.util.ArrayList;

public class DataNiat {
    private static String[] niatSholat = {
            "Niat Sholat Rawatib Sebelum Subuh",
            "Niat Sholat Subuh",
            "Niat Sholat Rawatib Sebelum Dzuhur",
            "Niat Sholat Dzuhur",
            "Niat Sholat Rawatib Sesudah Dzuhur",
            "Niat Sholat Rawatib Sebelum Ashar",
            "Niat Sholat Ashar",
            "Niat Sholat Rawatib Sebelum Maghrib",
            "Niat Sholat Maghrib",
            "Niat Sholat Rawatib Sesudah Maghrib",
            "Niat Sholat Rawatib Sebelum Isya",
            "Niat Sholat Isya",
            "Niat Sholat Rawatib Sesudah Isya",
            "Niat Sholat Dhuha",
            "Niat Sholat Tahajud",
            "Niat Sholat Witir 1 Rakaat",
            "Niat Sholat Witir 3 Rakaat"
    };

    private static String[] niatArab = {
            "أَصَلَّى سُنَّةَ الصُّبْحِ رَكْعَتَيْنِ قَبْلِيَةً لِلَّهِ تَعَالَى",
            "اُصَلِّى فَرْضَ الصُّبْحِ رَكْعَتَيْنِ مُسْتَقْبِلَ الْقِبْلَةِ اَدَاءً ِللهِ تَعَالَى",
            "أَصَلَّى سُنَّةَ الظهرِ رَكْعَتَيْنِ (أَرْبَعَ رَكَعَاتٍ) قَبْلِيَةً لِلَّهِ تَعَالَى",
            "اُصَلِّى فَرْضَ الظُّهْرِاَرْبَعَ رَكَعَاتٍ مُسْتَقْبِلَ الْقِبْلَةِ اَدَاءً ِللهِ تَعَالَى",
            "أَصَلَّى سُنَّةَ الظُّهْرِ رَكْعَتَيْنِ بَعْدِيَةً لِلَّهِ تَعَالَى",
            "أَصَلَّى سُنَّةَ الْعَصْرِ أَرْبَعَ رَكَعَاتٍ قَبْلِيَةً لِلَّهِ تَعَالَى",
            "اُصَلِّى فَرْضَ الْعَصْرِاَرْبَعَ رَكَعَاتٍ مُسْتَقْبِلَ الْقِبْلَةِ اَدَاءً ِللهِ تَعَالَى",
            "أَصَلَّى سُنَّةَ المَغْرِبِ رَكْعَتَيْنِ قَبْلِيَةً لِلَّهِ تَعَالَى",
            "اُصَلِّى فَرْضَ الْمَغْرِبِ ثَلاَثَ رَكَعَاتٍ مُسْتَقْبِلَ الْقِبْلَةِ اَدَاءً ِللهِ تَعَالَى",
            "أَصَلَّى سُنَّةَ المَغْرِبِ رَكْعَتَيْنِ بَعْدِيَةً لِلَّهِ تَعَالَى",
            "أَصَلَّى سُنَّةَ الْعِشَاءِ رَكْعَتَيْن قَبْلِيَةً لِلَّهِ تَعَالَى",
            "اُصَلِّى فَرْضَ الْعِشَاءِ اَرْبَعَ رَكَعَاتٍ مُسْتَقْبِلَ الْقِبْلَةِ اَدَاءً ِللهِ تَعَالَى",
            "أَصَلَّى سُنَّةَ الْعِشَاءِ رَكْعَتَيْن بَعْدِيَهً لِلَّهِ تَعَالَى",
            "اُصَلِّى سُنَّةَ الضَّحٰى رَكْعَتَيْنِ مُسْتَقْبِلَ الْقِبْلَةِ اَدَاءً ِللهِ تَعَالَى",
            "اُصَلِّى سُنَّةً التَّهَجُّدِ رَكْعَتَيْنِ مُسْتَقْبِلَ الْقِبْلَةِ ِللهِ تَعَالَى",
            "اُصَلِّى سُنَّةَ الوِتْرِ رَكْعَةً مُسْتَقْبِلَ الْقِبْلَةِ أَدَاءً لِلهِ تَعَالَ",
            "اُصَلِّى سُنَّةَ الْوِتْرِ ثَلَاثَ رَكْعَاتٍ مُسْتَقْبِلَ الْقِبْلَةِ أَدَاءً لِلهِ تَعَالَى"
    };

    private static String[] niatLatin = {
            "Ushalli sunnatash shubhi rak'ataini qabliyatan lillaahi ta'aala",
            "Ushalli fardhosh shubhi rok'ataini mustaqbilal qiblati adaa-an lillaahi ta'aala",
            "Ushalli sunnatadzh dzhuhri rak'ataini (arba'a raka'aatin) qabliyatan lillaahi ta'aala",
            "Ushalli fardhodl dhuhri arba'a raka'aatim mustaqbilal qiblati adaa-an lillaahi ta'aala",
            "Ushalli sunnatadzh dzhuhri rak'ataini ba'diyatan lillahi ta'aala",
            "Ushalli sunnatal 'ashri arba'a rakaatin qabliyatan lillaahi ta'aala",
            "Ushalli fardhol 'ashri arba'a raka'aatim mustaqbilal qiblati adaa-an lillaahi ta'aala",
            "Ushalli sunnatal maghribi rak'ataini qabliyatan lillaahi ta'aala",
            "Ushalli fardhol maghribi tsalaata raka'aatim mustaqbilal qiblati adaa-an lillaahi ta'aala",
            "Ushalli sunnatal maghribi rak'ataini ba'diyatan lillaahi ta'aala",
            "Ushalli sunnatal isyaa'i rak'ataini qabliyatan lillaahi ta'aala",
            "Ushalli fardhol 'isyaa-i arba'a raka'aatim mustaqbilal qiblati adaa-an lillaahi ta'aala",
            "Ushalli sunnatal isyaa'i rak'ataini ba'diyatan lillaahi ta'aala",
            "Ushalli sunnatadh Dhuhaa rak'ataini lillaahi ta'aalaa",
            "Ushallii sunnata-t-tahajjudi rak’ataini mustaqbilal qiblati lillahi ta’alla",
            "Ushalli sunnatal witri rak'atan mustaqbilal qiblati adā'an lillāhi ta'ālā",
            "Ushalli sunnatal witri tsalâtsa raka'âtin mustaqbilal qiblati adâ'an lillâhi ta'âlâ"
    };

    private static String[] terjemahan = {
            "Aku niat mengerjakan sholat sunnah dua rakaat sebelum Subuh karena Allah Ta'ala",
            "Aku berniat shalat fardhu Shubuh dua raka'at menghadap kiblat karena Allah Ta'ala",
            "Aku niat mengerjakan sholat sunnah dua rakaat (atau empat rakaat) sebelum Dzuhur karena Allah Ta'ala",
            "Aku berniat shalat fardhu Dzuhur empat raka'at menghadap kiblat karena Allah Ta'ala",
            "Aku niat mengerjakan sholat sunnah dua rakaat setelah Dzuhur karena Allah Ta'ala",
            "Aku niat mengerjakan sholat sunnah empat rakaat sebelum Ashar karena Allah Ta'ala",
            "Aku berniat shalat fardhu 'Ashar empat raka'at menghadap kiblat karena Allah Ta'ala",
            "Aku niat mengerjakan sholat sunnah dua rakaat sebelum Maghrib karena Allah Ta'ala",
            "Aku berniat shalat fardhu Maghrib tiga raka'at menghadap kiblat karena Allah Ta'ala",
            "Aku niat mengerjakan sholat sunnah dua rakaat sesudah Maghrib karena Allah Ta'ala",
            "Aku niat mengerjakan sholat sunnah dua rakaat sebelum Isya karena Allah Ta'ala",
            "Aku berniat shalat fardhu Isya empat raka'at menghadap kiblat karena Allah Ta'ala",
            "Aku niat mengerjakan sholat sunnah dua rakaat sesudah Isya karena Allah Ta'ala",
            "Aku niat sholat sunah Dhuha dua rakaat karena Allah ta'ala",
            "Aku niat shalat sunah tahajud dua rakaat, menghadap kiblat, karena Allah Ta’ala",
            "Aku niat salat sunnah witir satu rakaat karena Allah ta'ala",
            "Aku menyengaja salat sunnah salat witir tiga rakaat dengan menghadap kiblat karena Allah Ta'ala"
    };

    public static ArrayList<Niat> getListData(){
        ArrayList<Niat> list =new ArrayList<>();
        for (int position=0; position < niatSholat.length; position++){
            Niat niat = new Niat();
            niat.setNiatSholat(niatSholat[position]);
            niat.setHurufArab(niatArab[position]);
            niat.setHurufLatin(niatLatin[position]);
            niat.setTerjemahan(terjemahan[position]);
            list.add(niat);
        }
        return list;
    }
}
