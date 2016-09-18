node {
    def mvnHome
    stage('Checkout from SCM') {
        println env.BRANCH_NAME
        checkout scm
    }
    stage('Setup') {
        mvnHome = tool 'Maven 3.3.9'
        sh 'chmod +x ./bin/setup && ./bin/setup'
        sh 'bundle'
    }
    stage('Clean Workspace') {
        sh "${mvnHome}/bin/mvn -B clean"
    }
    stage('Test') {
        sh "${mvnHome}/bin/mvn -B test"
    }
    stage('Deployment') {
        sh 'chmod +x ./bin/deploy && ./bin/deploy development'
    }
}