package com.esentri.documentdbclustertester;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class MongoTestScheduler {

  @Autowired
  private StuffRepository stuffRepository;

  private static final Logger log = LoggerFactory.getLogger(MongoTestScheduler.class);

  @Scheduled(fixedRate = 1000)
  public void ping() {
    List<Stuff> foundStuff = stuffRepository.findAll();
    log.info("Found {} stuff!", foundStuff.size());
  }

  @Scheduled(fixedDelay = 5000)
  public void createStuff() {
    Stuff newStuff = stuffRepository.save(new Stuff());
    log.info("created new stuff: {}", newStuff.getId());
  }

}
