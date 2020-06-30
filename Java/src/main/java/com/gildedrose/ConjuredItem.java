package com.gildedrose;

class ConjuredItem extends ItemWrapper {
    static final String NAME = "Conjured Mana Cake";

    ConjuredItem(int sellIn, int quality) {
        super(NAME, sellIn, quality);
    }

    @Override
    ItemWrapper updateQuality() {
        int newSellIn = sellIn - 1;
        int newQuality;
        if (quality <= 0) newQuality = quality;
        else if (quality == 1) newQuality = quality - 1;
        else newQuality = quality - (newSellIn < 0 ? 4 : 2);
        return new DefaultItem(name, newSellIn, newQuality);
    }
}
