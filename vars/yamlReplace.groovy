
import com.jenkins.library.YamlParser

def call(Map config=[:]) {

    def yaml = new YamlParser();
    yaml.findAndReplace(config);

    return true
}