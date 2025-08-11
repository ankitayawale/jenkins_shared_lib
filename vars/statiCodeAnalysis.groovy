def call(credentialsId){
    sh 'mvn clean package sonar:sonar'
}
