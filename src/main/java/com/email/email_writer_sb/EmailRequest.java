package com.email.email_writer_sb;

import lombok.Data;

@Data
public class EmailRequest {
    //The email content that needs a reply
    private String emailContent;
    //Tone define. It can be formal, informal, friendly, professional, etc.
    private String tone;
}
