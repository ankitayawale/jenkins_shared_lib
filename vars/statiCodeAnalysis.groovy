def call(credentialsId){

        withSonarQubeEnv('sonar-api') {
            sh "mvn clean verify sonar:sonar -Dsonar.login=${env.SONAR_AUTH_TOKEN}"
    }

}
