(ns tictactoe.cli)

(defn show [board row col]
  (let [item (get board {:row row :col col})]
    (if (= item :empty)
      (str " ")
      (name item))))

(defn display-board [board]
  (print (str (show board 1 1) " | " (show board 1 2) " | " (show board 1 3) "\n"
              "---------\n"
              (show board 2 1) " | " (show board 2 2) " | " (show board 2 3) "\n"
              "---------\n"
              (show board 3 1) " | " (show board 3 2) " | " (show board 3 3) "\n")))