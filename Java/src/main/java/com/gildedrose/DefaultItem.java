package com.gildedrose;

class DefaultItem extends ItemWrapper {
    DefaultItem(Item item) {
        super(item);
    }

    @Override
    void updateQuality() {
        if (item.quality > 0) {
            --item.quality;
        }
        --item.sellIn;
        if (item.sellIn < 0 && item.quality > 0) {
            --item.quality;
        }
    }
}
