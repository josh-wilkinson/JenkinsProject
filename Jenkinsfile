pipeline {
    agent any

    tools {
        maven 'maven_3_9_6'
    }

    stages {
        stage ('build') {

            steps {
                echo 'building the application'
                bat 'mvn --version'
            }

        }

        stage ('test') {
            steps {
                echo 'testing the application'
                //bat 'mvn test'
            }

        }

        stage ('deploy') {
            steps {
                echo 'deploying the applicaton'
                //bat 'mvn deploy'
            }

        }
    }
}