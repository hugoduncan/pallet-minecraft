(defproject pallet-minecraft "1.0.0-SNAPSHOT"
  :description "minecraft with pallet"
  :dependencies [[org.cloudhoist/pallet "0.6.6"]
                 [org.cloudhoist/pallet-crates-all "0.5.0"]
                 [org.jclouds.provider/serverlove-z1-man "1.2.1"]
                 [org.jclouds.provider/aws-ec2 "1.2.1"]
                 [org.jclouds.provider/aws-s3 "1.2.1"]
                 [org.jclouds/jclouds-core "1.2.1"]
                 [org.jclouds/jclouds-compute "1.2.1"]
                 [org.jclouds/jclouds-blobstore "1.2.1"]
                 [org.jclouds.driver/jclouds-log4j "1.2.1"]
                 [log4j/log4j "1.2.14"]]
  :dev-dependencies [[swank-clojure/swank-clojure "1.3.2"] ; swank
                     [org.cloudhoist/pallet-lein "0.4.1"]]
  :repositories {"sonatype"
                 "http://oss.sonatype.org/content/repositories/releases"
                 "sonatype-snapshots"
                 "http://oss.sonatype.org/content/repositories/snapshots"})
