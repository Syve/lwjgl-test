(defproject game "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :jvm-opts ["-Djava.library.path=native/macosx"]
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.lwjgl.lwjgl/lwjgl "2.8.4"]
                 [org.lwjgl.lwjgl/lwjgl_util "2.8.4"]])
