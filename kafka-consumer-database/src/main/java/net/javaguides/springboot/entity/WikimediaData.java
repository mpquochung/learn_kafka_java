package net.javaguides.springboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "wikimedia_recentchange")
@Getter
public class WikimediaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String wikiEventData;
    public void setWikiEventData(String eventMessage) {
        this.wikiEventData = eventMessage;
    }

}