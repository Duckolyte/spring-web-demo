pipeline {
    agent none
    stages {
        stage('Initialize') {
            steps {
                def dockerHome = tool 'ci-docker'
                env.PATH = "${dockerHome}/bin:${env.PATH}"
            }
        }
        stage('Build') {
            agent {
                docker {
                    image '3.8.5-openjdk-17'
                    args '-v $HOME/.m2:/root/.m2'
                    reuseNode true
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