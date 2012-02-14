(defproject pallet-minecraft "1.0.0-SNAPSHOT"
  :description "minecraft with pallet"
  :dependencies [[org.clojure/clojure "1.3.0-lc"]
                 [org.cloudhoist/pallet "0.7.0-SNAPSHOT"]
                 [org.cloudhoist/pallet-jclouds "1.4.0-SNAPSHOT"]
                 [org.cloudhoist/pallet-vmfest "0.2.0-SNAPSHOT"]
                 [org.cloudhoist/java "0.5.1"]
                 [org.slf4j/slf4j-api "1.6.1"]
                 [ch.qos.logback/logback-core "1.0.0"]
                 [ch.qos.logback/logback-classic "1.0.0"]
                 [org.jclouds.provider/aws-ec2 "1.4.0-rc.1"]
                 [org.jclouds.driver/jclouds-slf4j "1.4.0-rc.1"]
                 [org.jclouds.driver/jclouds-jsch "1.4.0-rc.1"]]
  :dev-dependencies [[org.cloudhoist/pallet-lein "0.4.1"]]
  :repositories {"sonatype"
                 "http://oss.sonatype.org/content/repositories/releases"
                 "sonatype-snapshots"
                 "http://oss.sonatype.org/content/repositories/snapshots"})
