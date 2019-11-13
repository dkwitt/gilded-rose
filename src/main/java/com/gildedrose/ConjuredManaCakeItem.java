package com.gildedrose;

public class ConjuredManaCakeItem extends Item {
    ConjuredManaCakeItem(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }

    @Override
    protected void doUpdateQuality() {

        sellIn = sellIn - 1;

        if (sellIn > 0) {
            if (quality >= 2) {
                quality -= 2;
            } else {
                quality = 0;
            }
        }else {
            if (quality > 4) {
                quality -= 4;
            } else {
                quality = 0;
            }
        }

    }
}
