package org.example.enumerators;

public enum ShoesSize {
    SIZE_39 (39),
    SIZE_40 (40),
    SIZE_41 (41),
    SIZE_42 (42),
    SIZE_43 (43),
    SIZE_44 (44),
    SIZE_45 (45),
    SIZE_46 (46);

    final int sizeIndicator;

    ShoesSize(int sizeIndicator) {
        this.sizeIndicator = sizeIndicator;
    }

    public int getSizeIndicator() {
        return sizeIndicator;
    }
}
