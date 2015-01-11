(defproject microservice-template-clj "Microservice clj"
    :description "Basic server with a heartbeat and speclj integration"
    :min-lein-version "2.0.0"
    :license {:name "MIT"}
    :dependencies [[org.clojure/clojure "1.6.0"]
                  [compojure "1.3.1"]
                  [ring/ring-defaults "0.1.2"]]
    :profiles {:dev {:dependencies [[speclj "3.1.0"]
                                   [javax.servlet/servlet-api "2.5"]
                                   [ring-mock "0.1.5"]]}}
    :plugins [[speclj "3.1.0"]
             [lein-ring "0.8.13"]]
    :test-paths ["spec"])
