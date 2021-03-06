(defproject mike/bidi-and-yada "0.0.1-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.taoensso/timbre "4.8.0"]
                 [com.stuartsierra/component "0.3.2"]
                 [aleph "0.4.3"]
                 [yada "1.2.1"]
                 [bidi "2.0.16"]]
  :source-paths ["src/clj"]
  :test-paths ["test/clj"]
  :profiles {:uberjar {:aot :all
                       :main example.main}
             :dev {:source-paths ["dev"]
                   :target-path "target/dev"
                   :dependencies [[org.clojure/tools.namespace "0.2.11"]
                                  [clj-http "3.4.1"]
                                  [org.clojure/data.json "0.2.6"]]}}
  :repl-options {:init-ns user})
