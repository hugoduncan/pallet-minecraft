(ns pallet-minecraft.nodes
  (:require
   [pallet.core :as core]
   [pallet.resource :as resource]
   [pallet-minecraft.crates :as crates]))

(core/defnode minecraft
  "A minecraft node"
  {:inbound-ports [25565 22]} ;; 25565 for minecraft, 22 for SSH
  :bootstrap (resource/phase
              (crates/bootstrap))
  :install (resource/phase
          (crates/install-minecraft))
  :start (resource/phase
          (crates/start-minecraft)))
