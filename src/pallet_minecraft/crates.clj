(ns pallet-minecraft.crates
  (:require
   [pallet.stevedore :as stevedore]
   [pallet.script :as script]
   [pallet.action.exec-script :as exec-script]
   [pallet.crate.automated-admin-user :as automated-admin-user]))

(defn bootstrap
  [req]
  (automated-admin-user/automated-admin-user req))

(script/defscript downloadminecraft []) 
(pallet.stevedore/defimpl downloadminecraft :default [& args] 
  (wget "https://s3.amazonaws.com/MinecraftDownload/launcher/minecraft_server.jar")) 

(defn stuff
  [req]
  (-> req
      (exec-script/exec-checked-script 
      "Downloads the minecraft jar" 
      (downloadminecraft)))
  )
