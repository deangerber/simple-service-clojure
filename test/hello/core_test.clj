(ns hello.core-test
  (:require [clojure.test :as t]
            [ring.mock.request :as mock]
            [hello.core :as hc]))

(t/deftest core-handler-tests
  (t/testing "it returns a http result containing hello world"
    (t/is (= (hc/handler (mock/request :get "/"))
             {:status 200
              :headers {"Content-Type" "text/plain"}
              :body "Hello World!"}))))
