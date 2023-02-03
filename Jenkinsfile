pipeline{
    agent any
    environment {
        password = credentials('dockerhub-pwd')
    }
    tools{
        maven 'maven_3_5_0'
    }
    stages{
        stage('Crear Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/StephanieCueva/ProyectoFinalU6']])
                bat 'mvn clean install'
            }
        }
        stage('Crear imagen en docker'){
            steps{
                script{
                    bat 'docker build -t stephaniecueva/proyectofinal:v1 .'
                }
            }
        }
        stage('Subiendo imagen a docker hub'){
            steps{
                bat 'docker login -u stephaniecueva -p stephanie1408.'
                bat 'docker push stephaniecueva/proyectofinal:v1'
            }
        }
        stage('Levantando contenedor'){
            steps{
                bat "docker run --name proyectofinal -p 8085:8085 stephaniecueva/proyectofinal:v1"
            }
        }
    }
}