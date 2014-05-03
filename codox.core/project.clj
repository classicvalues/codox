(defproject codox/codox.core "0.7.0-SNAPSHOT"
  :description "Generate documentation from Clojure source files"
  :url "https://github.com/weavejester/codox"
  :scm {:dir ".."}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.namespace "0.1.3"]
                 [org.clojure/clojurescript "0.0-2202"]
                 [hiccup "1.0.5"]])