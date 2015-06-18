(defproject dirty "0.1.0-SNAPSHOT"

  :description "Quick-and-dirty conversions between EDN and XML"

  :url "https://github.com/conan/dirty-xml"

  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.7.0-RC2"]
                 [org.clojure/data.xml "0.0.8"]]

  :profiles {:dev {:dependencies [[midje "1.7.0-beta1"]]
                   :plugins      [[lein-midje "3.1.3"]]}})
