package com.prayer.api.scraper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScraperTest {

    private final Scraper scraper = new Scraper(9);

    @BeforeEach
    void setUp() {
        scraper.startConnection();
    }

    @Test
    void startConnection() {
        assertThat(scraper.startConnection()).isTrue();
    }

    @Test
    void getPrayerHtmlTable() {
        assertThat(scraper.getPrayerHtmlTable()).isNotEmpty();
    }

    @Test
    void getCurrentPrayer() {}
}