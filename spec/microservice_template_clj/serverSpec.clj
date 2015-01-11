(ns microservice-template-clj.serverSpec
    (:require [speclj.core :refer :all]
              [microservice-template-clj.server :refer :all]
              [ring.mock.request :as mock]))

(describe "Server to hold a microservice basic baheviour"
    (it "Server has a heartbeat"
        (let [response (app (mock/request :get "/heartbeat"))]
            (should= 200 (:status response)))))
