package com.gildedrose;

import java.util.stream.Stream;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        items = Stream.of(items)
                .map(ItemFactory::fromItem)
                .map(ItemWrapper::updateQuality)
                .map(ItemWrapper::toItem)
                .toArray(Item[]::new);
    }
}