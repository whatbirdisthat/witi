#!/usr/bin/env groovy

node {
  stage ('GIT') {
    checkout scm
  }
  stage ('STAGE 1') {
    sh 'mvn test'
    }
  stage ('STAGE 2') {
    sh 'mvn spring-boot:run -Dcucumber.options="--tags ~@wip"'
  }
}
