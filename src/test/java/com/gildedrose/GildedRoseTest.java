package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void updateQuality() {

        CombinationApprovals.verifyAllCombinations(
        this::doUpdateQuality,
        new String[]{"foo", "Aged Brie","Backstage passes to a TAFKAL80ETC concert","Sulfuras, Hand of Ragnaros","Conjured Mana Cake"},
                new Integer[] {-1, 0, 2, 6, 11},
                new Integer[] {0, 1, 49, 50});
    }

    private String doUpdateQuality(String name, int sellIn, int quality) {
        Item[] items = new Item[] {Item.createItem(name, sellIn, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app.items[0].toString();
    }

}
