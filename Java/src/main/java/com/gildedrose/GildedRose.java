package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case "Aged Brie":
                    updateBrieItem(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    updateBackstageItem(item);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    break;
                default:
                    updateDefaultItem(item);
            }
        }
    }

    private static void updateBrieItem(Item item) {
        if (item.quality < 50) {
            ++item.quality;
        }
        --item.sellIn;
        if (item.sellIn < 0 && item.quality < 50) {
            ++item.quality;
        }
    }

    private static void updateBackstageItem(Item item) {
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

    private static void updateDefaultItem(Item item) {
        if (item.quality > 0) {
            --item.quality;
        }
        --item.sellIn;
        if (item.sellIn < 0 && item.quality > 0) {
            --item.quality;
        }
    }
}