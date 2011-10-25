(ns pallet-minecraft.crates
  (:require
   [pallet.stevedore :as stevedore]
   [pallet.script :as script]
   [pallet.action.exec-script :as exec-script]
   [pallet.crate.automated-admin-user :as automated-admin-user]
   [pallet.action.remote-file :as remote-file]
   [pallet.crate.java :as java]
   [pallet.action.directory :as directory]
   [pallet.action.user :as user]))

(defn bootstrap
  [req]
  ( -> req
       (automated-admin-user/automated-admin-user)
       (java/java :openjdk)))

(script/defscript downloadminecraft []) 
(pallet.stevedore/defimpl downloadminecraft :default [& args] 
  (wget "https://s3.amazonaws.com/MinecraftDownload/launcher/minecraft_server.jar")) 

(def minecraft-path "/opt/minecraft")

(defn install-minecraft
  [req]
  (-> req
      (directory/directory                     
       minecraft-path                           
       :mode "0770" :owner "root" :group "root")
      (remote-file/remote-file (str minecraft-path "/"  "minecraft_server.jar")
                               :url "https://s3.amazonaws.com/MinecraftDownload/launcher/minecraft_server.jar")
      ))

(defn start-minecraft
  [req]
  (-> req
      (exec-script/exec-script
       (do
         (cd ~minecraft-path)
         (nohup java -jar minecraft_server.jar &)))))
