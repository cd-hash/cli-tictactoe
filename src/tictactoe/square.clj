(ns tictactoe.square)

(def lower-bound 1)

(def upper-bound 3)

(defn create-new-square [row col]
  (when (and (<= lower-bound row upper-bound) (<= lower-bound col upper-bound))
    {:row row :col col}))