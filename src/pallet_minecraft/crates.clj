(ns pallet-minecraft.crates
  (:use
   [pallet.action.exec-script :only [exec-script]]
   [pallet.action.remote-file :only [remote-file]]
   [pallet.action.directory :only [directory]]
   [pallet.crate.automated-admin-user :only [automated-admin-user]]
   [pallet.crate.java :only [java]]))

(defn bootstrap
  [req]
  (-> req
       (automated-admin-user)
       (java)))

(def minecraft-path "/opt/minecraft")

(defn install-minecraft
  [req]
  (-> req
      (directory                     
       minecraft-path                           
       :mode "0770" :owner "root" :group "root")
      (remote-file (str minecraft-path "/" "minecraft_server.jar")
                               :url "https://s3.amazonaws.com/MinecraftDownload/launcher/minecraft_server.jar")))

(defn start-minecraft
  [req]
  (-> req
      (exec-script
       (do
         (cd ~minecraft-path)
         (nohup java -Xmx256m -Xms256m -jar minecraft_server.jar &)))))

(defn stop-minecraft
  [req]
  (-> req
   (exec-script
    (pkill -f minecraft))))
