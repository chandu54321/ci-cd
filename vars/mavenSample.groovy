def call() {
pipeine{
    agent any
    tools {
        MAVEN_3.9.9
    }
    stages {
        stage ('git') {
            steps git url: 'https://github.com/chandu54321/spring-petclinic12.git',
            branch: 'main'
        }
        stage ('build') {
            sh 'mvn clean package'
        }
        }
    }
}
