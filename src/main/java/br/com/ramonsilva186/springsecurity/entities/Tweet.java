package br.com.ramonsilva186.springsecurity.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
@Getter
@Setter
@Entity
@Table(name = "tb_tweets")
public class Tweet {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        @Column(name = "tweet_id")
        private Long tweetId;

        @ManyToOne
        @JoinColumn(name = "user_id")
        private User user;

        private String content;
        @CreationTimestamp
        private Instant creationTimeStamp;
}
