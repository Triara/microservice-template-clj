(ns microservice-template-clj.server
	(:require [compojure.core :refer :all]
			  [compojure.route :as route]
			  [ring.middleware.defaults :refer [wrap-defaults api-defaults]]))


(defroutes app-routes
		   (GET "/heartbeat" [] "I'm alive" {:status 200})
		   (route/not-found "Not Found, sorry"))

(def app
	(wrap-defaults app-routes api-defaults))
