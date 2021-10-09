#!/usr/bin/env groovy


pipeline{
    agent any

    stages{
        stage('Debug'){
            echo "${env.JOB_BASE_NAME}"

        }
    }

}