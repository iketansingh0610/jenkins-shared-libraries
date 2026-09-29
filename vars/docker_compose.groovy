def call(){
  sh "docker compose down && docker push up -d"
}
