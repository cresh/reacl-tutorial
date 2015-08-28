(ns ^:figwheel-always reacl-tutorial.core
  (:require [reacl.core :as reacl :include-macros true]
            [reacl.dom :as dom :include-macros true]))

(enable-console-print!)

(println "Hello world!")

(def contacts
  [{:first "Ben" :last "Bitdiddle" :email "benb@mit.edu"}
   {:first "Alyssa" :middle-initial "P" :last "Hacker" :email "aphacker@mit.edu"}
   {:first "Eva" :middle "Lu" :last "Ator" :email "eval@mit.edu"}
   {:first "Louis" :last "Reasoner" :email "prolog@mit.edu"}
   {:first "Cy" :middle-initial "D" :last "Effect" :email "bugs@mit.edu"}
   {:first "Lem" :middle-initial "E" :last "Tweakit" :email "morebugs@mit.edu"}])

(def registry
  {:people
   [{:type :student :first "Ben" :last "Bitdiddle" :email "benb@mit.edu"}
    {:type :student :first "Alyssa" :middle-initial "P" :last "Hacker"
     :email "aphacker@mit.edu"}
    {:type :professor :first "Gerald" :middle "Jay" :last "Sussman"
     :email "metacirc@mit.edu" :classes [:6001 :6946]}
    {:type :student :first "Eva" :middle "Lu" :last "Ator" :email "eval@mit.edu"}
    {:type :student :first "Louis" :last "Reasoner" :email "prolog@mit.edu"}
    {:type :professor :first "Hal" :last "Abelson" :email "evalapply@mit.edu"
     :classes [:6001]}]
   :classes
   {:6001 "The Structure and Interpretation of Computer Programs"
    :6946 "The Structure and Interpretation of Classical Mechanics"
    :1806 "Linear Algebra"}})

(reacl/defview demo
  this []
  render
  (dom/h1 "Reacl Tutorial"))

(reacl/render-component
 (.getElementById js/document "content")
 demo)