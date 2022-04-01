package com.dk.spring.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="distrubution")
public class WaterSupply {
		@Id
		@Column(name="name")
		private String name;
		@Column(name="day")
		private String day;
		@Column(name="time")
		private String time;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDay() {
			return day;
		}
		public void setDay(String day) {
			this.day = day;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}

	}



