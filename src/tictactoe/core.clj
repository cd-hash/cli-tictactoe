(ns tictactoe.core
  (:require [tictactoe.square :as square]))

(defn check-player [player]
  (case player
    :x player
    :o player
    nil))

(defn valid-location [board square]
  (case (get board square)
    :empty true
    :x nil
    :o nil
    nil nil
    :else nil))

(defn place-piece [board location player]
  (if (valid-location board location)
    (assoc board location player)
    false))


(defn play-move [board row col player]
  (let [tile (square/create-new-square row col)]
       (if-some [player (check-player player)]
         (place-piece board tile player)
         :invalid-player)))


(comment
  (def board (square/create-board))
  (valid-location board (square/create-new-square 1 2))
  (def board (place-piece board (square/create-new-square 1 2) :x))
  (def board (play-move board 2 2 :o))
  (def board (play-move board 2 3 :y))
  (def board (play-move board 4 3 :x))
  board)