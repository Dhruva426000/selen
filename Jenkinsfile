pipeline {
    agent any

    tools {
    maven 'Maven'
}

    stages {

        stage('Git Checkout') {
            steps {
                git 'https://github.com/Dhruva426000/selen'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Run Selenium App') {
            steps {
                sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
            }
        }
    }
}
