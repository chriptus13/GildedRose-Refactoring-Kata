package com.gildedrose;

class BrieItem extends ItemWrapper {
    static final String NAME = "Aged Brie";

    BrieItem(int sellIn, int quality) {
        super(NAME, sellIn, quality);
    }

    @Override
    ItemWrapper updateQuality() {
        int newSellIn = sellIn - 1;
        int newQuality = quality + (quality >= 50 ? 0 : (quality == 49 || newSellIn >= 0 ? 1 : 2));
        return new BrieItem(newSellIn, newQuality);
    }
}
