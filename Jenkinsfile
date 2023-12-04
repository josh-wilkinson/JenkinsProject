pipeline {
    agent { docker { image 'maven:3.9.5-eclipse-temurin-17-alpine' } }

    stages {
        stage ('build') {

            steps {
                echo 'building the application'
            }

        }

        stage ('test') {
            steps {
                echo 'testing the application'
            }

        }

        stage ('deploy') {
            steps {
                echo 'deploying the applicaton'
            }

        }
    }
}