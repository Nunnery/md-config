node {
    def mvnHome
    stage 'Checkout from SCM' {
        checkout scm
    }
    stage 'Setup Tools' {
        mvnHome = tool 'Maven 3.3.9'
    }
    stage 'Clean Workspace' {
        sh "${mvnHome}/bin/mvn -B clean"
    }
    stage 'Test' {
        sh "${mvnHome}/bin/mvn -B test"
    }
}