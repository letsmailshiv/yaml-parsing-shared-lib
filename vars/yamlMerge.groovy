
import com.jenkins.library.YamlMerge

def call(Map config=[:]) {

    def yaml = new YamlMerge();
    yaml.merge(config);

    return true
}