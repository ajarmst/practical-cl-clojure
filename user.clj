(println "custom settings loaded...")
(. clojure.lang.RT (loadResourceScript "clojure/contrib/lib/lib.clj"))
(clojure.contrib.lib/use '(clojure.contrib test-is))
(defn f [test] (load-file test) (run-tests))