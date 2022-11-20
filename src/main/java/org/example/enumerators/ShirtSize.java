package org.example.enumerators;

public enum ShirtSize {
    EXTRA_SMALL ("XS"),
    SMALL ("S"),
    MEDIUM ("M"),
    LARGE ("L"),
    EXTRA_LARGE ("XL"),
    EXTRA2_LARGE ("2XL");

    final String sizeIndicator;

    ShirtSize(String sizeIndicator) {
        this.sizeIndicator = sizeIndicator;
    }

    public String getSizeIndicator() {
        return sizeIndicator;
    }
}
