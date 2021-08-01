package aylee.kubernetes.demofront.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfraInfo {
    private String nodeName;
    private String nodeIP;
    private String podName;
    private String podIP;
    private String namespace;

    public InfraInfo(String nodeName, String nodeIP, String podName, String podIP, String namespace) {
        this.nodeName = nodeName;
        this.nodeIP = nodeIP;
        this.podName = podName;
        this.podIP = podIP;
        this.namespace = namespace;
    }
}