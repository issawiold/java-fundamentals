package com.example.server.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    @Entity
    public class UserModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String username;

        private String password;

        public UserModel(String username, String password){
            this.username=username;
            this.password=password;
        }

        public UserModel() {

        }

        public void setUsername(String username){
            this.username=username;
        }

        public void setPassword(String password){
            this.password=password;
        }

        public String getUsername(){
            return username;
        }

        public String getPassword(){
            return password;
        }
    }


