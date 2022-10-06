package lecture.domain;

import lecture.domain.*;
import lecture.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideostreamProcessed extends AbstractEvent {

    private Long id;

    public VideostreamProcessed(Video aggregate){
        super(aggregate);
    }
    public VideostreamProcessed(){
        super();
    }
}
