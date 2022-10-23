package com.vocallookup.helper;

public class TripleStrings {
    
    private final String stringSimple;
    private final String stringMore;
    private final String stringDetailed;
    
    public TripleStrings (String stringOne, String stringTwo, String stringThree) {
       this.stringSimple = stringOne;
       this.stringMore = stringTwo;
       this.stringDetailed = stringThree;
    }

    public String getSimple() {
       return stringSimple;
    }
    
    public String getMore() {
       return stringMore;
    }

    public String getDetailed() {
       return stringDetailed;
    } 
}    