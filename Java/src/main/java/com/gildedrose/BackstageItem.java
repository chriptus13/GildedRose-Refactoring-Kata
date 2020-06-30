package com.gildedrose;

class BackstageItem extends ItemWrapper {
    static final String NAME = "Backstage passes to a TAFKAL80ETC concert";

    BackstageItem(int sellIn, int quality) {
        super(NAME, sellIn, quality);
    }

    @Override
    ItemWrapper updateQuality() {
        int newSellIn = sellIn - 1;
        int newQuality;
        if (newSellIn < 0) newQuality = 0;
        else if (quality >= 50) newQuality = quality;
        else if (quality == 49) newQuality = quality + 1;
        else if (quality == 48) newQuality = quality + (sellIn < 11 ? 2 : 1);
        else newQuality = quality + (sellIn < 6 ? 3 : (sellIn < 11 ? 2 : 1));
        return new BackstageItem(newSellIn, newQuality);
    }
}
