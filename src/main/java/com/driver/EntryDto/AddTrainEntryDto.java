package com.driver.EntryDto;

import com.driver.model.Station;

import java.time.LocalTime;
import java.util.List;

public class AddTrainEntryDto {

    private String route; // String representation of the route
    private LocalTime departureTime; // Departure time from the first station
    private int noOfSeats; // Number of seats on the train

    public AddTrainEntryDto() {
    }

    public AddTrainEntryDto(List<Station> stationRoute, LocalTime departureTime, int noOfSeats) {
        this.route = convertToRoute(stationRoute);
        this.departureTime = departureTime;
        this.noOfSeats = noOfSeats;
    }

    private String convertToRoute(List<Station> stationRoute) {
        StringBuilder sb = new StringBuilder();
        for (Station station : stationRoute) {
            sb.append(station).append(",");
        }
        // Remove the last comma
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
}
