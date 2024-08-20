def call() {
pipeine{
    agent any
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
