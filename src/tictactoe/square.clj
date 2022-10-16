(ns tictactoe.square)

(def lower-bound 1)

(def upper-bound 4)

(defn create-new-square [row col]
  (when (and (<= lower-bound row (- upper-bound 1)) (<= lower-bound col (- upper-bound 1)))
    {:row row :col col}))

(defn create-squares []
  (for [row (range lower-bound upper-bound)
        col (range lower-bound upper-bound)]
    {:row row :col col}))

(defn create-board []
  (into {} (for [square (create-squares)]
             {square :empty})))

(comment
  (create-squares)
  (def board (create-board))
  (def board (assoc board {:row 1 :col 1} :x))
  (def board (assoc board {:row 2 :col 1} :o))
  (def board (assoc board {:row 3 :col 3} :x))
  board
  )