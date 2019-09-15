package com.jenkins.library


def findAndReplace(Map config) {
    Map yamlConfig = [:]

     yamlConfig.configPath = config.configPath ? config.path : "${pwd()}"
     yamlConfig.fileName = config.fileName ? config.fileName : "values.yaml"
     yamlConfig.keyName = config.keyName
     yamlConfig.keyValue = config.keyValue

    def tempfile = yamlConfig.configPath + "temp-" + UUID.randomUUID().toString() + ".txt"
    def targetfile = yamlConfig.configPath + yamlConfig.fileName
    sh "yq w ${targetfile} ${yamlConfig.keyName} ${yamlConfig.keyValue} >${tempfile}"
    sh "cp -r ${tempfile} ${targetfile} && rm -rf ${tempfile}"
}