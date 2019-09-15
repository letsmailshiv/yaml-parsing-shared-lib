
//import com.jenkins.library.YamlParser

def call(Map config=[:]) {

    def yaml = new YamlParser();
    yaml.parser(config);

    return true
}