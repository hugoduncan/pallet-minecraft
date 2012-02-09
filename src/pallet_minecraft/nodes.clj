(ns pallet-minecraft.nodes
  (:require
   [pallet.core :as core]
   [pallet.phase :as phase]
   [pallet-minecraft.crates :as crates]))

(def minecraft
  (pallet.core/group-spec
    "minecraft-group"
    :phases {:bootstrap (phase/phase-fn
                         (crates/bootstrap))
             :install (phase/phase-fn
                       (crates/install-minecraft))
             :start (phase/phase-fn
                     (crates/start-minecraft))
             :stop (phase/phase-fn
                    (crates/stop-minecraft))}
    :node-spec (pallet.core/node-spec
                :network {:inbound-ports [22 25565]})))
