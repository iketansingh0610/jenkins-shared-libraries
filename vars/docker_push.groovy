def call(String Project, String ImageTag, String dockerhubuser){
withCredentials([usernamePassword(credentialsId: 'docker-hub-cred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
        sh 'echo "$dockerHubPass" | docker login -u "$dockerHubUser" --password-stdin'
        sh 'docker image tag notes-app:latest iketansingh0610/notes-app:latest'
        sh 'docker push iketansingh0610/notes-app:latest'
}

  
