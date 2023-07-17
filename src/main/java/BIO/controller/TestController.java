package BIO.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

@RestController
public class TestController {
    @GetMapping(value = "/test",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> test(){
        return Flux.fromStream(IntStream.rangeClosed(1,5).mapToObj(i-> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return String.valueOf(i);
        }));
    }
}
