(ns bcrypt-clj.auth-test
  (:require [clojure.test :refer :all]
            [bcrypt-clj.auth :refer :all]))

(deftest auth
  (testing "generate salt"
    (println (str "salt -> " (generate-salt))))
  (testing "crypt password"
    (println (str "crypted password -> " (crypt-password "cleantha"))))
  (testing "this password should be valid"
    (is (true? (check-password "cleantha" "$2a$10$RmWjnuJmtIRkDcR/X04ome/e8//f./MUHCuKJeGlDHnpcjFUjoaxS"))))
  (testing "this password should not be valid"
    (is (false? (check-password "clea" "$2a$10$RmWjnuJmtIRkDcR/X04ome/e8//f./MUHCuKJeGlDHnpcjFUjoaxS")))))

