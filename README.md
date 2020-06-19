# Intro

This is a sample app which attempts to reproduce DocumentDB connection problems in Cloud Foundry (CF).

# Preconditions
* Java 11
* CF CLI
* You are logged in to a CF test organisation / space

# Preperations

1) Create a document db service:
`cf create-service aws_documentdb small test-document-db`

2) Build and deploy the first app:
`./deploy-1.sh`

3) Build and deploy the second app:
`./deploy-1.sh`

4) Unbind the document db service from the second app:
`cf unbind-service test-app2 test-document-db`