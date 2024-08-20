def call() {
pipeine{
    agent any
    tools {
        maven 'MAVEN 3.9.9'
    }
    stages {
        stage ('git') {
            steps git url: 'https://github.com/spring-projects/spring-petclinic.git',
            branch: 'main'
        }
        stage ('build') {
            sh 'mvn clean package'
        }
        }
    }
}
