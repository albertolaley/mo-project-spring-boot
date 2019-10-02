package com.albertorosario.springboot_microservices.counterservice.api;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RefreshScope
public class CounterController {
  private static AtomicLong count = new AtomicLong(0);
  private String prefixMessage;

  @GetMapping(path = "/count")
  public String getCount() {
    return prefixMessage + count.getAndIncrement();
  }
}
