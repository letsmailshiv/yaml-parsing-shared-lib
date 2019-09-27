package com.jenkins.library

def merge(Map config) {
    Map yamlConfig = [:]

    sourceFile = config.sourceFile ? config.sourceFile : "destination.yaml"
    destFile = config.destFile ? config.destFile : "source.yaml"

    def tempfile = "temp-" + UUID.randomUUID().toString() + ".txt"
    sh "yq m ${sourceFile} ${destFile} >${tempfile}"
    sh "cp -r ${tempfile} ${destFile} && rm -rf ${tempfile}"
}