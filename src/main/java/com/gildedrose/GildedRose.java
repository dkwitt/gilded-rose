package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {

            /*
            jeżeli to jest conjured mana cake to{coś}
            w przeciwnym wypadku{reszta kodu}
           1. Once the sell by date has passed, Quality degrades twice as fast
2.The Quality of an item is never negative
“Conjured” items degrade in Quality twice as fast as normal items
             */
            if (items[i].name.equals("Conjured Mana Cake")) {
                if (items[i].sellIn > 0) {
                    if (items[i].quality >=2) {
                        items[i].quality -= 2;
                    } else{
                        if (items[i].quality == 1) {
                            items[i].quality -= 1;
                        }
                    }

                } else {
                    if (items[i].quality >= 4) {
                        items[i].quality -= 4;
                    } else {
                        if(items[i].quality == 3){
                            items[i].quality -=3;
                        }else if (items[i].quality == 2) {
                            items[i].quality -=2;
                        }else if (items[i].quality == 1) {
                            items[i].quality -=1;
                        }
                    }
                }
                items[i].sellIn = items[i].sellIn - 1;
            } else {


                if (!items[i].name.equals("Aged Brie")
                        && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (items[i].quality > 0) {
                        if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                            items[i].quality = items[i].quality - 1;
                        }
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;

                        if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                            if (items[i].sellIn < 11) {
                                if (items[i].quality < 50) {
                                    items[i].quality = items[i].quality + 1;
                                }
                            }

                            if (items[i].sellIn < 6) {
                                if (items[i].quality < 50) {
                                    items[i].quality = items[i].quality + 1;
                                }
                            }
                        }
                    }
                }

                if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                    items[i].sellIn = items[i].sellIn - 1;
                }

                if (items[i].sellIn < 0) {
                    if (!items[i].name.equals("Aged Brie")) {
                        if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                            if (items[i].quality > 0) {
                                if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                    items[i].quality = items[i].quality - 1;
                                }
                            }
                        } else {
                            items[i].quality = items[i].quality - items[i].quality;
                        }
                    } else {
                        if (items[i].quality < 50) {
                            items[i].quality = items[i].quality + 1;
                        }
                    }
                }
            }
        }
    }
}
