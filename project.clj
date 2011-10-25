(defproject pallet-minecraft "1.0.0-SNAPSHOT"
  :description "minecraft with pallet"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [org.cloudhoist/pallet "0.6.4"]
                 [org.cloudhoist/pallet-crates-all "0.5.0"]
                 [org.cloudhoist/stevedore "0.7.0"]
                 [org.cloudhoist/java "0.5.1"]
                 [org.jclouds/jclouds-all "1.0.0"]
                 [org.jclouds.driver/jclouds-jsch "1.0.0"]
                 [org.jclouds.driver/jclouds-log4j "1.0.0"]
                 [log4j/log4j "1.2.14"]]
  :repositories {"sonatype"
                 "http://oss.sonatype.org/content/repositories/releases"
                 "sonatype-snapshots"
                 "http://oss.sonatype.org/content/repositories/snapshots"}
  :dev-dependencies [[swank-clojure/swank-clojure "1.3.2"] ; swank
                     [org.cloudhoist/pallet-lein "0.4.1"]])
