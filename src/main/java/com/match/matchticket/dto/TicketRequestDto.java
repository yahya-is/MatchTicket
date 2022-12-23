package com.match.matchticket.dto;


import com.match.matchticket.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TicketRequestDto {
    private Status status;
}
