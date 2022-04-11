pipeline {
    agent none
    stages {
        stage('Build') {
            agent {
                docker {
                    image '3.8.5-openjdk-17-slim'
                }
            }
            steps {
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                sh 'mvn --version'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}