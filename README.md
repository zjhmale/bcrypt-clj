# bcrypt-clj

a lightweight clojure wrapper for bcrypt that can crypt password or something like that

## Usage

* crypt password

```
(crypt-password "password")
```

* checkout validation of password

```
(check-password "rawpassword" "cryptedpassword")
```

## License

Copyright © 2015 jihui

Distributed under the Eclipse Public License, the same as Clojure.
