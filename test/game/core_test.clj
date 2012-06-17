(ns game.core-test
  (:use clojure.test
        game.core
        clojure.repl
        clojure.reflect
        clojure.pprint
        clojure.java.javadoc))

(defn print-class
  [class]
  (print-table (:members (reflect class))))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))