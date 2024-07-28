package org.dodo.dodo.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
@Table(name = "auth")
public class Auth {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "authEmail")
    private String userEmail;

    @Column(name = "authPassword")
    private String password;

    @Column(name = "is_enabled")
    private boolean isEnabled;

    @Column(name = "created_at")
    private Date createdAt;
}
