; Copyright (C) 2013, 2014, 2015 Dr. Thomas Schank  (DrTom@schank.ch, Thomas.Schank@algocon.ch)
; Licensed under the terms of the GNU Affero General Public License v3.
; See the "LICENSE.txt" file provided with this software.

(defproject cider-ci_storage "2.2.0"
  :description "Cider-CI Storage"
  :license {:name "GNU AFFERO GENERAL PUBLIC LICENSE Version 3"
            :url "http://www.gnu.org/licenses/agpl-3.0.html"}
  :dependencies [
                 [cider-ci/clj-auth "2.2.2"]
                 [cider-ci/clj-utils "2.12.0"]
                 [drtom/honeysql "1.1.0"]
                 [me.raynes/fs "1.4.6"]
                 [org.clojure/tools.nrepl "0.2.8"]
                 ]
  :profiles {:dev 
             {:dependencies [[midje "1.6.3"]]
              :plugins [[lein-midje "3.1.1"]]
              :repositories [["tmp" {:url "http://maven-repo-tmp.drtom.ch" :snapshots false}]]} }
  :resource-paths ["./config" "../config" "./resources"]
  :aot [cider-ci.storage.main] 
  :main cider-ci.storage.main 
  :repositories [["tmp" {:url "http://maven-repo-tmp.drtom.ch" :snapshots false}]]
  :jvm-opts ["-Xmx128m"]
  )
