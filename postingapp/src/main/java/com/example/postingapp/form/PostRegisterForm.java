package com.example.postingapp.form;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import jakarta.validation.constraints.Size;

@Data
public class PostRegisterForm {
    @NotBlank(message = "タイトルを入力してください。")
    @Size(max = 40)
    private String title;

    @NotBlank(message = "本文を入力してください。")
    @Size(max = 200)
    private String content;
}
