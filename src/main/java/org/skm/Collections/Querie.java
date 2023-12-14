package org.skm.Collections;


public class Querie {
    String querieDesc;
    String querieVal;

    public Querie(String querieDesc, String querieVal) {
        this.querieDesc = querieDesc;
        this.querieVal = querieVal;
    }

    public String getQuerieDesc() {
        return querieDesc;
    }

    public void setQuerieDesc(String querieDesc) {
        this.querieDesc = querieDesc;
    }

    public String getQuerieVal() {
        return querieVal;
    }

    public void setQuerieVal(String querieVal) {
        this.querieVal = querieVal;
    }

    @Override
    public String toString() {
        return "Querie{" +
                "querieDesc='" + querieDesc + '\'' +
                ", querieVal='" + querieVal + '\'' +
                '}';
    }
}
