(ns leiningen.story
  (:require
    [story.core :as story]))

(def defaults
  {:production "production"
   :output "doc.html"
   :files ["project.clj"]})

(defn story
  "Create documentation Story style.

Optional args: `-v` and `production`.

See https://github.com/jedahu/lein-story for more information."
  [project & args]
  (let [opts (merge defaults (:story project))]
    (if (some #{"production"} args)
      (story/write-production-tree (:files opts) (:production opts))
      (apply story/story opts (:output opts) (:files opts)))))
