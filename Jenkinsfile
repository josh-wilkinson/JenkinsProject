pipeline {
    agent any

    tools {
        maven 'maven_3_9_6'
    }

    stages {
        stage ('Build') {

            steps {
                echo 'building the application'
                bat 'cd src/main/java && dir'
                bat 'mvn -X clean compile'
            }

        }

        stage ('Test') {
            steps {
                echo 'testing the application'
                //bat 'mvn test'
            }

        }

        stage ('Deploy') {
            steps {
                echo 'deploying the applicaton'
                //bat 'mvn deploy'
            }

        }
    }
}