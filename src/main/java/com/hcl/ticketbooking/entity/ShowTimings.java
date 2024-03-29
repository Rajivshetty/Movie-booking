package com.hcl.ticketbooking.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class ShowTimings {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)

	private Integer showTimingsId;
	private Integer theatreId;
	private String showTime;
	private Integer movieId;
	private LocalDate showDate;
	

}
