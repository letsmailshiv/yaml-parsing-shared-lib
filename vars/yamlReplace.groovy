
//import com.jenkins.library.YamlParser

def call(Map config=[:]) {
    Map yamlConfig = [:]
     yamlConfig.configPath = config.configPath ? config.path : "${pwd()}"
     yamlConfig.fileName = config.fileName ? config.fileName : "values.yaml"
     yamlConfig.keyName = config.keyName
     yamlConfig.keyValue = config.keyValue

    //def yaml = new YamlParser();
    //yaml.parser(yamlConfig);

    println('!!! ' + yamlConfig)

    return true
}