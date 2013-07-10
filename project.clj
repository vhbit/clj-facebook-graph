(defproject clj-facebook-graph "0.4.1-SNAPSHOT"
  :description "A Clojure client for the Facebook Graph API."
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/data.json "0.2.2"]
                 [ring/ring-core "1.2.0"]
                 [clj-http "0.7.4"]
                 [clj-oauth2 "0.2.0"]]
  :profiles {:dev {:dependencies [[ring/ring-devel "1.2.0"]
                                 [ring/ring-jetty-adapter "1.2.0"]
                                 [compojure "1.1.5"]]}}
  :aot [clj-facebook-graph.FacebookGraphException])
