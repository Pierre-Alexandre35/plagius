pipeline {
 environment {
   jobBaseName = "${env.JOB_NAME}".split('/').first()
 }
 options {
      timeout(time: 10, unit: 'MINUTES') 
  } //option

  agent none
 stages {

   stage("build and test the project") {
   when {
       not {
           branch 'master'
       }
   }
   agent {
                docker {
                    image 'maven:3-alpine'
                    args '-v m2_repos:/root/.m2'
                } //docker
            } // agent

   stages {

   stage('Build') {
     steps {
       echo "Building Chatter"
       sh 'mvn -f Project_src/pom.xml install'
       echo "Building Prattle"
       sh 'mvn -f Project_src/pom.xml compile'
   }
   } // build
   stage('SonarQube') {
   when {
       not {
           branch 'master'
       }
   }
    steps {
      withSonarQubeEnv('SonarQube') {
        sh 'mvn -f Project_src/pom.xml clean install'
        sh 'mvn -f Project_src/pom.xml sonar:sonar -Dsonar.projectKey=${jobBaseName} -Dsonar.projectName=${jobBaseName}'
      }

      sh 'sleep 30'
      timeout(time: 10, unit: 'SECONDS') {
       retry(5) {
        script {
          def qg = waitForQualityGate()
          if (qg.status != 'OK') {
            error "Pipeline aborted due to quality gate failure: ${qg.status}"
          }
        }
      }
    }
  } //steps
} //SONAR
}
} //stage 
} // STAGES
}
