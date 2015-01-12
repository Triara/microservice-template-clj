# Microservice template (clojure)


Simple server with a heartbeat route.

To run the server on default port (3000) use

`lein ring server`



The used routing library is [Compojure](https://github.com/weavejester/compojure).

[Speclj](http://speclj.com/) is used as BDD framework, so use `lein spec` to run tests.
