

//def call(credentialsId){

//waitForQualityGate abortPipeline: false, credentialsId: credentialsId

//}


withSonarQubeEnv('jenkins') {
    sh 'mvn sonar:sonar'
}
timeout(time: 1, unit: 'MINUTES') {
    waitForQualityGate abortPipeline: false
}



