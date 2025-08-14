 def dockerPushToHub(String fullImageName, String ImageTag, String dockerHubUser){
     withCredentials([usernamePassword(
             credentialsId: "docker",
             usernameVariable: "USER",
             passwordVariable: "PASS"
    )]) {
         sh "docker login -u '$USER' -p '$PASS'"
    }
     def fullImageName = "${dockerHubUser}/${imageName}"
     sh "docker image push ${fullImageName}:${ImageTag}"
     sh "docker image tag ${fullImageName}:${imageTag} ${fullImageName}:latest"
     sh "docker image push ${fullImageName}:latest"   
}


//def call(String aws_account_id, String region, String ecr_repoName){
    
  //  sh """
    // aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com
     //docker push ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
    //"""
//}