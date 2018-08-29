(ns ctim.examples.vulnerabilities
  (:require [ctim.schemas.common :as c]))

(def vulnerability-maximal
  {:description "Absolute Computrace Agent V80.845 and V80.866 does not have a digital signature for the configuration block which allows attackers to set up communication with a web site other than the intended search.namequery.com site by modifying data within a disk's inter-partition space. This allows a privileged local user to execute arbitrary code even after that user loses access and all disk partitions are reformatted."
   :cve {:cve_data_meta {:assigner "cve@mitre.org"
                         :id "CVE-2009-5150"}}
   :impact {:cvss_v3 {:vector_string "CVSS:3.0/AV:L/AC:L/PR:H/UI:N/S:U/C:H/I:H/A:H"
                      :attack_vector "local"
                      :modified_attack_vector "not_defined"
                      :attack_complexity "low"
                      :confidentiality_requirement "high"
                      :report_confidence "reasonable"
                      :modified_attack_complexity "not_defined"
                      :privileges_required "high"
                      :modified_privileges_required "not_defined"
                      :user_interaction "none"
                      :modified_user_interaction "not_defined"
                      :scope "unchanged"
                      :modified_scope "not_defined"
                      :availability_requirement "not_defined"
                      :confidentiality_impact "high"
                      :modified_confidentiality_impact "not_defined"
                      :integrity_impact "high"
                      :modified_integrity_impact "not_defined"
                      :environmental_severity "low"
                      :availability_impact "high"
                      :modified_availability_impact "not_defined"
                      :exploit_code_maturity "high"
                      :base_score 6.7
                      :base_severity "medium"
                      :temporal_score 4.2
                      :environmental_score 4.2
                      :remediation_level "workaround"
                      :temporal_severity 4.2
                      :integrity_requirement "low"}
            :cvss_v2 {:vector_string "(AV:L/AC:L/Au:N/C:C/I:C/A:C)"
                      :base_score 7.2
                      :base_severity "High"
                      :access_vector "local"
                      :access_complexity "low"
                      :authentication "none"
                      :confidentiality_impact "complete"
                      :integrity_impact "complete"
                      :availability_impact "complete"
                      :exploitability "unproven"
                      :remediation_level "workaround"
                      :report_confidence "unconfirmed"
                      :temporal_vector_string "(E:U/RL:W/RC:UC)"
                      :collateral_damage_potential "low"
                      :target_distribution "low"
                      :confidentiality_requirement "low"
                      :integrity_requirement "low"
                      :availability_requirement "high"
                      :environmental_vector_string "(CDP:L/TD:L/CR:L/IR:L/AR:H)"
                      :obtain_all_privilege true
                      :obtain_user_privilege false
                      :obtain_other_privilege false
                      :user_interaction_required true}
            :exploitability_score 0.8
            :impact_score 5.9}
   :schema_version c/ctim-schema-version
   :revision 1
   :type "vulnerability"
   :source "source"
   :external_ids
   ["http://ex.tld/ctia/vulnerability/cisco-vulnerability-6c5a8540-cec7-4647-abb6-84cd2d2fa544"]
   :short_description "short description"
   :title "CVE-2009-5150"
   :external_references
   [{:source_name "CWE-2009-5150"
     :external_id "CWE-2009-5150"
     :url "https://nvd.nist.gov/vuln/detail/CVE-2009-5150"
     :description "Improper Neutralization of Directives in Dynamically Evaluated Code ('Eval Injection')"
     :hashes ["#Common_Consequences"]}]
   :source_uri "http://example.com"
   :language "fr"
   :id
   "http://ex.tld/ctia/vulnerability/vulnerability-6c5a8540-cec7-4647-abb6-84cd2d2fa544"
   :tlp "green"
   :timestamp #inst "2010-01-01T00:00:00.000-00:00"
   :published_date #inst "2016-02-11T00:40:48.212-00:00"
   :last_modified_date #inst "2016-02-11T00:40:48.212-00:00"})

(def vulnerability-minimal
  {:id "http://ex.tld/ctia/vulnerability/vulnerability-6c5a8540-cec7-4647-abb6-84cd2d2fa544"
   :type "vulnerability"
   :description "Improper Neutralization of Directives in Dynamically Evaluated Code ('Eval Injection')"
   :schema_version c/ctim-schema-version})

(def new-vulnerability-maximal
  vulnerability-maximal)

(def new-vulnerability-minimal
  {:description "Improper Neutralization of Directives in Dynamically Evaluated Code ('Eval Injection')"})

(def stored-vulnerability-maximal
  (into vulnerability-maximal
        {:owner "foouser"
         :groups ["bar"]
         :created #inst "2016-02-11T00:40:48.212-00:00"
         :modified #inst "2016-02-11T00:40:48.212-00:00"}))

(def stored-vulnerability-minimal
  (into vulnerability-minimal
        {:owner "foouser"
         :groups ["bar"]
         :created #inst "2016-02-11T00:40:48.212-00:00"
         :modified #inst "2016-02-11T00:40:48.212-00:00"}))
