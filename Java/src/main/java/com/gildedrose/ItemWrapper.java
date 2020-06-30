package com.gildedrose;

abstract class ItemWrapper {
    protected final String name;
    protected final int sellIn, quality;

    ItemWrapper(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    abstract ItemWrapper updateQuality();

    Item toItem() {
        return new Item(name, sellIn, quality);
    }
}
