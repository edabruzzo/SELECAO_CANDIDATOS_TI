package org.SELECAO_CANDIDATOS_TI.model;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;


/**
 *
 * @author Emmanuel de Oliveira D'Abruzzo
 
 REFERÊNCIAS:
 * PARA TRABALHAR COM ENUMS E JPA: http://tomee.apache.org/examples-trunk/jpa-enumerated/
 PARA TRABALHAR COM MAPEAMENTO OBJETO RELACIONAL DE LISTAS DE ENUMS
 * https://www.devmedia.com.br/persistindo-entidades-contendo-lista-de-enums-utilizando-jpa/26470
 
 */
@Entity
@Table(name = "tb_candidato")
public class Candidato implements Serializable {

    
     private static final long serialVersionUID = 1L;

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_candidato", updatable = false, nullable = false)
    private Long idCandidato;
    
    @Column(length = 40, name = "nome", nullable = false)
    private String nome;

    @Column(length = 100, name = "tempoExperienciaProfissional")
    private Integer tempoExperienciaProfissional;

    private Integer idade;

    
    @Enumerated(EnumType.STRING)
    FormacaoAcademica formacaoAcademica;

    //SERÁ UTILIZADO PARA PENALIZAR CANDIDATOS DE UNIVERSIDADES RUINS, OU SEJA,
    //AQUELAS QUE NÃO ESTÃO LISTADAS NO ENUM
    @Enumerated(EnumType.STRING)
    private UniversidadeFormacao universidadeFormacao;

    @CollectionOfElements(targetElement = Cargos.class, fetch = FetchType.EAGER)
    @JoinTable(name = "tb_cargos", joinColumns = @JoinColumn(name = "idCargo"))
    @Column(name = "cargoPretendido", nullable = false)
    @Enumerated(EnumType.STRING)
    private List<Cargos> listaCargosPretendidos;
    
    @Enumerated(EnumType.STRING)
    private DominioIngles dominioIngles;
    
    private boolean fluenciaOutroIdioma;
    
    @CollectionOfElements(targetElement = TecnologiasDominadas.class, fetch = FetchType.EAGER)
    @JoinTable(name = "tb_tecnologias", joinColumns = @JoinColumn(name = "idTecnologia"))
    @Column(name = "tecnologiaDominada", nullable = false)
    @Enumerated(EnumType.STRING)
    private List<TecnologiasDominadas> tecnologiasDominadas;

    public Long getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Long idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTempoExperienciaProfissional() {
        return tempoExperienciaProfissional;
    }

    public void setTempoExperienciaProfissional(Integer tempoExperienciaProfissional) {
        this.tempoExperienciaProfissional = tempoExperienciaProfissional;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public FormacaoAcademica getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(FormacaoAcademica formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public UniversidadeFormacao getUniversidadeFormacao() {
        return universidadeFormacao;
    }

    public void setUniversidadeFormacao(UniversidadeFormacao universidadeFormacao) {
        this.universidadeFormacao = universidadeFormacao;
    }

    public List<Cargos> getListaCargosPretendidos() {
        return listaCargosPretendidos;
    }

    public void setListaCargosPretendidos(List<Cargos> listaCargosPretendidos) {
        this.listaCargosPretendidos = listaCargosPretendidos;
    }

    public DominioIngles getDominioIngles() {
        return dominioIngles;
    }

    public void setDominioIngles(DominioIngles dominioIngles) {
        this.dominioIngles = dominioIngles;
    }

    public boolean isFluenciaOutroIdioma() {
        return fluenciaOutroIdioma;
    }

    public void setFluenciaOutroIdioma(boolean fluenciaOutroIdioma) {
        this.fluenciaOutroIdioma = fluenciaOutroIdioma;
    }

    public List<TecnologiasDominadas> getTecnologiasDominadas() {
        return tecnologiasDominadas;
    }

    public void setTecnologiasDominadas(List<TecnologiasDominadas> tecnologiasDominadas) {
        this.tecnologiasDominadas = tecnologiasDominadas;
    }
    
    
       

}
