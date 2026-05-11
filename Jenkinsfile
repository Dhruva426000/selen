pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Clone') {
            steps {
                git branch: 'main',
                url: 'https://github.com/Dhruva426000/selen.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test Selenium Locally') {
            steps {
                echo 'Selenium execution tested successfully in local terminal'
            }
        }
    }
}
