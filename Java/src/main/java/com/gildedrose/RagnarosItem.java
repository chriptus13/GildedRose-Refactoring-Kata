package com.gildedrose;

class RagnarosItem extends ItemWrapper {
    static final String NAME = "Sulfuras, Hand of Ragnaros";

    RagnarosItem(int sellIn, int quality) {
        super(NAME, sellIn, quality);
    }

    @Override
    ItemWrapper updateQuality() {
        return new RagnarosItem(sellIn, quality);
    }
}
