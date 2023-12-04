pipeline {
    agent any

    tools {
        maven 'maven_3_9_6'
    }

    stages {
        stage ('build') {

            steps {
                echo 'building the application'
                sh 'mvn clean compile'
            }

        }

        stage ('test') {
            steps {
                echo 'testing the application'
                sh 'mvn test'
            }

        }

        stage ('deploy') {
            steps {
                echo 'deploying the applicaton'
                sh 'mvn deploy'
            }

        }
    }
}