(ns game.core
  (:import org.lwjgl.LWJGLException
           [org.lwjgl.opengl
            Display
            DisplayMode]))

(def ^:dynamic *width* 800)
(def ^:dynamic *height* 600)

(defn set-display-mode
  []
  (let [dm (org.lwjgl.util.Display/getAvailableDisplayModes
            *width* *height* -1 -1 -1 -1 -1 -1)
        mode-spec (make-array java.lang.String 4)]
    (dorun (map-indexed #(aset mode-spec %1 %2)
                 [(str "width=" *width*)
                  (str "height=" *height*)
                  (str "freq=" 60)
                  (str "bpp="
                       (.getBitsPerPixel (org.lwjgl.opengl.Display/getDisplayMode)))]))
    (println "dm:" dm "mode-spec:" (seq mode-spec))
    (org.lwjgl.util.Display/setDisplayMode dm mode-spec)))

(defn start
  []
  (set-display-mode)
  (Display/create)

  (loop [close? (Display/isCloseRequested)]
    (when (not close?)
      (Display/update)
      (recur (Display/isCloseRequested))))

  (Display/destroy))

(comment

  ;; Can start the thing by executing the following form
  (future (start)))
