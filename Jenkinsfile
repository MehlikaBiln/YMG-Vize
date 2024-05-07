pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(
                    branches: [[name: '*/main']],
                    userRemoteConfigs: [[url: 'https://github.com/MehlikaBiln/YMG-Vize']]
                )
                bat 'mvn clean install'
            }
        }


        stage('Build docker image'){
            steps{
                script{
                    docker.build("YMG-Vize:${env.BUILD_NUMBER}")
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                    docker.image("YMG-Vize:${env.BUILD_NUMBER}").run("-d -p 8082:8082 --name demo-container")
                }
            }
  }
}

}
