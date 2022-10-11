(ns tictactoe.core
  (:require [tictactoe.square :as square]))

(defn check-player [player]
  (case player
    :x :x
    :o :o
    nil))

(defn valid-location [board square]
  (if (and (= (get board square) :empty) (some? square))
   true
   false))

(defn place-piece [board location player]
  (if (valid-location board location)
    (assoc board location player)
    false))


(defn play-move [board row col player]
  (let [tile (square/create-new-square row col)]
       (if-some [player (check-player player)]
         player
         :error)
    (place-piece board tile player)))


(comment
  (def board (square/create-board))
  (def board (play-move board 1 1 :x))
  board)