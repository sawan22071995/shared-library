def build(def path, def port) {
        bat 'cd %path%'
        bat 'mvn clean -U deploy -Dapp.server=jboss -Ddb.vendor=mysql'
    }
