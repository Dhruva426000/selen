pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Dhruva426000/selen.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {

        success {
            echo 'Login Successful'
            echo 'Open SauceDemo Inventory Page: https://www.saucedemo.com/inventory.html'
        }

        failure {
            echo 'Build FAILED'
        }
    }
}
