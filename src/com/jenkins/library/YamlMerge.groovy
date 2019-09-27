package com.jenkins.library

def merge(Map config) {
    Map yamlConfig = [:]

    fileA = config.fileA ? config.fileA : "destination.yaml"
    fileB = config.fileB ? config.fileB : "source.yaml"
    mergedFile = config.mergedFile  ? config.fileB : "merged.yaml"
    def tempfile = "temp-" + UUID.randomUUID().toString() + ".txt"
    sh "yq m ${sourceFile} ${destFile} >${tempfile}"
    sh "cp -r ${tempfile} ${mergedFile} && rm -rf ${tempfile}"
}