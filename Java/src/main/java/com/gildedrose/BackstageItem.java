package com.gildedrose;

class BackstageItem extends ItemWrapper {
    static final String NAME = "Backstage passes to a TAFKAL80ETC concert";

    BackstageItem(Item item) {
        super(item);
    }

    @Override
    void updateQuality() {
        if (item.quality < 50) {
            ++item.quality;
            if (item.sellIn < 11 && item.quality < 50) {
                ++item.quality;
            }

            if (item.sellIn < 6 && item.quality < 50) {
                ++item.quality;
            }
        }
        --item.sellIn;
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
