package com.gildedrose;

class RagnarosItem extends ItemWrapper {
    static final String NAME = "Sulfuras, Hand of Ragnaros";

    RagnarosItem(Item item) {
        super(item);
    }

    @Override
    void updateQuality() {
        // nothing
    }
}
