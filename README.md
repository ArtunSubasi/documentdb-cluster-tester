# Intro

This is a sample app which attempts to reproduce a connection problem as described in the MongoDB community forums:
https://developer.mongodb.com/community/forums/t/documentdb-cluster-invalidating-the-connection-pool-kills-connections-of-other-microservices/5235
The problem could not be reproduced.

# Preconditions

1) A DocumentDB is running in AWS
2) A EC2 instance is running in AWS which has incoming SSH connection enabled (this EC2 acts as a Bastion host)
3) The EC2 instance should be able access the DocumentDB

# Testing locally

1) Create an SSH tunnel to the EC2 instance
2) Insert the DocumentDB username and password to the application.yml
3) Start the app via DocumentdbClusterTesterApplication