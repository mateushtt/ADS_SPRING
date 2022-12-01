package br.com.mateushr.filmediretor.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "filmes")
@AllArgsConstructor
@NoArgsConstructor

public class FilmeModel extends RepresentationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter @Getter
    @ApiModelProperty(notes = "The ID")
    private long id;

    @Column(name = "name", nullable = false, length = 50)
    @Setter @Getter
    @ApiModelProperty(notes = "The film full name")
    private String name;

    @Column(nullable = false, length = 1)
    @Getter @Setter
    @ApiModelProperty(notes = "Gender of filme (action, adventure, drama and romance")
    private String gender;

    @Column(nullable = false, length = 1)
    @Getter @Setter
    @ApiModelProperty(notes = "Movie release year")
    private LocalDate yearr;

    @ManyToOne
    @JoinColumn(name = "diretores_id")
    @Setter @Getter
    private DiretorModel diretor;

}
