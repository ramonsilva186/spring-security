package br.com.ramonsilva186.springsecurity.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
