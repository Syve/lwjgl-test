(defn get-native-lib-path
  []
  (let [os-name (System/getProperty "os.name")]
    (cond
     (re-find #"(?i)mac" os-name) "native/macosx"
     (re-find #"(?i)win" os-name) "native/windows"
     (re-find #"(?i)linux" os-name) "native/linux"
     (re-find #"(?i)solaris" os-name) "native/solaris")))

(defproject game "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :jvm-opts [~(str "-Djava.library.path=" (get-native-lib-path))]
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.lwjgl.lwjgl/lwjgl "2.8.4"]
                 [org.lwjgl.lwjgl/lwjgl_util "2.8.4"]])
