(ns hello.core
  (:require [ring.util.response :as res]))

(defn handler [request]
  (res/content-type (res/response {:message "Hello World!"}) "text/plain"))
