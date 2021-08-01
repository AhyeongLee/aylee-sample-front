package aylee.kubernetes.demofront.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloData {

    private Long id;

    private String inputData;

}