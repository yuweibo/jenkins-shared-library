package com.test

import com.cdancy.jenkins.rest.JenkinsClient
import com.cdancy.jenkins.rest.domain.job.Job
import com.cdancy.jenkins.rest.domain.system.SystemInfo

// 实现 Serializable 接口是为了确保当 pipeline 被 Jenkins挂起后能正确恢复
class Utils implements Serializable {
   def createVersion(String BUILD_NUMBER) {
       return new Date().format('yyyyMM') + "-${BUILD_NUMBER}"
   }

    def jobList(){
        JenkinsClient client = JenkinsClient.builder()
                .endPoint("http://10.10.20.115:8080") // Optional. Defaults to http://127.0.0.1:8080
                .credentials("admin:ingage") // Optional.
                .build();

        SystemInfo systemInfo = client.api().systemApi().systemInfo();
        List<Job> jobs = client.api().jobsApi().jobList("").jobs();
//        List<Job> jobs =  client.api().jobsApi().create("test","test1",);
        System.out.println(systemInfo);
        System.out.println(jobs);
    }

    public static void main(String[] args) {
        Utils utils = new Utils();
        utils.jobList()
    }
}
