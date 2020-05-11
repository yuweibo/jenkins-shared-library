import com.test.Utils

def call(String name = 'human') {
    pipeline {
        agent any
        stages {
            stage ('set go path') {
                steps {
                    script {
                        Utils utils = new Utils();
                        utils.jobList();
                    }
                }
            }
        }
    }
 }
