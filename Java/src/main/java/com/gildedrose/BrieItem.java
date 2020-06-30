package com.gildedrose;

class BrieItem extends ItemWrapper {
    static final String NAME = "Aged Brie";

    BrieItem(Item item) {
        super(item);
    }

    @Override
    void updateQuality() {
        if (item.quality < 50) {
            ++item.quality;
        }
        --item.sellIn;
        if (item.sellIn < 0 && item.quality < 50) {
            ++item.quality;
        }
    }
}
