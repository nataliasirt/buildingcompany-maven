package com.solvd.laba.enums;

public enum TypeBuilding {
    SMALL {
        public String getValue() {
            return "SMALL";
        }
    },
    MEDIUM {
        public String getValue() {
            return "MEDIUM";
        }
    },
    BIG {
        public String getValue() {
            return "BIG";
        }
    };

    public abstract String getValue();


}
