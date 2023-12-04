pipeline {
    agent any

    tools {
        maven 'maven_3_9_6'
    }

    stages {
        stage ('Build') {
            //when { changeset "src/*.java" }
            steps {
                echo 'building the application'
                bat 'mvn -Dmaven.test.failure.ignore=true clean package'
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