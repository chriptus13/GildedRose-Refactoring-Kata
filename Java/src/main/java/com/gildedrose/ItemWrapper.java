package com.gildedrose;

abstract class ItemWrapper {
    protected final Item item;

    ItemWrapper(Item item) {
        this.item = item;
    }

    abstract void updateQuality();

    static ItemWrapper fromItem(Item item) {
        switch (item.name) {
            case BrieItem.NAME:
                return new BrieItem(item);
            case BackstageItem.NAME:
                return new BackstageItem(item);
            case RagnarosItem.NAME:
                return new RagnarosItem(item);
            default:
                return new DefaultItem(item);
        }
    }
}
