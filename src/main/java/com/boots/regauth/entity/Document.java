package com.boots.regauth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table(name = "t_documents")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Document implements GrantedAuthority{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "document_id")
    private Long id;
    private String name;
    private String imagePath;
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "client_id")
    //private Client client;

    @Override
    public String getAuthority() {
        return getName();
    }
}