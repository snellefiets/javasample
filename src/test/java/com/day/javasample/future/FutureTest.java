package com.day.javasample.future;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class FutureTest {

    final static AtomicInteger counter = new AtomicInteger(1);

    @Test
    @SneakyThrows
    void test() {

        final long start = System.currentTimeMillis();

        final ExecutorService executorService = Executors.newFixedThreadPool(2);

        final Future<String> fResponse01 = executorService.submit(() -> sendRequestWithDelay(5000));
        final Future<String> fResponse02 = executorService.submit(() -> sendRequestWithDelay(2000));

        log.info("r1='{}'; r2='{}'; totalMs={}", fResponse01.get(), fResponse02.get(), System.currentTimeMillis() - start);
    }

    private String sendRequestWithDelay(int delayInMs) throws InterruptedException {
        Thread.sleep(delayInMs);
        return String.format("Response with delay of %d ms and received sequence %d", delayInMs, counter.getAndIncrement());
    }
}
