(defproject pallet-minecraft "1.0.0-SNAPSHOT"
  :description "minecraft with pallet"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [org.cloudhoist/pallet "0.6.4"]
                 [org.jclouds/jclouds-all "1.0.0"]
                 [org.jclouds.driver/jclouds-jsch "1.0.0"]
                 [org.jclouds.driver/jclouds-log4j "1.0.0"]
                 [log4j/log4j "1.2.14"]
                 [org.cloudhoist/stevedore "0.7.0"]
                 [org.cloudhoist/automated-admin-user "0.5.0" ]]
  :dev-dependencies [[swank-clojure/swank-clojure "1.3.2"] ; swank
                     [org.cloudhoist/pallet-lein "0.4.1"]] ; lein
  :repositories
  {"sonatype" "http://oss.sonatype.org/content/repositories/releases"
   "sourcesense" "https://nexus.sourcesense.com/nexus/content/groups/public"})
