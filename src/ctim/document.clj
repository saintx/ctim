(ns ctim.document
  (:gen-class)
  (:require [clojure.java.io :as io]
            [ctim.schemas
             [actor :as a]
             [campaign :as c]
             [coa :as co]
             [exploit-target :as e]
             [feedback :as f]
             [incident :as inc]
             [indicator :as ind]
             [judgement :as j]
             [observed-relationship :as o]
             [sighting :as s]
             [ttp :as t]
             [verdict :as v]]
            [flanders.markdown :as fm]))

(defn -main [& _args_]
  (doseq [[file-name type_] [["actor.md" a/Actor]
                             ["campaign.md" c/Campaign]
                             ["coa.md" co/COA]
                             ["exploit_target.md" e/ExploitTarget]
                             ["feedback.md" f/Feedback]
                             ["incident.md" inc/Incident]
                             ["indicator.md" ind/Indicator]
                             ["judgement.md" j/Judgement]
                             ["observed_relationship.md" o/ObservedRelationship]
                             ["sighting.md" s/Sighting]
                             ["ttp.md" t/TTP]
                             ["verdict.md" v/Verdict]]]
    (println (str "Writing " file-name "..."))
    (spit (io/file
           (io/resource file-name))
          (fm/->markdown type_))))