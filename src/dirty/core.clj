(ns dirty.core
  (:require [clojure.data.xml :refer :all]))


(defn edn->xml
  [edn]
  (cond
    (sequential? edn) (do (println "foring seq: " edn)
                          (for [n edn]
                            (do (println "seq" n)
                                (edn->xml n))))
    (map? edn) (do (println "foring map: " edn)
                   (for [n edn]
                     (do (println "map tag: " (first n) " content: " (second n))
                         (element (first n) nil (edn->xml (second n))))))
    :default (do (println "value: " edn " type: " (type edn))
                 edn)))


(defn xml->str
  [data]
  (emit-str data))