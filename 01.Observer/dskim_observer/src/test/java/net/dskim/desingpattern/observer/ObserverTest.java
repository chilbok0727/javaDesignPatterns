package net.dskim.desingpattern.observer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ObserverTest {

    @Test
    public void whenChangingPCLNewsAgencyState_thenONewsChannelNotified() {

        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addPropertyChangeListener(observer);
        observable.setNews("news");

        log.info("observer.getNews()={}", observer.getNews());
        assertEquals(observer.getNews(), "news");
    }
}
