package lecture.domain;

import lecture.domain.VideostreamProcessed;
import lecture.VideoprocessApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Video_table")
@Data

public class Video  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        VideostreamProcessed videostreamProcessed = new VideostreamProcessed(this);
        videostreamProcessed.publishAfterCommit();

    }

    public static VideoRepository repository(){
        VideoRepository videoRepository = VideoprocessApplication.applicationContext.getBean(VideoRepository.class);
        return videoRepository;
    }




    public static void processVideo(Fileuploaded fileuploaded){

        /** Example 1:  new item 
        Video video = new Video();
        repository().save(video);

        VideostreamProcessed videostreamProcessed = new VideostreamProcessed(video);
        videostreamProcessed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileuploaded.get???()).ifPresent(video->{
            
            video // do something
            repository().save(video);

            VideostreamProcessed videostreamProcessed = new VideostreamProcessed(video);
            videostreamProcessed.publishAfterCommit();

         });
        */

        
    }


}
