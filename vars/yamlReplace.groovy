
import com.jenkins.library.YamlParser

def call(Map config) {
    Map yamlConfig = [:]
    String yamlConfig.configPath = config.configPath ? config.path : "${pwd()}"
    String yamlConfig.fileName = config.fileName ? config.fileName : "values.yaml"
    String yamlConfig.keyName = config.keyName
    String yamlConfig.keyValue = config.keyValue

    //def yaml = new YamlParser();
    //yaml.parser(yamlConfig);

    println('!!! ' + yamlConfig)

    return true
}