#!/usr/bin/env groovy

node {
  stage ('GIT') {
    checkout scm
  }
  stage ('STAGE 1') {
    sh 'mvnw test'
    }
  stage ('STAGE 2') {
    sh 'mvnw spring-boot:run -Dcucumber.options="--tags ~@wip"'
  }
}
