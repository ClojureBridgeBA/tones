(ns tones.play
  (:use [clojure.repl]
        [tones.twinkle]
        [overtone.live]
        [overtone.inst.piano]))

(twinkle)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; evaluate whole file by hitting
;;   ctrl + shift + enter, or
;;   cmd + shift + enter
;;
;; add some functions under these comment lines
;; evaluate each form (line or function) by hitting
;;   ctrl + enter, or
;;   cmd + enter
;;
;; for example
;; (piano 67)
;;
;; listen to the sound you have made
;;
