package test.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;


@RestController
public class testController {

    @GetMapping("/1")
    public Mono<String> test1(){
        return Mono.just("hello");
    }

    @GetMapping(value = "/2",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> test2(){
        return Flux.fromStream(IntStream.rangeClosed(1, 5).mapToObj(i -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "data--->" + i ;
        }));
    }


}
