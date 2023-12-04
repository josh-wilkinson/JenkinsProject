pipeline {
    agent any

    tools {
        maven 'maven_3_9_6'
    }

    stages {
        stage ('Build') {

            steps {
                bat 'mvn --version'
                echo 'building the application'
                bat 'mvn clean compile'
            }

        }

        stage ('Test') {

            steps {
                echo 'testing the application'
                bat 'mvn test'
            }

        }
    }
}