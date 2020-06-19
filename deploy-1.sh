#!/bin/bash
./mvnw clean package
cf push -f manifests/manifest-1.yml -p target/documentdb-cluster-tester-0.0.1-SNAPSHOT.jar
