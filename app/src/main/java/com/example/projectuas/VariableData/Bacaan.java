package com.example.projectuas.VariableData;

public class Bacaan {
    private String bacaanSholat, hurufArab, hurufLatin, terjemahan;
    private boolean expandable;

    public String getBacaanSholat() {
        return bacaanSholat;
    }

    public void setBacaanSholat(String bacaanSholat) {
        this.bacaanSholat = bacaanSholat;
    }

    public String getHurufArab() {
        return hurufArab;
    }

    public void setHurufArab(String hurufArab) {
        this.hurufArab = hurufArab;
    }

    public String getHurufLatin() {
        return hurufLatin;
    }

    public void setHurufLatin(String hurufLatin) {
        this.hurufLatin = hurufLatin;
    }

    public String getTerjemahan() {
        return terjemahan;
    }

    public void setTerjemahan(String terjemahan) {
        this.terjemahan = terjemahan;
    }

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }
}
