(ns bcrypt-clj.auth
  (:import [org.mindrot.jbcrypt BCrypt]))

(defn generate-salt
  "generate salt"
  []
  (BCrypt/gensalt))

(defn crypt-password
  "crypt password with some salt"
  [password]
  (BCrypt/hashpw password (generate-salt)))

(defn check-password
  "validate password"
  [plaintext hashed]
  (BCrypt/checkpw plaintext hashed))
