(ns pallet-minecraft.crates
  (:require
   [pallet.stevedore :as stevedore]
   [pallet.crate.automated-admin-user :as automated-admin-user]))

(defn bootstrap
  [req]
  (automated-admin-user/automated-admin-user req))
