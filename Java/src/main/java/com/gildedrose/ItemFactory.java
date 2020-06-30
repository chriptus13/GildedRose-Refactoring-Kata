package com.gildedrose;

public class ItemFactory {
    static ItemWrapper fromItem(Item item) {
        String name = item.name;
        int sellIn = item.sellIn, quality = item.quality;
        switch (name) {
            case BrieItem.NAME:
                return new BrieItem(sellIn, quality);
            case BackstageItem.NAME:
                return new BackstageItem(sellIn, quality);
            case RagnarosItem.NAME:
                return new RagnarosItem(sellIn, quality);
            default:
                return new DefaultItem(name, sellIn, quality);
        }
    }
}
