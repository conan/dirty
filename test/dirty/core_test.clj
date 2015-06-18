(ns dirty.core-test
  (:require [dirty.core :refer :all]
            [midje.sweet :refer :all]))

(fact "edn->xml"
  (let [edn {:root {:seq         ["val" :val]
                    :seq-of-maps [{:key1 "val1"} {:key2 "val2"}]
                    :seq-of-seqs [[:a :b :c] ["d" "e" "f"]]
                    :map         {:key1  "val1"
                                  "key2" :val2
                                  3      3}
                    :str         "str"
                    :int         1}}
        xml (slurp "test-resources/test.xml")]
    (-> edn edn->xml xml->str) => xml))
