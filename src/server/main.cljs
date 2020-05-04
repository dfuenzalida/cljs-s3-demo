(ns server.main
  (:require ["aws-sdk" :as aws]))

(defn reload! []
  (println "Code updated."))

(defn main! []
  (println "App loaded...")
  (let [creds   (aws/SharedIniFileCredentials. #js {:profile "example-profile"})
        _ (set! (.-credentials aws/config) creds)
        s3      (aws/S3.)]
    (.listBuckets s3 (fn [err data]
                       (if err
                         (println "ERROR:" err)
                         (println "OK:" data))))))

