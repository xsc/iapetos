nil (do (set! *warn-on-reflection* nil) (clojure.core/require (quote codox.main)) (codox.main/generate-docs (quote {:description "A Clojure Prometheus Client", :package iapetos/iapetos, :source-uri "https://github.com/xsc/iapetos/blob/v{version}/{filepath}#L{line}", :namespaces [iapetos.core #"^iapetos\.collector\..+"], :output-path "doc", :name "iapetos", :source-paths ("/git/github/iapetos/src"), :project {:name "iapetos"}, :root-path "/git/github/iapetos", :version "0.1.0-SNAPSHOT", :metadata {:doc/format :markdown}})))