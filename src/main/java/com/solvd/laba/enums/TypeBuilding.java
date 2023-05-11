package com.solvd.laba.enums;

public enum TypeBuilding {
    CLASSIC {
        public String getValue() {
            return "CLASSIC";
        }
    },
    MODERN {
        public String getValue() {
            return "MODERN";
        }
    };


    public abstract String getValue();


}
