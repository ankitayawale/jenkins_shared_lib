def call(credentialsId){

        withSonarQubeEnv(credentialsId: credentialsId) {
            sh 'mvn clean verify sonar:sonar'
    }

}
