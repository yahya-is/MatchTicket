package com.match.matchticket.controller;

import com.match.matchticket.dto.MatchRequestDto;
import com.match.matchticket.dto.MatchResponseDto;
import com.match.matchticket.dto.TicketRequestDto;
import com.match.matchticket.dto.TicketResponseDto;
import com.match.matchticket.service.MatchServiceImpl;
import com.match.matchticket.service.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class TicketControllerGraphQl {
    @Autowired
    TicketServiceImpl ticketService;
    @QueryMapping
    public List<TicketResponseDto> getTickets(){
        return ticketService.findAll();
    }

    @QueryMapping
    public TicketResponseDto getTicketById(@Argument Long id){
        return  ticketService.findById(id);
    }
    @MutationMapping
    public  TicketResponseDto addTicket( @Argument Long id,@Argument TicketRequestDto t){
        return  ticketService.addTicket(id,t);
    }
    @MutationMapping
    public TicketResponseDto  updateTicket( @Argument Long id,@Argument TicketRequestDto t){
        return ticketService.updateTicket(id, t);
    }

    @MutationMapping
    public void deleteTicket( @Argument Long id){
        ticketService.deleteTicket(id);
    }
}

