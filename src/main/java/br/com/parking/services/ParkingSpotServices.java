package br.com.parking.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.com.parking.models.ParkingSpot;
import br.com.parking.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotServices {

	final ParkingSpotRepository parkingSpotRepository;

	public ParkingSpotServices(ParkingSpotRepository parkingSpotRepository) {
		this.parkingSpotRepository = parkingSpotRepository;
	}
	
	@Transactional
	public ParkingSpot save(ParkingSpot parkingSpot) {
		return parkingSpotRepository.save(parkingSpot);
	}
	
	
	
}
