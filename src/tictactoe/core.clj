(ns tictactoe.core
  (:require [tictactoe.square :as square]))

(defn check-player [player]
  (case player
    :x :x
    :o :o
    nil))

(defn place-piece [board location player]
  (when (= (get board location) :empty)
    (assoc board location player)))


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