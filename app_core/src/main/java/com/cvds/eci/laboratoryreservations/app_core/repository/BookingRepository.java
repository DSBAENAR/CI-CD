package com.cvds.eci.laboratoryreservations.app_core.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cvds.eci.laboratoryreservations.app_core.model.Booking;


public interface BookingRepository extends MongoRepository<Booking, String> {
   /**
    * This function retrieves bookings for a specific lab within a given time range.
    * 
    * @param labId The labId parameter is a String that represents the unique identifier of a
    * laboratory or a specific room within a laboratory.
    * @param finalHour The `finalHour` parameter is a `LocalDateTime` object representing the end time
    * of a booking.
    * @param initHour The `initHour` parameter represents the starting time for a booking. It is of
    * type `LocalDateTime` and is used to filter bookings based on their start time.
    * @return This method returns a list of Booking objects that match the specified labId and have an
    * initial hour less than the provided finalHour and a final hour greater than the provided
    * initHour.
    */
    List<Booking> findByLabIdAndInitHourLessThanAndFinalHourGreaterThan(
        String labId, LocalDateTime finalHour, LocalDateTime initHour
    );
}
