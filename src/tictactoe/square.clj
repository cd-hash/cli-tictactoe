(ns tictactoe.square)

(def lower-bound 1)

(def upper-bound 3)

(defn create-new-square [row col]
  (when (and (<= lower-bound row upper-bound) (<= lower-bound col upper-bound))
    {:row row :col col}))

(defn create-squares []
  (for [row (range upper-bound)
        col (range upper-bound)]
    {:row row :col col}))

(defn create-board []
  (into {} (for [square (create-squares)]
             {square :empty})))

(comment
  (create-squares)
  (def board (create-board))
  (def board (assoc board {:row 0 :col 0} :x))
  (def board (assoc board {:row 1 :col 0} :o))
  (def board (assoc board {:row 2 :col 2} :x))
  board
  )