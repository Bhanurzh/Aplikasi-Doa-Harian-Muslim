package com.example.projectuas.VariableData;

public class Niat {
    private String niatSholat, hurufArab, hurufLatin, terjemahan;

    private boolean expandable;

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    public String getNiatSholat() {
        return niatSholat;
    }

    public void setNiatSholat(String niatSholat) {
        this.niatSholat = niatSholat;
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
}
