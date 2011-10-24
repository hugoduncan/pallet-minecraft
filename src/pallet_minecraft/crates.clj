(ns pallet-minecraft.crates
  (:require
   [pallet.stevedore :as stevedore]
   [pallet.crate.atuomated-admin-user :as automated-admin-user]))

(defn bootstrap
  [req]
  (automated-admin-user/automated-admin-user))
