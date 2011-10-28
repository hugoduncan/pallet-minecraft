(ns pallet-minecraft.nodes
  (:require
   [pallet.core :as core]
   [pallet.resource :as resource]
   [pallet-minecraft.crates :as crates]))

(def minecraft
  (pallet.core/group-spec
    "minecraft"
    :phases {:bootstrap (resource/phase
                         (crates/bootstrap))
             :install (resource/phase
                       (crates/install-minecraft))
             :start (resource/phase
                     (crates/start-minecraft))
             :stop (resource/phase
                    (crates/stop-minecraft))}
    :node-spec (pallet.core/node-spec
                :image {:os-family :ubuntu :os-version-matches "10.10"}
                :hardware {:min-cores 2 :min-ram 1024}
                :network {:inbound-ports [22 25565]})))
