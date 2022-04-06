package uz.pdp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String text;



    @ManyToOne
    private User kimdan;

    @ManyToOne
    private User kimga;


    @ManyToOne
    @JoinColumn(name = "user_messenger_id")
    private UserMessenger userMessenger;

}
