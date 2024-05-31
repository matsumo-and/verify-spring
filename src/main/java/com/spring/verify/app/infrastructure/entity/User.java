package com.spring.verify.app.infrastructure.entity;

import java.io.File;

public record User(long id, String name, String email, File file) {}
