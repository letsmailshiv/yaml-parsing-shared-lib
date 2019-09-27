
import com.jenkins.library.YamlParser

def call(Map config=[:]) {

    def yaml = new YamlMerge();
    yaml.merge(config);

    return true
}