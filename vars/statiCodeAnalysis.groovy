def call(sonar-api){

        withSonarQubeEnv(sonar-api: 'sonar-api') {
            sh 'mvn clean package sonar:sonar'
    }
}
