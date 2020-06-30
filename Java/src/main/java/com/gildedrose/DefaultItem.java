package com.gildedrose;

class DefaultItem extends ItemWrapper {
    DefaultItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    ItemWrapper updateQuality() {
        int newSellIn = sellIn - 1;
        int newQuality;
        if (quality <= 0) newQuality = quality;
        else if (quality == 1) newQuality = quality - 1;
        else newQuality = quality - (newSellIn < 0 ? 2 : 1);
        return new DefaultItem(name, newSellIn, newQuality);
    }
}
