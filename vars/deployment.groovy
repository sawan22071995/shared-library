def deployment(def path, def port) {
    bat 'cd %path%'
    bat 'set OMNISTORE_HOME=%path%\omnistore-home'
    bat 'java -DOMNISTORE_HOME=%OMNISTORE_HOME% -jar omnistore-ms-sale-return-services-1.0.0-SNAPSHOT.jar --spring.config.location=application.properties,bootstrap.properties >> logs.log 2>&1' 
    }
