package com.esentri.documentdbclustertester;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StuffRepository extends MongoRepository<Stuff, String> {

}
