package com.day.javasample.future;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.String.format;

@Slf4j
public class FutureTest {

    final static AtomicInteger counter = new AtomicInteger(1);

    @Test
    @SneakyThrows
    void test() {

        final long start = System.currentTimeMillis();

        final ExecutorService executorService = Executors.newFixedThreadPool(2);

        final Future<String> fResp01 = executorService.submit(() -> sendRequestWithDelay(5000));
        final Future<String> fResp02 = executorService.submit(() -> sendRequestWithDelay(2000));

        log.info("r1='{}'; r2='{}'; usedMs={}", fResp01.get(), fResp02.get(), System.currentTimeMillis() - start);
    }

    private String sendRequestWithDelay(int ms) throws InterruptedException {
        Thread.sleep(ms); //imagine a real outgoing call that has a response time of <ms>
        return format("Response with delay of %d ms and received with sequence %d", ms, counter.getAndIncrement());
    }
}
