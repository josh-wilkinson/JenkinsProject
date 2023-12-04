pipeline {
    agent any

    tools {
        maven 'maven_3_9_6'
    }

    stages {
        stage ('build') {

            steps {
                echo 'building the application'
                sh 'mvn --version'
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